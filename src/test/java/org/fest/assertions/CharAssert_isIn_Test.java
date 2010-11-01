/*
 * Created on Oct 7, 2009
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2009-2010 the original author or authors.
 */
package org.fest.assertions;

/**
 * Tests for <code>{@link CharAssert#isIn(Character... values)}</code> and
 * <code>{@link CharAssert#isIn(java.util.Collection)}</code>.
 * 
 * @author Joel Costigliola
 */
public class CharAssert_isIn_Test extends GenericAssert_isIn_TestCase<Character> {

  @Override
  protected GenericAssert<Character> assertionsFor(Character actual) {
    return new CharAssert(actual);
  }

  @Override
  protected Character notNullValue() {
    return 'a';
  }

  @Override
  public void setUpValuesContainingActual() {
    initValuesContainingActual(notNullValue(), 'b', 'c');
  }

}
