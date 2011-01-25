/**
 * Copyright (C) 2010, Jon-Anders Teigen, Mikko Peltonen
 * Licensed under the new BSD License.
 * See the LICENSE file for details.
 */

import sbt._

class IdeaEnvironment(project: Project) extends BasicEnvironment {
  lazy val projectJdkName = propertyOptional[String]("1.6", true)
  lazy val javaLanguageLevel = propertyOptional[String]("JDK_1_6", true)
  lazy val includeSbtProjectDefinitionModule = propertyOptional[Boolean](true, true)
  lazy val projectOutputPath = propertyLocal[String]
  lazy val excludeLibmanagedFolders = propertyOptional[Boolean](false, true)
  lazy val compileWithIdea = propertyOptional[Boolean](false, true)
  lazy val wildcardResourcePatterns = propertyOptional[String]("?*.properties;?*.xml;?*.gif;?*.png;?*.jpeg;?*.jpg;?*.html;?*.dtd;?*.tld;?*.ftl;?*.properties;?*.xml;?*.html;?*.dtd;?*.tld;?*.gif;?*.png;?*.jpeg;?*.jpg", true)

  def envBackingPath = project.info.builderPath / "idea.properties"
  def log = project.log 
}
