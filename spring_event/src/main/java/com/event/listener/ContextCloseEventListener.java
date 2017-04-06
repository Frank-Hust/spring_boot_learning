package com.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by haoyifen on 2017/3/21  15:31.
 */
@Component
public class ContextCloseEventListener implements ApplicationListener<ContextClosedEvent> {
    private static Logger logger = LoggerFactory.getLogger(ContextCloseEventListener.class);

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.warn("context closed: " + event);
    }
}
