package com.limebike.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.limebike.sys.dto.UserDTO;
import com.limebike.sys.mapper.UserMapper;
import com.limebike.sys.model.User;
import com.limebike.sys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;

/**
 * @author bvvy
 * @date 2019/9/23
 */
@RestController
@RequestMapping("/v1/user")
@Api(tags = "用户")
@Slf4j
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;


    public UserController(UserService userService,
                          UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @ApiOperation("分页")
    @GetMapping("/page")
    public ResponseEntity<IPage<User>> page(Page<User> page) {
        log.debug("page info : {}", page);
        return ResponseEntity.ok(userService.page(page));
    }

    @ApiOperation("添加")
    @PostMapping
    public ResponseEntity add(@Valid @RequestBody UserDTO user, HttpServletRequest request) {
        userService.save(user);
        log.debug("add user : {}", user);
        String url = request.getRequestURI();
        System.out.println(url);
        return ResponseEntity.created(URI.create(url)).body(user);
    }

    @ApiOperation("修改")
    @PutMapping
    public ResponseEntity update(@RequestBody User user) {
        userService.updateById(user);
        log.debug("change user: {}", user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public ResponseEntity delete(@PathVariable Integer id) {
        userService.removeById(id);
        log.debug("remove user id: {}", id);
        return ResponseEntity.noContent().build();
    }
}
