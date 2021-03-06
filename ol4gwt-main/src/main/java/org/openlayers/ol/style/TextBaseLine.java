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

package org.openlayers.ol.style;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum TextBaseLine {
    BOTTOM("bottom"),
    TOP("top"),
    MIDDLE("middle"),
    ALPHABETIC("alphabetic"),
    HANGING("hanging"),
    IDEOGRAPHIC("ideographic");

    private static final Map<String, TextBaseLine> ENUM_MAP = new HashMap<>();
    static {
        for (TextBaseLine textBaseLine : values()) {
            ENUM_MAP.put(textBaseLine.value, textBaseLine);
        }
    }

    private final String value;

    TextBaseLine(String value) {
        this.value = value;
    }

    public static TextBaseLine fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
