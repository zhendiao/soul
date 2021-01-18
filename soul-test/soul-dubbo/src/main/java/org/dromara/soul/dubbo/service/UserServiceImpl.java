package org.dromara.soul.dubbo.service;

//import org.apache.dubbo.config.annotation.Service;
import org.dromara.soul.client.dubbo.common.annotation.SoulDubboClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("userService")
@org.apache.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    @SoulDubboClient(path = "/user/get",desc = "获取用户")
    public String getUserId(Integer id) {
        logger.info("用户id"+String.valueOf(id));
        return "用户id为"+id;
    }

    @Override
    @SoulDubboClient(path = "/user/exist",desc = "判断用户是否存在")
    public Boolean UserIsExist(Integer id) {
        logger.info("检验用户是否存在id"+id);
        return true;
    }
}
