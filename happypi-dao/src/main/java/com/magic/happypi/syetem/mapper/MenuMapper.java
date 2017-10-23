package com.magic.happypi.syetem.mapper;

import com.magic.happypi.system.entity.Menu;
import com.magic.happypi.system.entity.Role;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface MenuMapper extends Mapper<Menu> {

    List<Menu> findMenuByRoleIds(List<String> roleIds);

    Set<Menu> findMenuByRoles(@Param("roles") Set<Role> roles);
}