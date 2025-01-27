/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.runtime.core.privileged.profiling.tracing;

/**
 * Interface which allows classes to set {@link SpanCustomizationInfo}
 *
 * @since 4.5.0
 */
public interface SpanCustomizationInfoAware {

  void setSpanCustomizationInfo(SpanCustomizationInfo spanCustomizationInfo);
}
