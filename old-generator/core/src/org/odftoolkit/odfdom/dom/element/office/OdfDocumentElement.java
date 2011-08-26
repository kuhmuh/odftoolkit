/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;

import org.odftoolkit.odfdom.dom.element.meta.OdfGeneratorElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfTitleElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfDescriptionElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfSubjectElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfKeywordElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfInitialCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfCreatorElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfPrintedByElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfCreationDateElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfDateElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfPrintDateElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfTemplateElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfAutoReloadElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfHyperlinkBehaviourElement;
import org.odftoolkit.odfdom.dom.element.dc.OdfLanguageElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfEditingCyclesElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfEditingDurationElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfDocumentStatisticElement;
import org.odftoolkit.odfdom.dom.element.meta.OdfUserDefinedElement;
import org.odftoolkit.odfdom.dom.type.meta.OdfValueType;
import org.odftoolkit.odfdom.dom.element.config.OdfConfigItemSetElement;
import org.odftoolkit.odfdom.dom.element.style.OdfFontFaceElement;
import org.odftoolkit.odfdom.dom.element.style.OdfStyleElement;
import org.odftoolkit.odfdom.dom.element.text.OdfListStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfNumberStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfCurrencyStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfPercentageStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfDateStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfTimeStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfBooleanStyleElement;
import org.odftoolkit.odfdom.dom.element.number.OdfTextStyleElement;
import org.odftoolkit.odfdom.dom.element.style.OdfDefaultStyleElement;
import org.odftoolkit.odfdom.dom.element.style.OdfDefaultPageLayoutElement;
import org.odftoolkit.odfdom.dom.element.text.OdfOutlineStyleElement;
import org.odftoolkit.odfdom.dom.element.text.OdfNotesConfigurationElement;
import org.odftoolkit.odfdom.dom.type.text.OdfNoteClassType;
import org.odftoolkit.odfdom.dom.element.text.OdfBibliographyConfigurationElement;
import org.odftoolkit.odfdom.dom.element.text.OdfLinenumberingConfigurationElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfGradientElement;
import org.odftoolkit.odfdom.dom.type.draw.OdfGradientStyleType;
import org.odftoolkit.odfdom.dom.element.svg.OdfLineargradientElement;
import org.odftoolkit.odfdom.dom.element.svg.OdfRadialgradientElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfHatchElement;
import org.odftoolkit.odfdom.dom.type.draw.OdfHatchStyleType;
import org.odftoolkit.odfdom.dom.element.draw.OdfFillImageElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfMarkerElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfStrokeDashElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfOpacityElement;
import org.odftoolkit.odfdom.dom.element.style.OdfPresentationPageLayoutElement;
import org.odftoolkit.odfdom.dom.element.style.OdfPageLayoutElement;
import org.odftoolkit.odfdom.dom.element.style.OdfMasterPageElement;
import org.odftoolkit.odfdom.dom.element.style.OdfHandoutMasterElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfLayerSetElement;
import org.odftoolkit.odfdom.dom.element.table.OdfTableTemplateElement;
import org.odftoolkit.odfdom.dom.type.table.OdfRowOrColumnType;

/**
 * ODF DOM Element implementation for element "<office:document>".
 */
