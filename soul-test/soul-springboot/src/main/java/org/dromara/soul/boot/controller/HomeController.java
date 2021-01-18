package org.dromara.soul.boot.controller;

import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/get")
    @SoulSpringMvcClient(path = "/user/get", desc = "获得用户详细")
    public String getUser(@RequestParam("id") Integer id) {
        logger.info("测试"+id);
        return "DEMO:" + id;
    }


}

