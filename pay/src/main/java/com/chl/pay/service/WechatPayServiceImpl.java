package com.chl.pay.service;

import com.chl.common.model.Result;
import com.chl.pay.model.Notify;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 15:48
 */
@Service
public class WechatPayServiceImpl extends AbstractPayService implements WechatPayService {


    @Override
    public boolean registerChannelService() {
        return true;
    }

    @Override
    public void setChannle() {
        this.channel = "WechatPay";
    }


    @Override
    public Result sacnBarcodePay() {
        return null;
    }

    @Override
    public Result qrCodePay() {
        return null;
    }

    @Override
    public Result pcScanPay() {
        return null;
    }

    @Override
    public Result miNiProgramPay() {
        return null;
    }

    @Override
    public Result h5Pay() {
        return null;
    }

    @Override
    public Result appPay() {
        return null;
    }

    @Override
    public Result notification(Notify notify) {
        return null;
    }


}
