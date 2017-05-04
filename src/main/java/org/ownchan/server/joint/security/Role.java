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
