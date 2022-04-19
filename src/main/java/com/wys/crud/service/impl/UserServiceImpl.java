package com.wys.crud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wys.crud.pojo.User;
import com.wys.crud.service.UserService;
import com.wys.crud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 11600
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-04-18 19:26:07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Autowired
    UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.insert(user);
    }
}




