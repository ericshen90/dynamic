package com.eric.sync.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eric.sync.entity.User;
import java.util.List;

/**
 * @author EricShen
 * @date 2018-08-22
 */
public interface UserService extends IService<User> {

  List<User> selectMaster();
  List<User> selectSlave();

}
