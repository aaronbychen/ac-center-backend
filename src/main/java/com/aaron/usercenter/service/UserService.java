package com.aaron.usercenter.service;

import com.aaron.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author aaronchen
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-06-23 20:09:30
 */
public interface UserService extends IService<User> {
    /**
     * 用户注释
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

}