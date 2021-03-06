/*
 * Created on Apr 15, 2010
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
 * Copyright @2010-2013 the original author or authors.
 */
package org.fest.assertions;

/**
 * Tests for {@link CharAssert#CharAssert(char)} and {@link CharAssert#CharAssert(Character)}.
 *
 * @author Ansgar Konermann
 * @author Alex Ruiz
 */
public class CharAssert_constructorsForPrimitiveAndWrapper_Test extends
    GenericAssert_constructorsForPrimitiveAndWrapper_TestCase<CharAssert, Character> {
  @Override
  protected Class<CharAssert> assertionType() {
    return CharAssert.class;
  }

  @Override
  protected Class<?> primitiveType() {
    return char.class;
  }

  @Override
  protected Class<Character> primitiveWrapperType() {
    return Character.class;
  }
}
