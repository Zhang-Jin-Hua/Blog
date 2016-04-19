package com.smart.blog.service.impl;

import com.smart.blog.api.BlogBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by zhangjinhua on 16-4-12.
 */
@Service
public class BlogBaseServiceImpl implements BlogBaseService {
    Logger logger = LoggerFactory.getLogger(getClass());

    public void test() {
        logger.info("love day");
    }
}
