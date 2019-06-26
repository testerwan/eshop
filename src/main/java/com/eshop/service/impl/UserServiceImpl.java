package com.eshop.service.impl;

import com.eshop.dao.UserDOMapper;
import com.eshop.dao.UserPasswordDOMapper;
import com.eshop.dataobject.UserDO;
import com.eshop.dataobject.UserPasswordDO;
import com.eshop.service.UserService;
import com.eshop.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (null == userDO) {
            return null;
        }
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(id);
        return convertFromDataObject(userDO, userPasswordDO);

    }

    public UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO) {
        if (null == userDO) {
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO, userModel);
        if (null != userPasswordDO) {
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }
        return userModel;
    }
}

