package com.magic.happypi.syetem.mapper;

import com.magic.happypi.system.entity.User;
import com.magic.happypi.system.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends Mapper<User> {

    List<User> searchPage(Map<String, String> params);


//    @Select("SELECT * FROM user where user_name = #{userName} and password = #{password} AND account_none_locked = 1;")
//    User findByNameAndPassword(User admin);

    User findByNameAndPassword(@Param("userName") String userName, @Param("password") String password);
    UserVo findUserVoByNameAndPassword(@Param("userName") String userName, @Param("password") String password);


}