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

package org.openlayers.ol.geom;

import java.util.HashMap;
import java.util.Map;

/**
 * The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z') or measure ('M') coordinate is available.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum GeometryLayout {
    XY("XY"),
    XYZ("XYZ"),
    XYM("XYM"),
    XYZM("XYZM");

    private final static Map<String, GeometryLayout> ENUM_MAP = new HashMap<>();
    static {
        for (GeometryLayout value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final String value;

    GeometryLayout(String value) {
        this.value = value;
    }

    public static GeometryLayout fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
