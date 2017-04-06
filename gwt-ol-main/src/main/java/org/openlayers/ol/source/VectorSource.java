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

package org.openlayers.ol.source;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Collection;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.Feature;
import org.openlayers.ol.source.options.VectorSourceOptions;

/**
 * Provides a source of features for vector layers. Vector features provided by this source are suitable for editing.
 * See {@link VectorTileSource} for vector data that is optimized for rendering.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "Vector")
public class VectorSource extends Source {
    @JsConstructor
    public VectorSource() {}

    @JsConstructor
    public VectorSource(VectorSourceOptions options) {}

    /**
     * Add a single feature to the source. If you want to add a batch of features at once, call source.addFeatures() instead.
     * @param feature Feature to add.
     */
    @JsMethod
    public native void addFeature(Feature feature);

    /**
     * Add a batch of features to the source.
     * @param features Features to add.
     */
    @JsMethod
    public native void addFeatures(Feature[] features);

    /**
     * Remove all features from the source.
     * @param fast Skip dispatching of removefeature events.
     */
    @JsMethod
    public native void clear(boolean fast);
// TODO: forEachFeature, forEachFeature, forEachFeatureIntersectingExtent
//    forEachFeature(callback, opt_this){S|undefined}
//    forEachFeatureInExtent(extent, callback, opt_this){S|undefined}
//    forEachFeatureIntersectingExtent(extent, callback, opt_this){S|undefined}

    /**
     * Get the closest feature to the provided coordinate.
     *
     * This method is not available when the source is configured with useSpatialIndex set to false.
     * @param coordinate Coordinate.
     * @return Closest feature.
     */
    @JsMethod
    public native Feature getClosestFeatureToCoordinate(Coordinate coordinate);

    /**
     * Get the closest feature to the provided coordinate.
     *
     * This method is not available when the source is configured with useSpatialIndex set to false.
     * @param coordinate Coordinate.
     * @param filter Feature filter function. The filter function will receive one argument,
     *               the feature and it should return a boolean value. By default, no filtering is made.
     * @return Closest feature.
     */
    @JsMethod
    public native Feature getClosestFeatureToCoordinate(Coordinate coordinate, Filter filter);

    /**
     * Get the extent of the features currently in the source.
     *
     * This method is not available when the source is configured with useSpatialIndex set to false.
     * @return Extent.
     */
    @JsMethod
    public native Extent getExtent();

    /**
     * Get a feature by its identifier (the value returned by feature.getId()). Note that the index treats string and
     * numeric identifiers as the same. So source.getFeatureById(2) will return a feature with id '2' or 2.
     * @param id Feature identifier.
     * @return The feature (or null if not found).
     */
    @JsMethod
    public native Feature getFeatureById(String id);

    /**
     * Get all features on the source in random order.
     * @return Features.
     */
    @JsMethod
    public native Feature[] getFeatures();

    /**
     * Get all features whose geometry intersects the provided coordinate.
     * @param coordinate Coordinate.
     * @return Features.
     */
    @JsMethod
    public native Feature[] getFeaturesAtCoordinate(Coordinate coordinate);

    /**
     * Get the features collection associated with this source. Will be null unless the source was configured with
     * useSpatialIndex set to false, or with an ol.Collection as features.
     * @return The collection of features.
     */
    @JsMethod
    public native Collection<Feature> getFeaturesCollection();

    /**
     * Get all features in the provided extent. Note that this returns an array of all features intersecting the
     * given extent in random order (so it may include features whose geometries do not intersect the extent).
     *
     * This method is not available when the source is configured with useSpatialIndex set to false.
     *
     * @param extent Extent.
     * @return Features.
     */
    @JsMethod
    public native Feature[] getFeaturesInExtent(Extent extent);
// TODO: FeatureFormat
//    /**
//     * Get the format associated with this source.
//     * @return The feature format.
//     */
//    @JsMethod
//    public native FeatureFormat getFormat();

    /**
     * Get the url associated with this source.
     * @return The url.
     */
    @JsMethod
    public native String getUrl();
// TODO: FeatureUrlFunction
//    /**
//     * Get the url associated with this source.
//     * @return The url.
//     */
//    @JsMethod
//    public native FeatureUrlFunction getUrlFunction();

    /**
     * Remove a single feature from the source. If you want to remove all features at once, use the source.clear() method instead.
     * @param feature Feature to remove.
     */
    @JsMethod
    public native void removeFeature(Feature feature);

    @JsFunction
    public interface Filter {
        boolean function(Feature feature);
    }
}
