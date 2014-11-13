package com.arcbees.gssssite.client;

import com.arcbees.gssssite.client.application.ApplicationModule;
import com.arcbees.gssssite.client.application.home.HomeModule;
import com.arcbees.gssssite.client.application.docs.DocsModule;
import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter;
import com.arcbees.gssssite.client.resources.ResourceLoader;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(DefaultPlaceManager.class, RouteTokenFormatter.class));
        install(new ApplicationModule());
        install(new HomeModule());
        install(new DocsModule());

        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.HOME);

        bindConstant().annotatedWith(RestApplicationPath.class).to("/api");

        bind(ResourceLoader.class).asEagerSingleton();
    }
}
