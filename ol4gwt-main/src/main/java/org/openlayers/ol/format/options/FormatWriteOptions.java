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

package org.openlayers.ol.format.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FormatWriteOptions extends FormatReadOptions {
    /**
     * When writing geometries, follow the right-hand rule for linear ring orientation. This means that polygons will
     * have counter-clockwise exterior rings and clockwise interior rings. By default, coordinates are serialized as
     * they are provided at construction. If true, the right-hand rule will be applied. If false, the left-hand
     * rule will be applied (clockwise for exterior and counter-clockwise for interior rings). Note that not all
     * formats support this. The GeoJSON format does use this property when writing geometries.
     */
    @JsProperty
    public boolean rightHanded;
    /**
     * Maximum number of decimal places for coordinates. Coordinates are stored internally as floats, but floating-point
     * arithmetic can create coordinates with a large number of decimal places, not generally wanted on output.
     * Set a number here to round coordinates. Can also be used to ensure that coordinates read in can be written
     * back out with the same number of decimals. Default is no rounding.
     */
    @JsProperty
    public double decimals;

    @JsConstructor
    public FormatWriteOptions() {}
}
