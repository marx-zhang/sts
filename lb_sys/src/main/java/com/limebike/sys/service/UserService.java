package com.limebike.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.limebike.sys.dto.UserDTO;
import com.limebike.sys.model.User;

/**
 * @author bvvy
 * @date 2019/9/23
 */
public interface UserService extends IService<User> {
    User save(UserDTO user);
}
