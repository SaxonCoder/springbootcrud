package com.wys.crud.service;

import com.wys.crud.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.jws.soap.SOAPBinding;

/**
 * @author 11600
 * @description 针对表【user】的数据库操作Service
 * @createDate 2022-04-18 19:26:07
 */
public interface UserService extends IService<User> {
    int addUser(User user);
}
