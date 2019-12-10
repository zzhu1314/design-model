package com.cigit.state;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/11  14:22
 * 具体状态的接口
 **/
public interface State {

    //扣除积分
    void deductMoney();
    //是否中奖
    boolean raffle();
    //发放奖品
    void dispensePrize();
}
