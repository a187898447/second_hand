package com.hl.secondHand.service.impl;

import com.hl.secondHand.entity.Cart;
import com.hl.secondHand.mapper.CartMapper;
import com.hl.secondHand.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
