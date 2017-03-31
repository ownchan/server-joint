package org.ownchan.server.joint.init;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

public class InitHelper {

  private static final String PROPERTY_CONF_DIR = "confDir";

  private static final String PROPERTY_LOG_DIR = "logDir";

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
