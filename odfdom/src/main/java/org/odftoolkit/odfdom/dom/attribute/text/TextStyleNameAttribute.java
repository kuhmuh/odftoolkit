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
package org.odftoolkit.odfdom.dom.attribute.text;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.element.text.TextAElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextHElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryChapterElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryLinkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryLinkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryPageNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntrySpanElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryTabStopElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexSourceStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextLinenumberingConfigurationElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleBulletElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextNumberedParagraphElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextOutlineLevelStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextRubyElement;
import org.odftoolkit.odfdom.dom.element.text.TextRubyTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextSpanElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexEntryTemplateElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute text:style-name}.
 *
 */
public class TextStyleNameAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "style-name" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute text:style-name}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public TextStyleNameAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute text:style-name}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TextAElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextAlphabeticalIndexElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextAlphabeticalIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextBibliographyElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextBibliographyEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextHElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIllustrationIndexElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIllustrationIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryBibliographyElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryChapterElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryLinkEndElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryLinkStartElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryPageNumberElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntrySpanElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryTabStopElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexEntryTextElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexSourceStyleElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexTitleElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextIndexTitleTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextLinenumberingConfigurationElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextListElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextListLevelStyleBulletElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextListLevelStyleNumberElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextNumberedParagraphElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextObjectIndexElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextObjectIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextOutlineLevelStyleElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextPElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextRubyElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextRubyTextElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextSectionElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextSpanElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextTableIndexElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextTableIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextTableOfContentElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextTableOfContentEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextUserIndexElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}else if( parentElement instanceof TextUserIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					super.setValue(attrValue);
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TextAElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextAlphabeticalIndexElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextAlphabeticalIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextBibliographyElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextBibliographyEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextHElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIllustrationIndexElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIllustrationIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryBibliographyElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryChapterElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryLinkEndElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryLinkStartElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryPageNumberElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntrySpanElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryTabStopElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexEntryTextElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexSourceStyleElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof TextIndexTitleElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextIndexTitleTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextLinenumberingConfigurationElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextListElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextListLevelStyleBulletElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextListLevelStyleNumberElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextNumberedParagraphElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextObjectIndexElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextObjectIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextOutlineLevelStyleElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextPElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextRubyElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextRubyTextElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextSectionElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextSpanElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextTableIndexElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextTableIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextTableOfContentElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextTableOfContentEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextUserIndexElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}else if( parentElement instanceof TextUserIndexEntryTemplateElement ){
					//2DO: need validate value against StyleNameRef
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of text:style-name is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute text:style-name}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute text:style-name} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
