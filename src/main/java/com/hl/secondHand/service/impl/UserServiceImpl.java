package com.hl.secondHand.service.impl;

import com.hl.secondHand.entity.User;
import com.hl.secondHand.mapper.UserMapper;
import com.hl.secondHand.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hl
 * @since 2021-06-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
