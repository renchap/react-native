/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.hermes.reactexecutor

/** Holds runtime configuration for a Hermes VM instance (master or snapshot). */
public class RuntimeConfig {
  public var heapSizeMB: Long = 0L
}
