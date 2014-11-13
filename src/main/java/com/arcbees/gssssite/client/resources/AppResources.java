package com.arcbees.gssssite.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.GssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {
    public interface Normalize extends GssResource {
    }

    public interface Style extends GssResource {
        String hidden();

        String invisible();

        String clearfix();

        String header();

        String container();

        String home();

        String content();

        String center();

        String nav();

        String logo();

        String docs();

        String sidebar();

        String myelement();

        String greyed();
    }

    public interface Grid extends GssResource {
        String row();

        String col();

        String col_m_1_4();
        String col_m_1_2();
        String col_m_3_4();
        String col_m_full();
        String col_m_hide();

        String col_t_1_8();
        String col_t_1_4();
        String col_t_3_8();
        String col_t_1_2();
        String col_t_5_8();
        String col_t_3_4();
        String col_t_7_8();
        String col_t_full();
        String col_t_hide();

        String col_1_12();
        String col_1_6();
        String col_1_4();
        String col_1_3();
        String col_5_12();
        String col_1_2();
        String col_7_12();
        String col_2_3();
        String col_3_4();
        String col_5_6();
        String col_11_12();
        String col_full();
        String col_hide();

        String col_t_push_1_4();

        String col_push_1_3();
    }

    @Source("images/gssplusplus_logo.png")
    ImageResource logo();

    @Source("images/gssplusplus_logo_bg.png")
    ImageResource logobg();

    @Source("css/normalize.css")
    public Normalize normalize();

    @Source("css/grid.css")
    public Grid grid();

    @Source({"css/colors.css", "css/mixins.gss", "css/style.css"})
    public Style style();
}
