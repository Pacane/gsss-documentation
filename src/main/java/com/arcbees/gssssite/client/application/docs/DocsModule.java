package com.arcbees.gssssite.client.application.docs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DocsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DocsPresenter.class, DocsPresenter.MyView.class, DocsView.class,
                DocsPresenter.MyProxy.class);
    }
}
