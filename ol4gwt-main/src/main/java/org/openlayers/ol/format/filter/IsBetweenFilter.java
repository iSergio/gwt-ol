/*
 * Copyright 2017 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openlayers.ol.format.filter;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * Represents a <PropertyIsBetween> comparison operator.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format.filter", name = "IsBetween")
public class IsBetweenFilter extends ComparisonFilter {
    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param lowerBoundary The lower bound of the range.
     * @param upperBoundary The upper bound of the range.
     */
    @JsConstructor
    public IsBetweenFilter(String propertyName, String lowerBoundary, String upperBoundary) {}
}
