package com.codeforge.explore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppStartUpShutDownListener {
    @EventListener()
    public void onApplicationStartUpEvent(ApplicationReadyEvent e){
        log.info("### Application started");
    }

    @EventListener()
    public void onApplicationShutDownEvent(ContextClosedEvent e){
        log.info("### Application stopped");
    }
}
