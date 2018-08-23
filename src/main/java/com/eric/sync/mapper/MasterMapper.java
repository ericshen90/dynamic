package com.eric.sync.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eric.sync.entity.User;

/**
 * @author EricShen
 * @date 2018-08-22
 */
@DS("master")
public interface MasterMapper extends BaseMapper<User> {

}
