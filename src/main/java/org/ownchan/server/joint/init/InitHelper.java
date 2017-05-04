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
package org.ownchan.server.joint.init;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

public class InitHelper {

  public static final String PROPERTY_CONF_DIR = "confDir";

  public static final String PROPERTY_LOG_DIR = "logDir";

  public static final String PROPERTY_APP_MODE = "appMode";

  public static void checkRequiredOwnchanServerSystemProperties() {
    String confDir = FilenameUtils.normalizeNoEndSeparator(System.getProperty(PROPERTY_CONF_DIR));
    String logDir = FilenameUtils.normalizeNoEndSeparator(System.getProperty(PROPERTY_LOG_DIR));

    requireParam(PROPERTY_CONF_DIR, confDir);
    requireParam(PROPERTY_LOG_DIR, logDir);

    System.setProperty(PROPERTY_CONF_DIR, confDir);
    System.setProperty(PROPERTY_LOG_DIR, logDir);
  }

  private static void requireParam(String paramName, String paramValue) {
    if (StringUtils.isBlank(paramValue)) {
      System.err.println(String.format("You did not provide the required JVM system property \"%s\".", paramName));
      System.err.println("Please provide it according to ownchan-server documentation.");
      System.err.println("Application is going to terminate now.");
      System.exit(-1);
    }
  }

}
