/*******************************************************************************
 * @author Stefan Gündhör <stefan@guendhoer.com>
 *
 * @copyright Copyright (c) 2017, Stefan Gündhör <stefan@guendhoer.com>
 * @license AGPL-3.0
 *
 * This code is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License, version 3,
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *******************************************************************************/
package org.ownchan.server.joint.scheduler.service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
public class SchedulerService {

  private static final String MESSAGE_TEMPLATE_PROCESSED = "{} finished; waited for {} cronjob futures, {} failures occurred, took {}";

  public <T> void waitForCronjobFutures(List<Future<T>> futures, String jobName, Logger jobLogger) {
    jobLogger.debug(jobName + " started...");
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();

    long countProcessed = 0;
    long countFailed = 0;
    for (Future<T> future : futures) {
      try {
        // result might be of type Void, so in fact we might not get a result at all ...
        T result = future.get();
        if (result instanceof Boolean && !(Boolean) result) {
          ++countFailed;
        }
      } catch (Exception e) {
        Throwable t = unwrapExecutionExceptionIfPossible(e);
        jobLogger.error(t.getMessage(), t);
        ++countFailed;
      }

      ++countProcessed;
    }

    stopWatch.stop();

    jobLogger.info(MESSAGE_TEMPLATE_PROCESSED,
        jobName,
        countProcessed,
        countFailed,
        DurationFormatUtils.formatDurationHMS(stopWatch.getTotalTimeMillis()));
  }

  private Throwable unwrapExecutionExceptionIfPossible(Exception ex) {
    if (ex instanceof ExecutionException) {
      ExecutionException execEx = (ExecutionException) ex;
      return execEx.getCause();
    }

    return ex;
  }

}
