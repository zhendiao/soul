package org.dromara.soul.dubbo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@DubboComponentScan(basePackages = "org.dromara.soul.dubbo.service")
//@ImportResource({"classpath:spring-dubbo.xml"})
public class SoulDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoulDubboApplication.class,args);
    }
}
