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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawMasterPageNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNavOrderAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresentationPageLayoutNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseDateTimeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseFooterNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseHeaderNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateColorElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateMotionElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateTransformElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAudioElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimCommandElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimIterateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimParElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSeqElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSetElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimTransitionFilterElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeFormsElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationAnimationsElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationNotesElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:page}. */
public class DrawPageElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "page");

  /**
   * Create the instance of <code>DrawPageElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawPageElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.DrawingPage,
        OdfName.newName(OdfDocumentNamespace.DRAW, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:page}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawIdAttribute</code> , See
   * {@odf.attribute draw:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawIdAttribute() {
    DrawIdAttribute attr = (DrawIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawIdAttribute</code> , See
   * {@odf.attribute draw:id}
   *
   * @param drawIdValue The type is <code>String</code>
   */
  public void setDrawIdAttribute(String drawIdValue) {
    DrawIdAttribute attr = new DrawIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawMasterPageNameAttribute
   * </code> , See {@odf.attribute draw:master-page-name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawMasterPageNameAttribute() {
    DrawMasterPageNameAttribute attr =
        (DrawMasterPageNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.DRAW, "master-page-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawMasterPageNameAttribute</code> ,
   * See {@odf.attribute draw:master-page-name}
   *
   * @param drawMasterPageNameValue The type is <code>String</code>
   */
  public void setDrawMasterPageNameAttribute(String drawMasterPageNameValue) {
    DrawMasterPageNameAttribute attr =
        new DrawMasterPageNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawMasterPageNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See
   * {@odf.attribute draw:name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawNameAttribute() {
    DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See
   * {@odf.attribute draw:name}
   *
   * @param drawNameValue The type is <code>String</code>
   */
  public void setDrawNameAttribute(String drawNameValue) {
    DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawNavOrderAttribute</code> ,
   * See {@odf.attribute draw:nav-order}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawNavOrderAttribute() {
    DrawNavOrderAttribute attr =
        (DrawNavOrderAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "nav-order");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawNavOrderAttribute</code> , See
   * {@odf.attribute draw:nav-order}
   *
   * @param drawNavOrderValue The type is <code>String</code>
   */
  public void setDrawNavOrderAttribute(String drawNavOrderValue) {
    DrawNavOrderAttribute attr = new DrawNavOrderAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawNavOrderValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawStyleNameAttribute</code> ,
   * See {@odf.attribute draw:style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawStyleNameAttribute() {
    DrawStyleNameAttribute attr =
        (DrawStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See
   * {@odf.attribute draw:style-name}
   *
   * @param drawStyleNameValue The type is <code>String</code>
   */
  public void setDrawStyleNameAttribute(String drawStyleNameValue) {
    DrawStyleNameAttribute attr = new DrawStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawStyleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationPresentationPageLayoutNameAttribute</code> , See {@odf.attribute
   * presentation:presentation-page-layout-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationPresentationPageLayoutNameAttribute() {
    PresentationPresentationPageLayoutNameAttribute attr =
        (PresentationPresentationPageLayoutNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "presentation-page-layout-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>
   * PresentationPresentationPageLayoutNameAttribute</code> , See {@odf.attribute
   * presentation:presentation-page-layout-name}
   *
   * @param presentationPresentationPageLayoutNameValue The type is <code>String</code>
   */
  public void setPresentationPresentationPageLayoutNameAttribute(
      String presentationPresentationPageLayoutNameValue) {
    PresentationPresentationPageLayoutNameAttribute attr =
        new PresentationPresentationPageLayoutNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationPresentationPageLayoutNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationUseDateTimeNameAttribute</code> , See {@odf.attribute
   * presentation:use-date-time-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationUseDateTimeNameAttribute() {
    PresentationUseDateTimeNameAttribute attr =
        (PresentationUseDateTimeNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-date-time-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationUseDateTimeNameAttribute
   * </code> , See {@odf.attribute presentation:use-date-time-name}
   *
   * @param presentationUseDateTimeNameValue The type is <code>String</code>
   */
  public void setPresentationUseDateTimeNameAttribute(String presentationUseDateTimeNameValue) {
    PresentationUseDateTimeNameAttribute attr =
        new PresentationUseDateTimeNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationUseDateTimeNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationUseFooterNameAttribute</code> , See {@odf.attribute presentation:use-footer-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationUseFooterNameAttribute() {
    PresentationUseFooterNameAttribute attr =
        (PresentationUseFooterNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-footer-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationUseFooterNameAttribute
   * </code> , See {@odf.attribute presentation:use-footer-name}
   *
   * @param presentationUseFooterNameValue The type is <code>String</code>
   */
  public void setPresentationUseFooterNameAttribute(String presentationUseFooterNameValue) {
    PresentationUseFooterNameAttribute attr =
        new PresentationUseFooterNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationUseFooterNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationUseHeaderNameAttribute</code> , See {@odf.attribute presentation:use-header-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationUseHeaderNameAttribute() {
    PresentationUseHeaderNameAttribute attr =
        (PresentationUseHeaderNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-header-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationUseHeaderNameAttribute
   * </code> , See {@odf.attribute presentation:use-header-name}
   *
   * @param presentationUseHeaderNameValue The type is <code>String</code>
   */
  public void setPresentationUseHeaderNameAttribute(String presentationUseHeaderNameValue) {
    PresentationUseHeaderNameAttribute attr =
        new PresentationUseHeaderNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationUseHeaderNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
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
   * Create child element {@odf.element anim:animate}.
   *
   * @param smilAttributeNameValue the <code>String</code> value of <code>SmilAttributeNameAttribute
   *     </code>, see {@odf.attribute smil:attributeName} at specification
   * @return the element {@odf.element anim:animate}
   */
  public AnimAnimateElement newAnimAnimateElement(String smilAttributeNameValue) {
    AnimAnimateElement animAnimate =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimAnimateElement.class);
    animAnimate.setSmilAttributeNameAttribute(smilAttributeNameValue);
    this.appendChild(animAnimate);
    return animAnimate;
  }

  /**
   * Create child element {@odf.element anim:animateColor}.
   *
   * @param smilAttributeNameValue the <code>String</code> value of <code>SmilAttributeNameAttribute
   *     </code>, see {@odf.attribute smil:attributeName} at specification
   * @return the element {@odf.element anim:animateColor}
   */
  public AnimAnimateColorElement newAnimAnimateColorElement(String smilAttributeNameValue) {
    AnimAnimateColorElement animAnimateColor =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimAnimateColorElement.class);
    animAnimateColor.setSmilAttributeNameAttribute(smilAttributeNameValue);
    this.appendChild(animAnimateColor);
    return animAnimateColor;
  }

  /**
   * Create child element {@odf.element anim:animateMotion}.
   *
   * @param smilAttributeNameValue the <code>String</code> value of <code>SmilAttributeNameAttribute
   *     </code>, see {@odf.attribute smil:attributeName} at specification
   * @return the element {@odf.element anim:animateMotion}
   */
  public AnimAnimateMotionElement newAnimAnimateMotionElement(String smilAttributeNameValue) {
    AnimAnimateMotionElement animAnimateMotion =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimAnimateMotionElement.class);
    animAnimateMotion.setSmilAttributeNameAttribute(smilAttributeNameValue);
    this.appendChild(animAnimateMotion);
    return animAnimateMotion;
  }

  /**
   * Create child element {@odf.element anim:animateTransform}.
   *
   * @param smilAttributeNameValue the <code>String</code> value of <code>SmilAttributeNameAttribute
   *     </code>, see {@odf.attribute smil:attributeName} at specification
   * @param svgTypeValue the <code>String</code> value of <code>SvgTypeAttribute</code>, see
   *     {@odf.attribute svg:type} at specification
   * @return the element {@odf.element anim:animateTransform}
   */
  public AnimAnimateTransformElement newAnimAnimateTransformElement(
      String smilAttributeNameValue, String svgTypeValue) {
    AnimAnimateTransformElement animAnimateTransform =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimAnimateTransformElement.class);
    animAnimateTransform.setSmilAttributeNameAttribute(smilAttributeNameValue);
    animAnimateTransform.setSvgTypeAttribute(svgTypeValue);
    this.appendChild(animAnimateTransform);
    return animAnimateTransform;
  }

  /**
   * Create child element {@odf.element anim:audio}.
   *
   * @return the element {@odf.element anim:audio}
   */
  public AnimAudioElement newAnimAudioElement() {
    AnimAudioElement animAudio =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimAudioElement.class);
    this.appendChild(animAudio);
    return animAudio;
  }

  /**
   * Create child element {@odf.element anim:command}.
   *
   * @param animCommandValue the <code>String</code> value of <code>AnimCommandAttribute</code>, see
   *     {@odf.attribute anim:command} at specification
   * @return the element {@odf.element anim:command}
   */
  public AnimCommandElement newAnimCommandElement(String animCommandValue) {
    AnimCommandElement animCommand =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimCommandElement.class);
    animCommand.setAnimCommandAttribute(animCommandValue);
    this.appendChild(animCommand);
    return animCommand;
  }

  /**
   * Create child element {@odf.element anim:iterate}.
   *
   * @return the element {@odf.element anim:iterate}
   */
  public AnimIterateElement newAnimIterateElement() {
    AnimIterateElement animIterate =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimIterateElement.class);
    this.appendChild(animIterate);
    return animIterate;
  }

  /**
   * Create child element {@odf.element anim:par}.
   *
   * @return the element {@odf.element anim:par}
   */
  public AnimParElement newAnimParElement() {
    AnimParElement animPar = ((OdfFileDom) this.ownerDocument).newOdfElement(AnimParElement.class);
    this.appendChild(animPar);
    return animPar;
  }

  /**
   * Create child element {@odf.element anim:seq}.
   *
   * @return the element {@odf.element anim:seq}
   */
  public AnimSeqElement newAnimSeqElement() {
    AnimSeqElement animSeq = ((OdfFileDom) this.ownerDocument).newOdfElement(AnimSeqElement.class);
    this.appendChild(animSeq);
    return animSeq;
  }

  /**
   * Create child element {@odf.element anim:set}.
   *
   * @param smilAttributeNameValue the <code>String</code> value of <code>SmilAttributeNameAttribute
   *     </code>, see {@odf.attribute smil:attributeName} at specification
   * @return the element {@odf.element anim:set}
   */
  public AnimSetElement newAnimSetElement(String smilAttributeNameValue) {
    AnimSetElement animSet = ((OdfFileDom) this.ownerDocument).newOdfElement(AnimSetElement.class);
    animSet.setSmilAttributeNameAttribute(smilAttributeNameValue);
    this.appendChild(animSet);
    return animSet;
  }

  /**
   * Create child element {@odf.element anim:transitionFilter}.
   *
   * @param smilTypeValue the <code>String</code> value of <code>SmilTypeAttribute</code>, see
   *     {@odf.attribute smil:type} at specification
   * @return the element {@odf.element anim:transitionFilter}
   */
  public AnimTransitionFilterElement newAnimTransitionFilterElement(String smilTypeValue) {
    AnimTransitionFilterElement animTransitionFilter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(AnimTransitionFilterElement.class);
    animTransitionFilter.setSmilTypeAttribute(smilTypeValue);
    this.appendChild(animTransitionFilter);
    return animTransitionFilter;
  }

  /**
   * Create child element {@odf.element dr3d:scene}.
   *
   * @return the element {@odf.element dr3d:scene}
   */
  public Dr3dSceneElement newDr3dSceneElement() {
    Dr3dSceneElement dr3dScene =
        ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
    this.appendChild(dr3dScene);
    return dr3dScene;
  }

  /**
   * Create child element {@odf.element draw:a}.
   *
   * @param xlinkHrefValue the <code>String</code> value of <code>XlinkHrefAttribute</code>, see
   *     {@odf.attribute xlink:href} at specification
   * @param xlinkTypeValue the <code>String</code> value of <code>XlinkTypeAttribute</code>, see
   *     {@odf.attribute xlink:type} at specification Child element is new in Odf 1.2
   * @return the element {@odf.element draw:a}
   */
  public DrawAElement newDrawAElement(String xlinkHrefValue, String xlinkTypeValue) {
    DrawAElement drawA = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAElement.class);
    drawA.setXlinkHrefAttribute(xlinkHrefValue);
    drawA.setXlinkTypeAttribute(xlinkTypeValue);
    this.appendChild(drawA);
    return drawA;
  }

  /**
   * Create child element {@odf.element draw:caption}.
   *
   * @return the element {@odf.element draw:caption}
   */
  public DrawCaptionElement newDrawCaptionElement() {
    DrawCaptionElement drawCaption =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCaptionElement.class);
    this.appendChild(drawCaption);
    return drawCaption;
  }

  /**
   * Create child element {@odf.element draw:circle}.
   *
   * @return the element {@odf.element draw:circle}
   */
  public DrawCircleElement newDrawCircleElement() {
    DrawCircleElement drawCircle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCircleElement.class);
    this.appendChild(drawCircle);
    return drawCircle;
  }

  /**
   * Create child element {@odf.element draw:connector}.
   *
   * @param svgViewBoxValue the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see
   *     {@odf.attribute svg:viewBox} at specification
   * @return the element {@odf.element draw:connector}
   */
  public DrawConnectorElement newDrawConnectorElement(int svgViewBoxValue) {
    DrawConnectorElement drawConnector =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawConnectorElement.class);
    drawConnector.setSvgViewBoxAttribute(svgViewBoxValue);
    this.appendChild(drawConnector);
    return drawConnector;
  }

  /**
   * Create child element {@odf.element draw:control}.
   *
   * @param drawControlValue the <code>String</code> value of <code>DrawControlAttribute</code>, see
   *     {@odf.attribute draw:control} at specification
   * @return the element {@odf.element draw:control}
   */
  public DrawControlElement newDrawControlElement(String drawControlValue) {
    DrawControlElement drawControl =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawControlElement.class);
    drawControl.setDrawControlAttribute(drawControlValue);
    this.appendChild(drawControl);
    return drawControl;
  }

  /**
   * Create child element {@odf.element draw:custom-shape}.
   *
   * @return the element {@odf.element draw:custom-shape}
   */
  public DrawCustomShapeElement newDrawCustomShapeElement() {
    DrawCustomShapeElement drawCustomShape =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
    this.appendChild(drawCustomShape);
    return drawCustomShape;
  }

  /**
   * Create child element {@odf.element draw:ellipse}.
   *
   * @return the element {@odf.element draw:ellipse}
   */
  public DrawEllipseElement newDrawEllipseElement() {
    DrawEllipseElement drawEllipse =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawEllipseElement.class);
    this.appendChild(drawEllipse);
    return drawEllipse;
  }

  /**
   * Create child element {@odf.element draw:frame}.
   *
   * @return the element {@odf.element draw:frame}
   */
  public DrawFrameElement newDrawFrameElement() {
    DrawFrameElement drawFrame =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawFrameElement.class);
    this.appendChild(drawFrame);
    return drawFrame;
  }

  /**
   * Create child element {@odf.element draw:g}.
   *
   * @return the element {@odf.element draw:g}
   */
  public DrawGElement newDrawGElement() {
    DrawGElement drawG = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawGElement.class);
    this.appendChild(drawG);
    return drawG;
  }

  /**
   * Create child element {@odf.element draw:layer-set}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element draw:layer-set}
   */
  public DrawLayerSetElement newDrawLayerSetElement() {
    DrawLayerSetElement drawLayerSet =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawLayerSetElement.class);
    this.appendChild(drawLayerSet);
    return drawLayerSet;
  }

  /**
   * Create child element {@odf.element draw:line}.
   *
   * @param svgX1Value the <code>String</code> value of <code>SvgX1Attribute</code>, see
   *     {@odf.attribute svg:x1} at specification
   * @param svgX2Value the <code>String</code> value of <code>SvgX2Attribute</code>, see
   *     {@odf.attribute svg:x2} at specification
   * @param svgY1Value the <code>String</code> value of <code>SvgY1Attribute</code>, see
   *     {@odf.attribute svg:y1} at specification
   * @param svgY2Value the <code>String</code> value of <code>SvgY2Attribute</code>, see
   *     {@odf.attribute svg:y2} at specification
   * @return the element {@odf.element draw:line}
   */
  public DrawLineElement newDrawLineElement(
      String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
    DrawLineElement drawLine =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawLineElement.class);
    drawLine.setSvgX1Attribute(svgX1Value);
    drawLine.setSvgX2Attribute(svgX2Value);
    drawLine.setSvgY1Attribute(svgY1Value);
    drawLine.setSvgY2Attribute(svgY2Value);
    this.appendChild(drawLine);
    return drawLine;
  }

  /**
   * Create child element {@odf.element draw:measure}.
   *
   * @param svgX1Value the <code>String</code> value of <code>SvgX1Attribute</code>, see
   *     {@odf.attribute svg:x1} at specification
   * @param svgX2Value the <code>String</code> value of <code>SvgX2Attribute</code>, see
   *     {@odf.attribute svg:x2} at specification
   * @param svgY1Value the <code>String</code> value of <code>SvgY1Attribute</code>, see
   *     {@odf.attribute svg:y1} at specification
   * @param svgY2Value the <code>String</code> value of <code>SvgY2Attribute</code>, see
   *     {@odf.attribute svg:y2} at specification
   * @return the element {@odf.element draw:measure}
   */
  public DrawMeasureElement newDrawMeasureElement(
      String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
    DrawMeasureElement drawMeasure =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawMeasureElement.class);
    drawMeasure.setSvgX1Attribute(svgX1Value);
    drawMeasure.setSvgX2Attribute(svgX2Value);
    drawMeasure.setSvgY1Attribute(svgY1Value);
    drawMeasure.setSvgY2Attribute(svgY2Value);
    this.appendChild(drawMeasure);
    return drawMeasure;
  }

  /**
   * Create child element {@odf.element draw:page-thumbnail}.
   *
   * @return the element {@odf.element draw:page-thumbnail}
   */
  public DrawPageThumbnailElement newDrawPageThumbnailElement() {
    DrawPageThumbnailElement drawPageThumbnail =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
    this.appendChild(drawPageThumbnail);
    return drawPageThumbnail;
  }

  /**
   * Create child element {@odf.element draw:path}.
   *
   * @param svgDValue the <code>String</code> value of <code>SvgDAttribute</code>, see
   *     {@odf.attribute svg:d} at specification
   * @param svgViewBoxValue the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see
   *     {@odf.attribute svg:viewBox} at specification
   * @return the element {@odf.element draw:path}
   */
  public DrawPathElement newDrawPathElement(String svgDValue, int svgViewBoxValue) {
    DrawPathElement drawPath =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPathElement.class);
    drawPath.setSvgDAttribute(svgDValue);
    drawPath.setSvgViewBoxAttribute(svgViewBoxValue);
    this.appendChild(drawPath);
    return drawPath;
  }

  /**
   * Create child element {@odf.element draw:polygon}.
   *
   * @param drawPointsValue the <code>String</code> value of <code>DrawPointsAttribute</code>, see
   *     {@odf.attribute draw:points} at specification
   * @param svgViewBoxValue the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see
   *     {@odf.attribute svg:viewBox} at specification
   * @return the element {@odf.element draw:polygon}
   */
  public DrawPolygonElement newDrawPolygonElement(String drawPointsValue, int svgViewBoxValue) {
    DrawPolygonElement drawPolygon =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolygonElement.class);
    drawPolygon.setDrawPointsAttribute(drawPointsValue);
    drawPolygon.setSvgViewBoxAttribute(svgViewBoxValue);
    this.appendChild(drawPolygon);
    return drawPolygon;
  }

  /**
   * Create child element {@odf.element draw:polyline}.
   *
   * @param drawPointsValue the <code>String</code> value of <code>DrawPointsAttribute</code>, see
   *     {@odf.attribute draw:points} at specification
   * @param svgViewBoxValue the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see
   *     {@odf.attribute svg:viewBox} at specification
   * @return the element {@odf.element draw:polyline}
   */
  public DrawPolylineElement newDrawPolylineElement(String drawPointsValue, int svgViewBoxValue) {
    DrawPolylineElement drawPolyline =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolylineElement.class);
    drawPolyline.setDrawPointsAttribute(drawPointsValue);
    drawPolyline.setSvgViewBoxAttribute(svgViewBoxValue);
    this.appendChild(drawPolyline);
    return drawPolyline;
  }

  /**
   * Create child element {@odf.element draw:rect}.
   *
   * @return the element {@odf.element draw:rect}
   */
  public DrawRectElement newDrawRectElement() {
    DrawRectElement drawRect =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRectElement.class);
    this.appendChild(drawRect);
    return drawRect;
  }

  /**
   * Create child element {@odf.element draw:regular-polygon}.
   *
   * @param drawConcaveValue the <code>Boolean</code> value of <code>DrawConcaveAttribute</code>,
   *     see {@odf.attribute draw:concave} at specification
   * @param drawCornersValue the <code>Integer</code> value of <code>DrawCornersAttribute</code>,
   *     see {@odf.attribute draw:corners} at specification
   * @return the element {@odf.element draw:regular-polygon}
   */
  public DrawRegularPolygonElement newDrawRegularPolygonElement(
      boolean drawConcaveValue, int drawCornersValue) {
    DrawRegularPolygonElement drawRegularPolygon =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
    drawRegularPolygon.setDrawConcaveAttribute(drawConcaveValue);
    drawRegularPolygon.setDrawCornersAttribute(drawCornersValue);
    this.appendChild(drawRegularPolygon);
    return drawRegularPolygon;
  }

  /**
   * Create child element {@odf.element office:forms}.
   *
   * @return the element {@odf.element office:forms}
   */
  public OfficeFormsElement newOfficeFormsElement() {
    OfficeFormsElement officeForms =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeFormsElement.class);
    this.appendChild(officeForms);
    return officeForms;
  }

  /**
   * Create child element {@odf.element presentation:animations}.
   *
   * @return the element {@odf.element presentation:animations}
   */
  public PresentationAnimationsElement newPresentationAnimationsElement() {
    PresentationAnimationsElement presentationAnimations =
        ((OdfFileDom) this.ownerDocument).newOdfElement(PresentationAnimationsElement.class);
    this.appendChild(presentationAnimations);
    return presentationAnimations;
  }

  /**
   * Create child element {@odf.element presentation:notes}.
   *
   * @return the element {@odf.element presentation:notes}
   */
  public PresentationNotesElement newPresentationNotesElement() {
    PresentationNotesElement presentationNotes =
        ((OdfFileDom) this.ownerDocument).newOdfElement(PresentationNotesElement.class);
    this.appendChild(presentationNotes);
    return presentationNotes;
  }

  /**
   * Create child element {@odf.element svg:desc}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element svg:desc}
   */
  public SvgDescElement newSvgDescElement() {
    SvgDescElement svgDesc = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgDescElement.class);
    this.appendChild(svgDesc);
    return svgDesc;
  }

  /**
   * Create child element {@odf.element svg:title}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element svg:title}
   */
  public SvgTitleElement newSvgTitleElement() {
    SvgTitleElement svgTitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(SvgTitleElement.class);
    this.appendChild(svgTitle);
    return svgTitle;
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
