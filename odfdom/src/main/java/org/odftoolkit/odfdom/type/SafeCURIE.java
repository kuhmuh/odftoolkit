/**
 * **********************************************************************
 *
 * <p>Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * <p>**********************************************************************
 */
package org.odftoolkit.odfdom.type;

import java.util.regex.Pattern;

/** This class represents the in OpenDocument format used data type {@odf.datatype SafeCURIE} */
public class SafeCURIE implements OdfDataType {

  private String mCURIE;
  private static final Pattern safeCURIEPattern =
      Pattern.compile("^\\[(([\\i-[:]][\\c-[:]]*)?:)?.+\\]$");

  /**
   * Construct SafeCURIE by the parsing the given string
   *
   * @param curie The String to be parsed into SafeCURIE
   * @throws IllegalArgumentException if the given argument is not a valid SafeCURIE
   */
  public SafeCURIE(String curie) throws IllegalArgumentException {
    if (!isValid(curie)) {
      throw new IllegalArgumentException("parameter is invalid for datatype SafeCURIE");
    }
    mCURIE = curie;
  }

  /**
   * Returns a String Object representing this SafeCURIE's value
   *
   * @return return a string representation of the value of this SafeCURIE object
   */
  @Override
  public String toString() {
    return mCURIE;
  }

  /**
   * Returns a SafeCURIE instance representing the specified String value
   *
   * @param stringValue a String value
   * @return return a SafeCURIE instance representing stringValue
   */
  public static SafeCURIE valueOf(String stringValue) throws IllegalArgumentException {
    return new SafeCURIE(stringValue);
  }

  /**
   * check if the specified String is a valid {@odf.datatype SafeCURIE} data type
   *
   * @param stringValue the value to be tested
   * @return true if the value of argument is valid for {@odf.datatype SafeCURIE} data type false
   *     otherwise
   */
  public static boolean isValid(String stringValue) {
    if ((stringValue == null)
        || (!safeCURIEPattern.matcher(stringValue).matches() || stringValue.length() < 3)) {
      return false;
    } else {
      return true;
    }
  }
}
