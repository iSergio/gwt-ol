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

package org.openlayers.ol;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OpenLayersEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        GWT.log("OpenLayers GTW module loaded");
        if (!OpenLayers.isInitialized()) {
            String message = "The Core of OpenLayers (ol.js) JavaScript libraries not loaded.\n" +
                    "If you inherit OpenLayers from NoScript gwt.xml, \nyou need include <script src='..../ol.js'> " +
                    "to load OpenLayers, \nalso you need include necessary css (Example: <link type=\"text/css\" href=\".../ol.css\">.\n" +
                    "By default OpenLayers path is [GWT App Name]/js/OpenLayers";
            GWT.log(message);
        }
    }
}
