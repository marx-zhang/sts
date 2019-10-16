package com.limebike.sys.mapper;

import com.limebike.sys.dto.UserDTO;
import com.limebike.sys.model.User;
import org.mapstruct.Mapper;

/**
 * @author bvvy
 * @date 2019/9/25
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);

}
