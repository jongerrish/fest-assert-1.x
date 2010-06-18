/*
 * Created on Apr 24, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions;

import org.junit.BeforeClass;

/**
 * Tests for <code>{@link IntAssert#isEqualTo(Integer)}</code>
 *
 * @author Ansgar Konermann
 * @author Alex Ruiz
 */
public class IntAssert_isEqualTo_Integer_Test extends GenericAssert_isEqualTo_TestCase<Integer> {

  private static Integer notNullValue;
  private static Integer unequalValue;

  @BeforeClass
  public static void setUpOnce() {
    notNullValue = 8;
    unequalValue = 9;
  }

  protected IntAssert assertionsFor(Integer actual) {
    return new IntAssert(actual);
  }

  protected Integer notNullValue() {
    return notNullValue;
  }

  protected Integer unequalValue() {
    return unequalValue;
  }
}