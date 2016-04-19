package com.smart.blog.controller;

import com.smart.blog.api.BlogBaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * blog base access
 * <p>
 * Created by zhangjinhua on 16-4-8.
 */
@Controller
public class BlogController {

    @Resource
    BlogBaseService blogBaseService;

    @RequestMapping(value = "/getTop10", method = RequestMethod.GET)
    @ResponseBody
    public String getTop10() {
        blogBaseService.test();
        return "我是可爱的小尾巴";
    }
}
