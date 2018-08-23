package com.eric.sync.controller;

import com.eric.sync.entity.User;
import com.eric.sync.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2018-08-22
 */
@RestController
@RequestMapping("user")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping("master")
  public List<User> master() {
    return userService.selectMaster();
  }

  @GetMapping("slave")
  public List<User> slave() {
    return userService.selectSlave();
  }

}
