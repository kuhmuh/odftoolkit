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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDisabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormForAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormLabelAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormPrintableAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element form:frame}. */
public class FormFrameElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.FORM, "frame");

  /**
   * Create the instance of <code>FormFrameElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public FormFrameElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element form:frame}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormControlImplementationAttribute() {
    FormControlImplementationAttribute attr =
        (FormControlImplementationAttribute)
            getOdfAttribute(OdfDocumentNamespace.FORM, "control-implementation");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute
   * </code> , See {@odf.attribute form:control-implementation}
   *
   * @param formControlImplementationValue The type is <code>String</code>
   */
  public void setFormControlImplementationAttribute(String formControlImplementationValue) {
    FormControlImplementationAttribute attr =
        new FormControlImplementationAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formControlImplementationValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormDisabledAttribute</code> ,
   * See {@odf.attribute form:disabled}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormDisabledAttribute() {
    FormDisabledAttribute attr =
        (FormDisabledAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "disabled");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(FormDisabledAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormDisabledAttribute</code> , See
   * {@odf.attribute form:disabled}
   *
   * @param formDisabledValue The type is <code>Boolean</code>
   */
  public void setFormDisabledAttribute(Boolean formDisabledValue) {
    FormDisabledAttribute attr = new FormDisabledAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formDisabledValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormForAttribute</code> , See
   * {@odf.attribute form:for}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormForAttribute() {
    FormForAttribute attr = (FormForAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "for");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormForAttribute</code> , See
   * {@odf.attribute form:for}
   *
   * @param formForValue The type is <code>String</code>
   */
  public void setFormForAttribute(String formForValue) {
    FormForAttribute attr = new FormForAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formForValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See
   * {@odf.attribute form:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormIdAttribute() {
    FormIdAttribute attr = (FormIdAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See
   * {@odf.attribute form:id}
   *
   * @param formIdValue The type is <code>String</code>
   */
  public void setFormIdAttribute(String formIdValue) {
    FormIdAttribute attr = new FormIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormLabelAttribute</code> , See
   * {@odf.attribute form:label}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormLabelAttribute() {
    FormLabelAttribute attr =
        (FormLabelAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "label");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormLabelAttribute</code> , See
   * {@odf.attribute form:label}
   *
   * @param formLabelValue The type is <code>String</code>
   */
  public void setFormLabelAttribute(String formLabelValue) {
    FormLabelAttribute attr = new FormLabelAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formLabelValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See
   * {@odf.attribute form:name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormNameAttribute() {
    FormNameAttribute attr = (FormNameAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See
   * {@odf.attribute form:name}
   *
   * @param formNameValue The type is <code>String</code>
   */
  public void setFormNameAttribute(String formNameValue) {
    FormNameAttribute attr = new FormNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormPrintableAttribute</code> ,
   * See {@odf.attribute form:printable}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormPrintableAttribute() {
    FormPrintableAttribute attr =
        (FormPrintableAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "printable");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(FormPrintableAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormPrintableAttribute</code> , See
   * {@odf.attribute form:printable}
   *
   * @param formPrintableValue The type is <code>Boolean</code>
   */
  public void setFormPrintableAttribute(Boolean formPrintableValue) {
    FormPrintableAttribute attr = new FormPrintableAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formPrintableValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormTitleAttribute</code> , See
   * {@odf.attribute form:title}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormTitleAttribute() {
    FormTitleAttribute attr =
        (FormTitleAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "title");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormTitleAttribute</code> , See
   * {@odf.attribute form:title}
   *
   * @param formTitleValue The type is <code>String</code>
   */
  public void setFormTitleAttribute(String formTitleValue) {
    FormTitleAttribute attr = new FormTitleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formTitleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> ,
   * See {@odf.attribute xforms:bind}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXformsBindAttribute() {
    XformsBindAttribute attr =
        (XformsBindAttribute) getOdfAttribute(OdfDocumentNamespace.XFORMS, "bind");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See
   * {@odf.attribute xforms:bind}
   *
   * @param xformsBindValue The type is <code>String</code>
   */
  public void setXformsBindAttribute(String xformsBindValue) {
    XformsBindAttribute attr = new XformsBindAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xformsBindValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXmlIdAttribute() {
    XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @param xmlIdValue The type is <code>String</code>
   */
  public void setXmlIdAttribute(String xmlIdValue) {
    XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xmlIdValue);
  }

  /**
   * Create child element {@odf.element form:properties}.
   *
   * @return the element {@odf.element form:properties}
   */
  public FormPropertiesElement newFormPropertiesElement() {
    FormPropertiesElement formProperties =
        ((OdfFileDom) this.ownerDocument).newOdfElement(FormPropertiesElement.class);
    this.appendChild(formProperties);
    return formProperties;
  }

  /**
   * Create child element {@odf.element office:event-listeners}.
   *
   * @return the element {@odf.element office:event-listeners}
   */
  public OfficeEventListenersElement newOfficeEventListenersElement() {
    OfficeEventListenersElement officeEventListeners =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
    this.appendChild(officeEventListeners);
    return officeEventListeners;
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
