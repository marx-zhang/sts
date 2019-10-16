package com.limebike.sys.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author bvvy
 * @date 2019/9/23
 */
@Data
@TableName("sys_role")
public class Role {

    @TableId
    private String id;
    private String name;
}
