package event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by haoyifen on 2017/3/21  15:31.
 */
@Component
public class ContextRefreshEventLisnter implements ApplicationListener<ContextRefreshedEvent> {
    private static Logger logger = LoggerFactory.getLogger(ContextRefreshEventLisnter.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.warn("context refreshed "+event);
    }
}