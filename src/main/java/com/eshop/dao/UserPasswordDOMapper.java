package com.eshop.dao;

import com.eshop.dataobject.UserPasswordDO;

public interface UserPasswordDOMapper {
    UserPasswordDO selectByUserId(Integer userId);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    UserPasswordDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}