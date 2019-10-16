package com.limebike.sys.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author bvvy
 * @date 2019/9/25
 */
@Data

public class UserDTO {
    private String id;
    @NotBlank
    private String username;
    private String nickname;
    private String avatar;
    private String email;

}
