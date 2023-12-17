package org.acme;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

public class AppLifecycleBean {
    private static final Logger LOGGER = Logger.getLogger("ListenerBean");

    void onStart(@Observes StartupEvent event) {
        LOGGER.info("The application is starting...");
    }

    void onStop(@Observes ShutdownEvent event) {
        LOGGER.info("The application is stopping...");
    }
}
