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

package org.openlayers.ol.control;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Map;
import org.openlayers.ol.control.options.OverviewMapControlOptions;
import org.openlayers.ol.events.MapEvent;

/**
 * Create a new control with a map acting as an overview map for an other defined map.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "OverviewMap")
public class OverviewMapControl extends Control {
    @JsConstructor
    public OverviewMapControl() {
        super(new OverviewMapControlOptions());
    }

    @JsConstructor
    public OverviewMapControl(OverviewMapControlOptions options) {
        super(options);
    }

    /**
     * Update the overview map element.
     * @param mapEvent Map event.
     */
    @JsMethod
    public static native void render(MapEvent mapEvent);

    /**
     * Determine if the overview map is collapsed.
     * @return The overview map is collapsed.
     */
    @JsMethod
    public native boolean getCollapsed();

    /**
     * Return true if the overview map is collapsible, false otherwise.
     * @return True if the widget is collapsible.
     */
    @JsMethod
    public native boolean getCollapsible();

    /**
     * Return the overview map.
     * @return Overview map.
     */
    @JsMethod
    public native Map getOverviewMap();

    /**
     * Collapse or expand the overview map according to the passed parameter. Will not do anything if the overview map
     * isn't collapsible or if the current collapsed state is already the one requested.
     * @param collapsed True if the widget is collapsed.
     */
    @JsMethod
    public native void setCollapsed(boolean collapsed);

    /**
     * Set whether the overview map should be collapsible.
     * @param collapsible True if the widget is collapsible.
     */
    @JsMethod
    public native void setCollapsible(boolean collapsible);
}