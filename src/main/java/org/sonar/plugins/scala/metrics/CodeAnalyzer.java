/*
 * Sonar Scala Plugin
 * Copyright (C) 2011 Felix Müller
 * felix.mueller.berlin@googlemail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.scala.metrics;

import org.sonar.plugins.scala.language.CodeStatistics;

/**
 * This class implements the computation of basic
 * code metrics for a given Scala source.
 *
 * @author Felix Müller
 * @since 0.1
 */
public class CodeAnalyzer {

  private final String source;

  public CodeAnalyzer(String source) {
    this.source = source;
  }

  public int countTypes() {
    return CodeStatistics.countTypes(source);
  }

  public int countStatements() {
    return CodeStatistics.countStatements(source);
  }
}