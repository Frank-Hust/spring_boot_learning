package com.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by haoyifen on 2017/3/21  17:18.
 * 表示该run方法应该在spring boot加载完之后运行, 其实可以用于将Spring作为非web应用启动
 */
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(CommandLineRunnerImpl.class);

    @Override
    public void run(String... args) throws Exception {
        logger.warn("ApplicationStartupRunner run method Started !!");
    }
}
