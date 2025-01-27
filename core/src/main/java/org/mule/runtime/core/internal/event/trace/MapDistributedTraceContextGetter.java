/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.core.internal.event.trace;

import java.util.Map;
import java.util.Optional;

/**
 * Implementation of {@link DistributedTraceContextGetter} that receives a Map<String, String> to get the data from
 *
 * @since 4.5.0
 */
public class MapDistributedTraceContextGetter implements DistributedTraceContextGetter {

  private Map<String, String> serializedMap;

  public MapDistributedTraceContextGetter(Map<String, String> serializedMap) {
    this.serializedMap = serializedMap;
  }

  @Override
  public Iterable<String> keys() {
    return serializedMap.keySet();
  }

  @Override
  public Optional<String> get(String key) {
    return Optional
        .ofNullable(serializedMap.get(key));
  }
}
