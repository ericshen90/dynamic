package com.eric.sync.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eric.sync.entity.User;
import com.eric.sync.mapper.MasterMapper;
import com.eric.sync.mapper.SlaveMapper;
import com.eric.sync.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author EricShen
 * @date 2018-08-22
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<MasterMapper, User> implements UserService {

  @Resource
  private SlaveMapper slaveMapper;


  @Override
  public List<User> selectMaster() {
    return baseMapper.selectList(new QueryWrapper<>());
  }

  @Override
  public List<User> selectSlave() {
    return slaveMapper.selectList(new QueryWrapper<>());
  }
}
