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
package org.ownchan.server.joint.thymeleaf.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Service
public class XmlTemplateService {

  private static final String XML_TEMPLATE_FOLDER = "templates/thymeleaf/xml/";

  private TemplateEngine xmlTemplateEngine;

  public XmlTemplateService() {
    this.xmlTemplateEngine = new TemplateEngine();
    this.xmlTemplateEngine.setTemplateResolver(createXmlTemplateResolver());
  }

  private ITemplateResolver createXmlTemplateResolver() {
    ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
    classLoaderTemplateResolver.setCacheable(true);
    classLoaderTemplateResolver.setTemplateMode("XML");
    classLoaderTemplateResolver.setCharacterEncoding("UTF-8");
    classLoaderTemplateResolver.setPrefix(XML_TEMPLATE_FOLDER);
    classLoaderTemplateResolver.setSuffix(".xml");
    return classLoaderTemplateResolver;
  }

  public TemplateEngine getXmlTemplateEngine() {
    return xmlTemplateEngine;
  }

}
