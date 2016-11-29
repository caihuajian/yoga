/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

 // @Generated by gentest/gentest.rb from gentest/fixtures/CSSLayoutFlexTest.html

package com.facebook.csslayout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CSSLayoutFlexTest {
  @Test
  public void test_flex_basis_flex_grow_column() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasis(50f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexGrow(1f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(75f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(75f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_basis_flex_grow_row() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasis(50f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexGrow(1f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(75f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(75f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(25f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(25f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(75f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(25f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_basis_flex_shrink_column() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexShrink(1f);
    root_child0.setFlexBasis(100f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexBasis(50f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_basis_flex_shrink_row() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexShrink(1f);
    root_child0.setFlexBasis(100f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexBasis(50f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_shrink_to_zero() {
    final CSSNode root = new CSSNode();
    root.setHeight(75f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(50f);
    root_child0.setHeight(50f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexShrink(1f);
    root_child1.setWidth(50f);
    root_child1.setHeight(50f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(50f);
    root_child2.setHeight(50f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(50f, root.getLayoutWidth(), 0.0f);
    assertEquals(75f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(50f, root_child2.getLayoutY(), 0.0f);
    assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(50f, root.getLayoutWidth(), 0.0f);
    assertEquals(75f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(50f, root_child2.getLayoutY(), 0.0f);
    assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_basis_overrides_main_size() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasis(50f);
    root_child0.setHeight(20f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexGrow(1f);
    root_child1.setHeight(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setFlexGrow(1f);
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(60f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(60f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_grow_shrink_at_most() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root.addChildAt(root_child0, 0);

    final CSSNode root_child0_child0 = new CSSNode();
    root_child0_child0.setFlexGrow(1f);
    root_child0_child0.setFlexShrink(1f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

}
