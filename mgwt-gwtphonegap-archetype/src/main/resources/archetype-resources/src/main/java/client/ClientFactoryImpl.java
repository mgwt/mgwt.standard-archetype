#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ${package}.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import ${package}.client.activities.CatalogOverViewDisplay;
import ${package}.client.activities.CatalogOverViewDisplayGwtImpl;
import ${package}.client.activities.CatalogView;
import ${package}.client.activities.CatalogViewGwtImpl;
import ${package}.client.activities.CatalogViewerDisplay;
import ${package}.client.activities.CatalogViewerDisplayGwtImpl;

/**
 * @author Daniel Kurka
 * 
 */
public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
	private CatalogOverViewDisplayGwtImpl ${artifactId}OverViewDisplay;
	private CatalogViewGwtImpl ${artifactId}View;
	private CatalogViewerDisplayGwtImpl ${artifactId}ViewerDisplay;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);

	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public CatalogOverViewDisplay getCatalogOverViewDisplay() {
		if (${artifactId}OverViewDisplay == null) {
			${artifactId}OverViewDisplay = new CatalogOverViewDisplayGwtImpl();
		}
		return ${artifactId}OverViewDisplay;
	}

	@Override
	public CatalogView getCatalogView() {
		if (${artifactId}View == null) {
			${artifactId}View = new CatalogViewGwtImpl();
		}
		return ${artifactId}View;
	}

	@Override
	public CatalogViewerDisplay getCatalogViewerDisplay() {
		if (${artifactId}ViewerDisplay == null) {
			${artifactId}ViewerDisplay = new CatalogViewerDisplayGwtImpl();
		}
		return ${artifactId}ViewerDisplay;
	}

}
