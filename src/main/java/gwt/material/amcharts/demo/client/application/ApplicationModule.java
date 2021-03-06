/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.amcharts.demo.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwt.material.amcharts.demo.client.application.api.ApiModule;
import gwt.material.amcharts.demo.client.application.chart.ChartModule;
import gwt.material.amcharts.demo.client.application.home.HomeModule;
import gwt.material.amcharts.demo.client.application.map.MapModule;
import gwt.material.amcharts.demo.client.application.stock.StockModule;

public class
ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new ChartModule());
        install(new MapModule());
        install(new StockModule());
        install(new ApiModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
