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
package org.odftoolkit.odfdom.incubator.doc.number;

import org.odftoolkit.odfdom.dom.attribute.number.NumberFormatSourceAttribute;
import org.odftoolkit.odfdom.dom.element.number.NumberAmPmElement;
import org.odftoolkit.odfdom.dom.element.number.NumberHoursElement;
import org.odftoolkit.odfdom.dom.element.number.NumberMinutesElement;
import org.odftoolkit.odfdom.dom.element.number.NumberSecondsElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTimeStyleElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;

/**
 * Convenient functionalty for the parent ODF OpenDocument element
 *
 * <p>This class lets you create a date style from a format string. The format string is given in
 * the same form as Java's SimpleDateFormat class.
 *
 * <p>The characters used are:
 *
 * <pre>
 * a 	Am/pm marker         PM
 * H 	Hour in day (0-23)   0
 * k 	Hour in day (1-24)   -- not in ODF
 * K 	Hour in am/pm (0-11) -- not in ODF
 * h 	Hour in am/pm (1-12) -- depends on AM/PM marker
 * m 	Minute in hour       30
 * s 	Second in minute     55
 * S 	Millisecond          -- not in ODF
 * z 	Time zone            -- not in ODF
 * Z 	Time zone RFC822     -- not in ODF
 * </pre>
 */
public class OdfNumberTimeStyle extends NumberTimeStyleElement {

  public OdfNumberTimeStyle(OdfFileDom ownerDoc) {
    super(ownerDoc);
  }

  private String styleName;

  /**
   * Creates a new instance of OdfTimeStyle.
   *
   * @param ownerDoc document that this format belongs to
   * @param format format string for the date/time
   * @param styleName name of this style
   */
  public OdfNumberTimeStyle(OdfFileDom ownerDoc, String format, String styleName) {
    super(ownerDoc);
    this.styleName = styleName;
    buildFromFormat(format);
  }

  /**
   * Creates a <code>&lt;number:time-style&gt;</code> element based upon format.
   *
   * @param format the format for the time
   */
  public void buildFromFormat(String format) {
    String actionChars = "GyQMwdEaHhms";
    int actionCount = 0;

    char ch;
    String textBuffer = "";
    boolean endQuote = false;

    int i = 0;

    this.setStyleNameAttribute(styleName);
    this.setNumberFormatSourceAttribute(NumberFormatSourceAttribute.Value.LANGUAGE.toString());

    while (i < format.length()) {
      ch = format.charAt(i);
      if (actionChars.indexOf(ch) >= 0) {
        appendText(textBuffer);
        textBuffer = "";
        actionCount = 0;
        while (i < format.length() && format.charAt(i) == ch) {
          actionCount++;
          i++;
        }
        processChar(ch, actionCount);
      } else if (ch == '\'') {
        endQuote = false;
        i++;
        while (i < format.length() && (!endQuote)) {
          ch = format.charAt(i);
          if (ch == '\'') // check to see if this is really the end
          {
            if (i + 1 < format.length() && format.charAt(i + 1) == '\'') {
              i++;
              textBuffer += "'";
            } else {
              endQuote = true;
            }
          } else {
            textBuffer += ch;
          }
          i++;
        }
      } else {
        textBuffer += ch;
        i++;
      }
    }
    appendText(textBuffer);
  }

  /**
   * Place pending text into a &lt;number:text&gt; element.
   *
   * @param textBuffer pending text
   */
  private void appendText(String textBuffer) {
    NumberTextElement textElement = null;
    if (!textBuffer.equals("")) {
      textElement = new NumberTextElement((OdfFileDom) this.getOwnerDocument());
      textElement.setTextContent(textBuffer);
      this.appendChild(textElement);
    }
  }

  /**
   * Process a formatting character.
   *
   * @param ch the formatting character to process
   * @param count the number of occurrences of this character
   */
  private void processChar(char ch, int count) {
    OdfFileDom ownerDoc = (OdfFileDom) this.getOwnerDocument();
    switch (ch) {
      case 'a':
        NumberAmPmElement ampm = new NumberAmPmElement(ownerDoc);
        this.appendChild(ampm);
        break;
      case 'H':
      case 'h':
        NumberHoursElement hours = new NumberHoursElement(ownerDoc);
        hours.setNumberStyleAttribute(isLongIf(count > 1));
        this.appendChild(hours);
        break;
      case 'm':
        NumberMinutesElement minutes = new NumberMinutesElement(ownerDoc);
        minutes.setNumberStyleAttribute(isLongIf(count > 1));
        this.appendChild(minutes);
        break;
      case 's':
        NumberSecondsElement seconds = new NumberSecondsElement(ownerDoc);
        seconds.setNumberStyleAttribute(isLongIf(count > 1));
        this.appendChild(seconds);
        break;
    }
  }

  /**
   * Add long or short style to an element.
   *
   * @param isLong true if this is number:style="long"; false if number:style="short"
   * @return the string "long" or "short"
   */
  private String isLongIf(boolean isLong) {
    return ((isLong) ? "long" : "short");
  }
}
