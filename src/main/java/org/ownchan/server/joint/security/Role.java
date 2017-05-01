package org.ownchan.server.joint.security;

public interface Role {

  String NS_ROLE = "ROLE";

  String ROLE_ADMIN_BASE = NS_ROLE + "_ADMIN_BASE";

  String ROLE_CONTRIBUTOR_BASE = NS_ROLE + "_CONTRIBUTOR_BASE";

  /*
   * (+) is the new premium - premium is sooo 2005
   * Might do exclusive stuff like auto-upload, select username color, change displayName, ...
   */
  String ROLE_CONTRIBUTOR_PLUS = NS_ROLE + "_CONTRIBUTOR_PLUS";

  String ROLE_SUPER_BASE = NS_ROLE + "_SUPER_BASE";

  String ROLE_SUPER_COMMENTS = NS_ROLE + "_SUPER_COMMENTS";

  String ROLE_SUPER_CONTENTS = NS_ROLE + "_SUPER_CONTENTS";

  String ROLE_SUPER_NEWS = NS_ROLE + "_SUPER_NEWS";

  String ROLE_SUPER_STATISTICS = NS_ROLE + "_SUPER_STATISTICS";

}
