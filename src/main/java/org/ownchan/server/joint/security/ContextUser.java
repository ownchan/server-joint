package org.ownchan.server.joint.security;

import org.ownchan.server.joint.persistence.template.UserTemplate;
import org.springframework.security.core.userdetails.UserDetails;

public interface ContextUser extends UserDetails, UserTemplate {

}
