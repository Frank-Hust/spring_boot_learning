package event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by haoyifen on 2017/3/21  15:31.
 */
//和stop一样, 正常时不会调用. 建议使用refresh
@Component
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {
    private static Logger logger = LoggerFactory.getLogger(ContextStartedEventListener.class);
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        logger.warn("context started: "+event);
    }
}
