package hello.service;

import hello.mapper.UserMapper;
import hello.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public  User findOne(int id){
        Class proxyClass = userMapper.getClass();
        LOGGER.info("代理mapper的类名="+proxyClass.getName());
        return userMapper.findOne(id);
    }
}
