/*
 * Created on Feb 14, 2008
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
 * Copyright @2008-2013 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.assertions.ArrayInspection.copy;
import static org.fest.assertions.ErrorMessages.unexpectedEqual;
import static org.fest.assertions.ErrorMessages.unexpectedNotEqual;

import java.util.Arrays;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Assertions for {@code long} arrays.
 * <p>
 * To create a new instance of this class invoke {@link Assertions#assertThat(long[])}.
 * </p>
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class LongArrayAssert extends ArrayAssert<LongArrayAssert, long[]> {
  /**
   * Creates a new {@link LongArrayAssert}.
   * 
   * @param actual the target to verify.
   */
  protected LongArrayAssert(@Nullable long... actual) {
    super(LongArrayAssert.class, actual);
  }

  /**
   * Verifies that the actual {@code long} array contains the given values.
   * 
   * @param values the values to look for.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code long} array is {@code null}.
   * @throws NullPointerException if the given {@code long} array is {@code null}.
   * @throws AssertionError if the actual {@code long} array does not contain the given values.
   */
  public @Nonnull LongArrayAssert contains(@Nonnull long... values) {
    assertContains(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code long} array contains the given values <strong>only</strong>.
   * 
   * @param values the values to look for.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code long} array is {@code null}.
   * @throws NullPointerException if the given {@code long} array is {@code null}.
   * @throws AssertionError if the actual {@code long} array does not contain the given objects, or if the actual
   *           {@code long} array contains elements other than the ones specified.
   */
  public @Nonnull LongArrayAssert containsOnly(@Nonnull long... values) {
    assertContainsOnly(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code long} array does not contain the given values.
   * 
   * @param values the values the array should exclude.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code long} array is {@code null}.
   * @throws NullPointerException if the given {@code long} array is {@code null}.
   * @throws AssertionError if the actual {@code long} array contains any of the given values.
   */
  public @Nonnull LongArrayAssert excludes(@Nonnull long... values) {
    assertExcludes(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code long} array is equal to the given array. Array equality is checked by
   * {@link Arrays#equals(long[], long[])}.
   * 
   * @param expected the given array to compare the actual array to.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code long} array is not equal to the given one.
   */
  @Override
  public @Nonnull LongArrayAssert isEqualTo(@Nullable long[] expected) {
    if (Arrays.equals(actual, expected)) {
      return this;
    }
    failIfCustomMessageIsSet();
    throw failure(unexpectedNotEqual(actual, expected));
  }

  /**
   * Verifies that the actual {@code long} array is not equal to the given array. Array equality is checked by
   * {@link Arrays#equals(long[], long[])}.
   * 
   * @param array the given array to compare the actual array to.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code long} array is equal to the given one.
   */
  @Override
  public @Nonnull LongArrayAssert isNotEqualTo(@Nullable long[] array) {
    if (!Arrays.equals(actual, array)) {
      return this;
    }
    failIfCustomMessageIsSet();
    throw failure(unexpectedEqual(actual, array));
  }
}
