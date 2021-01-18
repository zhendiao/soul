package org.dromara.soul.dubbo.provider;

public interface UserService {

    public  String getUserId(Integer id);

    public Boolean UserIsExist(Integer id);
}
