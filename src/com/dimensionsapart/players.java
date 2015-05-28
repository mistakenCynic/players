package com.dimensionsapart;

/**
 * Created by mistakenCynic on 5/25/2015.
 */

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;


@Plugin(id = "Players", name = "Players", version = "0.1")
public class players {

    @Inject
    private Logger log;

    @Subscribe
    public void onServerStart(ServerStartedEvent event) {
        log.info("The players plugin has started");
    }





    @Subscribe
    public void onServerStop(ServerStoppingEvent event) {
        log.info("The players plugin has stopped.");
    }

}