package hello.service;

import hello.mapper.UserMapper;
import hello.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public  User findOne(int id){
        return userMapper.findOne(id);
    }
}
