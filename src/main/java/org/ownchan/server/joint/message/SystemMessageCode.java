package org.ownchan.server.joint.message;

public interface SystemMessageCode {

  String NS_EX = "system.exception";

  String EX_UNKNOWN = NS_EX + ".unknown";

  String EX_FORBIDDEN = NS_EX + ".forbidden";

  String EX_FORBIDDEN_CONTENT_ADD_PRIVATE_LABEL = EX_FORBIDDEN + ".content.add.private.label";

  String EX_FORBIDDEN_CONTENT_REMOVE_PRIVATE_LABEL = EX_FORBIDDEN + ".content.remove.private.label";

  String EX_FORBIDDEN_CONTENT_REMOVE_PRIVATE_LABELS = EX_FORBIDDEN + ".content.remove.private.labels";

  String EX_FORBIDDEN_CONTENT_FETCH_PRIVATE_LABELS = EX_FORBIDDEN + ".content.fetch.private.labels";

  String EX_FORBIDDEN_CONTENT_ADD_CREATOR_LABEL = EX_FORBIDDEN + ".content.add.creator.label";

  String EX_FORBIDDEN_CONTENT_REMOVE_CREATOR_LABEL = EX_FORBIDDEN + ".content.remove.creator.label";

  String EX_FORBIDDEN_CONTENT_REMOVE_CREATOR_LABELS = EX_FORBIDDEN + ".content.remove.creator.labels";

}
