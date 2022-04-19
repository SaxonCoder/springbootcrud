package com.wys.crud.mapper;

import com.wys.crud.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 11600
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-04-18 19:26:07
 * @Entity com.wys.crud.pojo.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




