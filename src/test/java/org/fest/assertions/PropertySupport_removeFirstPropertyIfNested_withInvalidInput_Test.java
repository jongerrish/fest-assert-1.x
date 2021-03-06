/*
 * Created on Jun 2, 2010
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

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link PropertySupport#removeFirstPropertyIfNested(String)}.
 *
 * @author Joel Costigliola
 * @author Alex Ruiz
 */
public class PropertySupport_removeFirstPropertyIfNested_withInvalidInput_Test {
  private static PropertySupport propertySupport;

  @BeforeClass
  public static void setUpOnce() {
    propertySupport = PropertySupport.instance();
  }

  @Test
  public void should_return_empty_string_if_given_property_is_not_nested() {
    assertEquals("", propertySupport.removeFirstPropertyIfNested("address"));
  }

  @Test(expected = NullPointerException.class)
  public void should_throw_error_if_property_is_null() {
    propertySupport.removeFirstPropertyIfNested(null);
  }
}
