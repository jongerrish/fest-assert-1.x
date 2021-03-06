/*
 * Created on Jun 18, 2007
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
 * Copyright @2007-2013 the original author or authors.
 */
package org.fest.assertions;

import org.fest.test.ExpectedException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static org.fest.assertions.FailureMessages.notEqual;
import static org.fest.test.ExpectedException.none;

/**
 * Tests for {@link IntAssert#isEqualTo(int)}.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 */
public class IntAssert_isEqualTo_Test implements Assert_isEqualTo_TestCase {
  @Rule
  public ExpectedException thrown = none();

  private static Integer actual;
  private static int notEqualValue;

  private IntAssert assertObject;

  @BeforeClass
  public static void setUpOnce() {
    actual = 6;
    notEqualValue = 8;
  }

  @Before
  public void setUp() {
    assertObject = new IntAssert(actual);
  }

  @Override
  @Test
  public void should_pass_if_actual_and_expected_are_equal() {
    assertObject.isEqualTo(actual.intValue());
  }

  @Override
  @Test
  public void should_fail_if_actual_and_expected_are_not_equal() {
    thrown.expect(AssertionError.class, notEqual(actual, notEqualValue));
    assertObject.isEqualTo(notEqualValue);
  }

  @Override
  @Test
  public void should_fail_and_display_description_if_actual_and_expected_are_not_equal() {
    thrown.expect(AssertionError.class, notEqual("A Test", actual, notEqualValue));
    assertObject.as("A Test").isEqualTo(notEqualValue);
  }

  @Override
  @Test
  public void should_fail_with_custom_message_if_actual_and_expected_are_not_equal() {
    thrown.expect(AssertionError.class, "My custom message");
    assertObject.overridingErrorMessage("My custom message").isEqualTo(notEqualValue);
  }

  @Override
  @Test
  public void should_fail_with_custom_message_ignoring_description_if_actual_and_expected_are_not_equal() {
    thrown.expect(AssertionError.class, "My custom message");
    assertObject.as("A Test").overridingErrorMessage("My custom message").isEqualTo(notEqualValue);
  }
}
