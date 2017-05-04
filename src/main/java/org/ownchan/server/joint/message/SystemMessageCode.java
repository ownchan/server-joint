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
