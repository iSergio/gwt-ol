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

package org.openlayers.ol.layer.options;

import jsinterop.annotations.*;
import org.openlayers.ol.Map;
import org.openlayers.ol.StyleFunction;
import org.openlayers.ol.render.Render;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.style.Style;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class VectorLayerOptions extends LayerOptions {
    /**
     * Render order. Function to be used when sorting features before rendering.
     * By default features are drawn in the order that they are created. Use null to avoid the sort,
     * but get an undefined draw order. Required.
     */
    @JsProperty
    public Render.OrderFunction renderOrder;
    /**
     * Sets the layer as overlay on a map. The map will not manage this layer in its layers collection, and the layer will
     * be rendered on top. This is useful for temporary layers. The standard way to add a layer to a map and have it
     * managed by the map is to use ol.Map#addLayer.
     */
    @JsProperty
    public Map map;
    /**
     * The buffer around the viewport extent used by the renderer when getting features from the vector source for the
     * rendering or hit-detection. Recommended value: the size of the largest symbol, line width or label. Default is 100 pixels.
     */
    @JsProperty
    public double renderBuffer;
    /**
     * Render mode for vector layers:
     * 'image': Vector layers are rendered as images. Great performance, but point symbols and texts are always rotated
     * with the view and pixels are scaled during zoom animations.
     * 'vector': Vector layers are rendered as vectors. Most accurate rendering even during animations, but slower performance.
     * @see VectorRenderType
     */
    @JsProperty
    public String renderMode;
    /**
     * Source. Required.
     */
    @JsProperty
    public VectorSource source;
    /**
     * Layer style. See ol.style for default style which will be used if this is not defined.
     */
    @JsProperty
    public Style[] style;
    /**
     * Layer style. See ol.style for default style which will be used if this is not defined.
     */
    @JsProperty(name = "style")
    public StyleFunction styleFunction;
    /**
     * When set to true, feature batches will be recreated during animations. This means that no vectors will be shown
     * clipped, but the setting will have a performance impact for large amounts of vector data. When set to false,
     * batches will be recreated when no animation is active. Default is false.
     */
    @JsProperty
    public boolean updateWhileAnimating;
    /**
     * When set to true, feature batches will be recreated during interactions. See also updateWhileAnimating. Default is false.
     */
    @JsProperty
    public boolean updateWhileInteracting;

    @JsConstructor
    public VectorLayerOptions() {}
}
