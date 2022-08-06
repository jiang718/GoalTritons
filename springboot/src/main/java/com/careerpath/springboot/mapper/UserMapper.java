package com.careerpath.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.careerpath.springboot.controller.dto.UserAddressDto;
import com.careerpath.springboot.entity.User;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;
//
//import java.util.List;
//import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    // 一对多查询
//    Page<User> findPage(Page<User> page, @Param("nickName") String nickName);
//
//    @Select("select count(id) count, address from user GROUP BY address")
//    List<UserAddressDto> countAddress();
//
//    // 查询用户名
//    @Select("select password from user where username=#{username}")
//    User selectByName(String username);
//
//    @Update("update user set password = #{newPass} where id = #{userId}")
//    int updatePass(Map<String, Object> map);
}
