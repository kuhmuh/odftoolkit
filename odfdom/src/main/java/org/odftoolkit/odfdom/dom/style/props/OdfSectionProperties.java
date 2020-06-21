/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

// !!! GENERATED SOURCE CODE !!!
package org.odftoolkit.odfdom.dom.style.props;

import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfName;

public interface OdfSectionProperties {
  public static final OdfStyleProperty BackgroundColor =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "background-color"));
  public static final OdfStyleProperty MarginLeft =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "margin-left"));
  public static final OdfStyleProperty MarginRight =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "margin-right"));
  public static final OdfStyleProperty Editable =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "editable"));
  public static final OdfStyleProperty Protect =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "protect"));
  public static final OdfStyleProperty WritingMode =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "writing-mode"));
  public static final OdfStyleProperty DontBalanceTextColumns =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "dont-balance-text-columns"));
}
