package com.chl.pay.service;

import com.chl.common.model.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/16 12:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public Result login() {
        // 调用服务登录
        return null;
    }

    @Override
    public Result loginState() {

        return new Result(Result.USER_LOGIN_STATE_KEEPING,"user keeping login");
    }

    @Override
    public Result logout() {
        return null;
    }
}
