package org.ownchan.server.joint.exception;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.ownchan.server.joint.message.SystemMessageCode;
import org.springframework.http.HttpStatus;

public class ServerException extends RuntimeException {

  private static final long serialVersionUID = 7583179024555913222L;

  private static final String DEFAULT_INTERNAL_MSG = "something went wrong";

  private HttpStatus recommendedResponseStatus;

  private String messageCode;

  private Object[] messageArgs;

  public ServerException(String messageCode, HttpStatus recommendedResponseStatus, Object... messageArgs) {
    super(DEFAULT_INTERNAL_MSG);
    setParams(messageCode, recommendedResponseStatus, messageArgs);
  }

  public ServerException(String messageCode, String internalMessage, HttpStatus recommendedResponseStatus, Object... messageArgs) {
    super(StringUtils.defaultString(internalMessage, DEFAULT_INTERNAL_MSG));
    setParams(messageCode, recommendedResponseStatus, messageArgs);
  }

  public ServerException(String messageCode, String internalMessage, Throwable cause, HttpStatus recommendedResponseStatus, Object... messageArgs) {
    super(StringUtils.defaultString(internalMessage, DEFAULT_INTERNAL_MSG), cause);
    setParams(messageCode, recommendedResponseStatus, messageArgs);
  }

  public ServerException(String messageCode, Throwable cause, HttpStatus recommendedResponseStatus, Object... messageArgs) {
    super(cause != null ? StringUtils.defaultString(cause.getMessage(), DEFAULT_INTERNAL_MSG) : DEFAULT_INTERNAL_MSG, cause);
    setParams(messageCode, recommendedResponseStatus, messageArgs);
  }

  public HttpStatus getRecommendedResponseStatus() {
    return recommendedResponseStatus;
  }

  public String getMessageCode() {
    return messageCode;
  }

  public Object[] getMessageArgs() {
    return messageArgs;
  }

  private void setParams(String messageCode, HttpStatus recommendedResponseStatus, Object[] messageArgs) {
    this.messageCode = ObjectUtils.defaultIfNull(messageCode, SystemMessageCode.EX_UNKNOWN);
    this.recommendedResponseStatus = ObjectUtils.defaultIfNull(recommendedResponseStatus, HttpStatus.INTERNAL_SERVER_ERROR);
    this.messageArgs = ObjectUtils.defaultIfNull(messageArgs, new Object[] {});
  }

}
