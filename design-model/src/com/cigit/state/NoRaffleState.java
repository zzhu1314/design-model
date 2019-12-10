package com.cigit.state;

/**
 * 不能抽奖状态
 * @Author:zhuzhou
 * @Date: 2019/11/11  14:26
 **/
public class NoRaffleState implements State {
    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分....");
        activity.setState(activity.getCanRaffleState());//状态改为能抽奖状态

    }


    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
