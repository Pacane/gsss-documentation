package com.arcbees.gssssite.client.application.docs;

import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import static com.google.gwt.query.client.GQuery.$;

import javax.inject.Inject;

public class DocsView extends ViewImpl implements DocsPresenter.MyView, AttachEvent.Handler {
    interface Binder extends UiBinder<Widget, DocsView> {
    }

    @UiField
    Object docMenu;

    @Inject
    DocsView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        asWidget().addAttachHandler(this);
        bind();
    }

    @Override
    public void onAttachOrDetach(AttachEvent attachEvent) {
        if(attachEvent.isAttached()) {
            String url = Window.Location.getHref();
            String[] urlData = url.split("details=");
            if(urlData[1] != null){
                goTo("#" + urlData[1]);
            }
        }
     }

    private void bind() {
        $(docMenu).find("a").click(new Function() {
            @Override
            public boolean f(Event e) {
                String href = $(this).attr("href").replace("/docs?details=", "");
                goTo(href);
                return true;
            }
        });
    }

    private void goTo(String h) {
        $("html, body").scrollTop($(h).offset().top);
    }
}
