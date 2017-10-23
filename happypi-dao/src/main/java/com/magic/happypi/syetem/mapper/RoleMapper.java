package com.magic.happypi.syetem.mapper;

import com.magic.happypi.system.entity.Role;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMapper extends Mapper<Role> {

    List<Role> findRoleByUserId(@Param("userId") String userId);

}