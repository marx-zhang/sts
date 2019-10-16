package com.limebike.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.limebike.sys.dao.UserDao;
import com.limebike.sys.dto.UserDTO;
import com.limebike.sys.model.User;
import com.limebike.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bvvy
 * @date 2019/9/23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(UserDTO user) {
        return new User();
    }
}
