package com.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by haoyifen on 2017/3/21  15:31.
 */
//正常关闭时不会调用
@Component
public class ContextStopEventListener implements ApplicationListener<ContextStoppedEvent> {
    private static Logger logger = LoggerFactory.getLogger(ContextStopEventListener.class);
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        logger.warn("context stop "+event);
    }
}
