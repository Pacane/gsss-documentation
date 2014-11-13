package com.arcbees.gssssite.client.application.docs;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.arcbees.gssssite.client.NameTokens;
import com.arcbees.gssssite.client.application.ApplicationPresenter;

public class DocsPresenter extends Presenter<DocsPresenter.MyView, DocsPresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.DOCS)
    public interface MyProxy extends ProxyPlace<DocsPresenter> {
    }

    @Inject
    public DocsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
    }
}
