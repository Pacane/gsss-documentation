package com.arcbees.gssssite.client.resources;

import javax.inject.Inject;

public class ResourceLoader {
    @Inject
    ResourceLoader(
            AppResources appResources) {
        appResources.normalize().ensureInjected();
        appResources.grid().ensureInjected();
        appResources.style().ensureInjected();
    }
}