public abstract class OdfDocumentElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.OFFICE, "document" );

    public OdfDocumentElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aMimetype, String _aVersion)
    {
        setMimetype( _aMimetype );
        setVersion( _aVersion );
    }

    /**
     * Get value of attribute "office:mimetype".
     */
    public String getMimetype()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "mimetype" ) );
    }

    /**
     * Set value of attribute "office:mimetype".
     */
    public void setMimetype( String _aMimetype )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "mimetype" ), _aMimetype );
    }

    /**
     * Get value of attribute "office:version".
     */
    public String getVersion()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ) );
    }

    /**
     * Set value of attribute "office:version".
     */
    public void setVersion( String _aVersion )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ), _aVersion );
    }

    /**
     * Get value of attribute "grddl:transformation".
     */
    public String getTransformation()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.GRDDL, "transformation" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "grddl:transformation".
     */
    public void setTransformation( String _aTransformation )
    {                    
        String aStringVal = OdfAnyURI.toString( _aTransformation );
        setOdfAttribute( OdfName.get( OdfNamespace.GRDDL, "transformation" ), aStringVal );
    }

    /**
    * Create child element "meta:generator".
    */
    public OdfGeneratorElement createGeneratorElement()
    {
        OdfGeneratorElement  _nGenerator = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGeneratorElement.class);
        this.appendChild( _nGenerator);
        return  _nGenerator;
    }                   
               
    /**
    * Create child element "dc:title".
    */
    public OdfTitleElement createTitleElement()
    {
        OdfTitleElement  _nTitle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTitleElement.class);
        this.appendChild( _nTitle);
        return  _nTitle;
    }                   
               
    /**
    * Create child element "dc:description".
    */
    public OdfDescriptionElement createDescriptionElement()
    {
        OdfDescriptionElement  _nDescription = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDescriptionElement.class);
        this.appendChild( _nDescription);
        return  _nDescription;
    }                   
               
    /**
    * Create child element "dc:subject".
    */
    public OdfSubjectElement createSubjectElement()
    {
        OdfSubjectElement  _nSubject = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSubjectElement.class);
        this.appendChild( _nSubject);
        return  _nSubject;
    }                   
               
    /**
    * Create child element "meta:keyword".
    */
    public OdfKeywordElement createKeywordElement()
    {
        OdfKeywordElement  _nKeyword = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfKeywordElement.class);
        this.appendChild( _nKeyword);
        return  _nKeyword;
    }                   
               
    /**
    * Create child element "meta:initial-creator".
    */
    public OdfInitialCreatorElement createInitialCreatorElement()
    {
        OdfInitialCreatorElement  _nInitialCreator = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfInitialCreatorElement.class);
        this.appendChild( _nInitialCreator);
        return  _nInitialCreator;
    }                   
               
    /**
    * Create child element "dc:creator".
    */
    public OdfCreatorElement createCreatorElement()
    {
        OdfCreatorElement  _nCreator = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCreatorElement.class);
        this.appendChild( _nCreator);
        return  _nCreator;
    }                   
               
    /**
    * Create child element "meta:printed-by".
    */
    public OdfPrintedByElement createPrintedByElement()
    {
        OdfPrintedByElement  _nPrintedBy = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPrintedByElement.class);
        this.appendChild( _nPrintedBy);
        return  _nPrintedBy;
    }                   
               
    /**
    * Create child element "meta:creation-date".
    */
    public OdfCreationDateElement createCreationDateElement()
    {
        OdfCreationDateElement  _nCreationDate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCreationDateElement.class);
        this.appendChild( _nCreationDate);
        return  _nCreationDate;
    }                   
               
    /**
    * Create child element "dc:date".
    */
    public OdfDateElement createDateElement()
    {
        OdfDateElement  _nDate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDateElement.class);
        this.appendChild( _nDate);
        return  _nDate;
    }                   
               
    /**
    * Create child element "meta:print-date".
    */
    public OdfPrintDateElement createPrintDateElement()
    {
        OdfPrintDateElement  _nPrintDate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPrintDateElement.class);
        this.appendChild( _nPrintDate);
        return  _nPrintDate;
    }                   
               
    /**
    * Create child element "meta:template".
    */
    public OdfTemplateElement createTemplateElement(String   _aHref)
    {
        OdfTemplateElement  _nTemplate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTemplateElement.class);
        _nTemplate.setHref( _aHref);
        this.appendChild( _nTemplate);
        return  _nTemplate;      
    }
    
    /**
    * Create child element "meta:auto-reload".
    */
    public OdfAutoReloadElement createAutoReloadElement()
    {
        OdfAutoReloadElement  _nAutoReload = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAutoReloadElement.class);
        this.appendChild( _nAutoReload);
        return  _nAutoReload;
    }                   
               
    /**
    * Create child element "meta:hyperlink-behaviour".
    */
    public OdfHyperlinkBehaviourElement createHyperlinkBehaviourElement()
    {
        OdfHyperlinkBehaviourElement  _nHyperlinkBehaviour = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfHyperlinkBehaviourElement.class);
        this.appendChild( _nHyperlinkBehaviour);
        return  _nHyperlinkBehaviour;
    }                   
               
    /**
    * Create child element "dc:language".
    */
    public OdfLanguageElement createLanguageElement()
    {
        OdfLanguageElement  _nLanguage = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfLanguageElement.class);
        this.appendChild( _nLanguage);
        return  _nLanguage;
    }                   
               
    /**
    * Create child element "meta:editing-cycles".
    */
    public OdfEditingCyclesElement createEditingCyclesElement()
    {
        OdfEditingCyclesElement  _nEditingCycles = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEditingCyclesElement.class);
        this.appendChild( _nEditingCycles);
        return  _nEditingCycles;
    }                   
               
    /**
    * Create child element "meta:editing-duration".
    */
    public OdfEditingDurationElement createEditingDurationElement()
    {
        OdfEditingDurationElement  _nEditingDuration = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEditingDurationElement.class);
        this.appendChild( _nEditingDuration);
        return  _nEditingDuration;
    }                   
               
    /**
    * Create child element "meta:document-statistic".
    */
    public OdfDocumentStatisticElement createDocumentStatisticElement()
    {
        OdfDocumentStatisticElement  _nDocumentStatistic = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDocumentStatisticElement.class);
        this.appendChild( _nDocumentStatistic);
        return  _nDocumentStatistic;
    }                   
               
    /**
    * Create child element "meta:user-defined".
    */
    public OdfUserDefinedElement createUserDefinedElement(OdfValueType   _aValueType, String   _aName)
    {
        OdfUserDefinedElement  _nUserDefined = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserDefinedElement.class);
        _nUserDefined.setValueType( _aValueType);
        _nUserDefined.setName( _aName);
        this.appendChild( _nUserDefined);
        return  _nUserDefined;      
    }
    
    /**
    * Create child element "config:config-item-set".
    */
    public OdfConfigItemSetElement createConfigItemSetElement(String   _aName)
    {
        OdfConfigItemSetElement  _nConfigItemSet = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfConfigItemSetElement.class);
        _nConfigItemSet.setName( _aName);
        this.appendChild( _nConfigItemSet);
        return  _nConfigItemSet;      
    }
    
    /**
    * Create child element "office:script".
    */
    public OdfScriptElement createScriptElement(String   _aLanguage)
    {
        OdfScriptElement  _nScript = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfScriptElement.class);
        _nScript.setLanguage( _aLanguage);
        this.appendChild( _nScript);
        return  _nScript;      
    }
    
    /**
    * Create child element "office:event-listeners".
    */
    public OdfEventListenersElement createEventListenersElement()
    {
        OdfEventListenersElement  _nEventListeners = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEventListenersElement.class);
        this.appendChild( _nEventListeners);
        return  _nEventListeners;
    }                   
               
    /**
    * Create child element "style:font-face".
    */
    public OdfFontFaceElement createFontFaceElement(String   _aName)
    {
        OdfFontFaceElement  _nFontFace = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfFontFaceElement.class);
        _nFontFace.setName( _aName);
        this.appendChild( _nFontFace);
        return  _nFontFace;      
    }
    
    /**
    * Create child element "style:style".
    */
    public OdfStyleElement createStyleElement(String   _aName)
    {
        OdfStyleElement  _nStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfStyleElement.class);
        _nStyle.setName( _aName);
        this.appendChild( _nStyle);
        return  _nStyle;      
    }
    
    /**
    * Create child element "text:list-style".
    */
    public OdfListStyleElement createListStyleElement(String   _aName)
    {
        OdfListStyleElement  _nListStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfListStyleElement.class);
        _nListStyle.setName( _aName);
        this.appendChild( _nListStyle);
        return  _nListStyle;      
    }
    
    /**
    * Create child element "number:number-style".
    */
    public OdfNumberStyleElement createNumberStyleElement(String   _aName)
    {
        OdfNumberStyleElement  _nNumberStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfNumberStyleElement.class);
        _nNumberStyle.setName( _aName);
        this.appendChild( _nNumberStyle);
        return  _nNumberStyle;      
    }
    
    /**
    * Create child element "number:currency-style".
    */
    public OdfCurrencyStyleElement createCurrencyStyleElement(String   _aName)
    {
        OdfCurrencyStyleElement  _nCurrencyStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCurrencyStyleElement.class);
        _nCurrencyStyle.setName( _aName);
        this.appendChild( _nCurrencyStyle);
        return  _nCurrencyStyle;      
    }
    
    /**
    * Create child element "number:percentage-style".
    */
    public OdfPercentageStyleElement createPercentageStyleElement(String   _aName)
    {
        OdfPercentageStyleElement  _nPercentageStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPercentageStyleElement.class);
        _nPercentageStyle.setName( _aName);
        this.appendChild( _nPercentageStyle);
        return  _nPercentageStyle;      
    }
    
    /**
    * Create child element "number:date-style".
    */
    public OdfDateStyleElement createDateStyleElement(String   _aName)
    {
        OdfDateStyleElement  _nDateStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDateStyleElement.class);
        _nDateStyle.setName( _aName);
        this.appendChild( _nDateStyle);
        return  _nDateStyle;      
    }
    
    /**
    * Create child element "number:time-style".
    */
    public OdfTimeStyleElement createTimeStyleElement(String   _aName)
    {
        OdfTimeStyleElement  _nTimeStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTimeStyleElement.class);
        _nTimeStyle.setName( _aName);
        this.appendChild( _nTimeStyle);
        return  _nTimeStyle;      
    }
    
    /**
    * Create child element "number:boolean-style".
    */
    public OdfBooleanStyleElement createBooleanStyleElement(String   _aName)
    {
        OdfBooleanStyleElement  _nBooleanStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfBooleanStyleElement.class);
        _nBooleanStyle.setName( _aName);
        this.appendChild( _nBooleanStyle);
        return  _nBooleanStyle;      
    }
    
    /**
    * Create child element "number:text-style".
    */
    public OdfTextStyleElement createTextStyleElement(String   _aName)
    {
        OdfTextStyleElement  _nTextStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTextStyleElement.class);
        _nTextStyle.setName( _aName);
        this.appendChild( _nTextStyle);
        return  _nTextStyle;      
    }
    
    /**
    * Create child element "style:default-style".
    */
    public OdfDefaultStyleElement createDefaultStyleElement()
    {
        OdfDefaultStyleElement  _nDefaultStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDefaultStyleElement.class);
        this.appendChild( _nDefaultStyle);
        return  _nDefaultStyle;
    }                   
               
    /**
    * Create child element "style:default-page-layout".
    */
    public OdfDefaultPageLayoutElement createDefaultPageLayoutElement()
    {
        OdfDefaultPageLayoutElement  _nDefaultPageLayout = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDefaultPageLayoutElement.class);
        this.appendChild( _nDefaultPageLayout);
        return  _nDefaultPageLayout;
    }                   
               
    /**
    * Create child element "text:outline-style".
    */
    public OdfOutlineStyleElement createOutlineStyleElement(String   _aName)
    {
        OdfOutlineStyleElement  _nOutlineStyle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfOutlineStyleElement.class);
        _nOutlineStyle.setName( _aName);
        this.appendChild( _nOutlineStyle);
        return  _nOutlineStyle;      
    }
    
    /**
    * Create child element "text:notes-configuration".
    */
    public OdfNotesConfigurationElement createNotesConfigurationElement(OdfNoteClassType   _aNoteClass)
    {
        OdfNotesConfigurationElement  _nNotesConfiguration = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfNotesConfigurationElement.class);
        _nNotesConfiguration.setNoteClass( _aNoteClass);
        this.appendChild( _nNotesConfiguration);
        return  _nNotesConfiguration;      
    }
    
    /**
    * Create child element "text:bibliography-configuration".
    */
    public OdfBibliographyConfigurationElement createBibliographyConfigurationElement()
    {
        OdfBibliographyConfigurationElement  _nBibliographyConfiguration = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfBibliographyConfigurationElement.class);
        this.appendChild( _nBibliographyConfiguration);
        return  _nBibliographyConfiguration;
    }                   
               
    /**
    * Create child element "text:linenumbering-configuration".
    */
    public OdfLinenumberingConfigurationElement createLinenumberingConfigurationElement()
    {
        OdfLinenumberingConfigurationElement  _nLinenumberingConfiguration = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfLinenumberingConfigurationElement.class);
        this.appendChild( _nLinenumberingConfiguration);
        return  _nLinenumberingConfiguration;
    }                   
               
    /**
    * Create child element "draw:gradient".
    */
    public OdfGradientElement createGradientElement(OdfGradientStyleType   _aStyle)
    {
        OdfGradientElement  _nGradient = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGradientElement.class);
        _nGradient.setStyle( _aStyle);
        this.appendChild( _nGradient);
        return  _nGradient;      
    }
    
    /**
    * Create child element "svg:linearGradient".
    */
    public OdfLineargradientElement createLineargradientElement(String   _aName)
    {
        OdfLineargradientElement  _nLineargradient = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfLineargradientElement.class);
        _nLineargradient.setName( _aName);
        this.appendChild( _nLineargradient);
        return  _nLineargradient;      
    }
    
    /**
    * Create child element "svg:radialGradient".
    */
    public OdfRadialgradientElement createRadialgradientElement(String   _aName)
    {
        OdfRadialgradientElement  _nRadialgradient = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRadialgradientElement.class);
        _nRadialgradient.setName( _aName);
        this.appendChild( _nRadialgradient);
        return  _nRadialgradient;      
    }
    
    /**
    * Create child element "draw:hatch".
    */
    public OdfHatchElement createHatchElement(String   _aName, OdfHatchStyleType   _aStyle)
    {
        OdfHatchElement  _nHatch = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfHatchElement.class);
        _nHatch.setName( _aName);
        _nHatch.setStyle( _aStyle);
        this.appendChild( _nHatch);
        return  _nHatch;      
    }
    
    /**
    * Create child element "draw:fill-image".
    */
    public OdfFillImageElement createFillImageElement(String   _aName, String   _aHref)
    {
        OdfFillImageElement  _nFillImage = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfFillImageElement.class);
        _nFillImage.setName( _aName);
        _nFillImage.setHref( _aHref);
        this.appendChild( _nFillImage);
        return  _nFillImage;      
    }
    
    /**
    * Create child element "draw:marker".
    */
    public OdfMarkerElement createMarkerElement(String   _aName, Integer   _aViewbox, String   _aD)
    {
        OdfMarkerElement  _nMarker = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfMarkerElement.class);
        _nMarker.setName( _aName);
        _nMarker.setViewbox( _aViewbox);
        _nMarker.setD( _aD);
        this.appendChild( _nMarker);
        return  _nMarker;      
    }
    
    /**
    * Create child element "draw:stroke-dash".
    */
    public OdfStrokeDashElement createStrokeDashElement(String   _aName)
    {
        OdfStrokeDashElement  _nStrokeDash = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfStrokeDashElement.class);
        _nStrokeDash.setName( _aName);
        this.appendChild( _nStrokeDash);
        return  _nStrokeDash;      
    }
    
    /**
    * Create child element "draw:opacity".
    */
    public OdfOpacityElement createOpacityElement(OdfGradientStyleType   _aStyle)
    {
        OdfOpacityElement  _nOpacity = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfOpacityElement.class);
        _nOpacity.setStyle( _aStyle);
        this.appendChild( _nOpacity);
        return  _nOpacity;      
    }
    
    /**
    * Create child element "style:presentation-page-layout".
    */
    public OdfPresentationPageLayoutElement createPresentationPageLayoutElement(String   _aName)
    {
        OdfPresentationPageLayoutElement  _nPresentationPageLayout = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPresentationPageLayoutElement.class);
        _nPresentationPageLayout.setName( _aName);
        this.appendChild( _nPresentationPageLayout);
        return  _nPresentationPageLayout;      
    }
    
    /**
    * Create child element "style:page-layout".
    */
    public OdfPageLayoutElement createPageLayoutElement(String   _aName)
    {
        OdfPageLayoutElement  _nPageLayout = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPageLayoutElement.class);
        _nPageLayout.setName( _aName);
        this.appendChild( _nPageLayout);
        return  _nPageLayout;      
    }
    
    /**
    * Create child element "style:master-page".
    */
    public OdfMasterPageElement createMasterPageElement(String   _aName, String   _aPageLayoutName)
    {
        OdfMasterPageElement  _nMasterPage = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfMasterPageElement.class);
        _nMasterPage.setName( _aName);
        _nMasterPage.setPageLayoutName( _aPageLayoutName);
        this.appendChild( _nMasterPage);
        return  _nMasterPage;      
    }
    
    /**
    * Create child element "style:handout-master".
    */
    public OdfHandoutMasterElement createHandoutMasterElement(String   _aPageLayoutName)
    {
        OdfHandoutMasterElement  _nHandoutMaster = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfHandoutMasterElement.class);
        _nHandoutMaster.setPageLayoutName( _aPageLayoutName);
        this.appendChild( _nHandoutMaster);
        return  _nHandoutMaster;      
    }
    
    /**
    * Create child element "draw:layer-set".
    */
    public OdfLayerSetElement createLayerSetElement()
    {
        OdfLayerSetElement  _nLayerSet = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfLayerSetElement.class);
        this.appendChild( _nLayerSet);
        return  _nLayerSet;
    }                   
               
    /**
    * Create child element "table:table-template".
    */
    public OdfTableTemplateElement createTableTemplateElement(String   _aName, OdfRowOrColumnType   _aFirstRowStartColumn, OdfRowOrColumnType   _aFirstRowEndColumn, OdfRowOrColumnType   _aLastRowStartColumn, OdfRowOrColumnType   _aLastRowEndColumn)
    {
        OdfTableTemplateElement  _nTableTemplate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableTemplateElement.class);
        _nTableTemplate.setName( _aName);
        _nTableTemplate.setFirstRowStartColumn( _aFirstRowStartColumn);
        _nTableTemplate.setFirstRowEndColumn( _aFirstRowEndColumn);
        _nTableTemplate.setLastRowStartColumn( _aLastRowStartColumn);
        _nTableTemplate.setLastRowEndColumn( _aLastRowEndColumn);
        this.appendChild( _nTableTemplate);
        return  _nTableTemplate;      
    }
    
    /**
    * Create child element "office:body".
    */
    public OdfBodyElement createBodyElement()
    {
        OdfBodyElement  _nBody = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfBodyElement.class);
        this.appendChild( _nBody);
        return  _nBody;
    }                   
               
}
