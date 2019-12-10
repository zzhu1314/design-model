package com.cigit.state;

import java.util.Random;

/**
 * 能抽奖状态
 * @Author:zhuzhou
 * @Date: 2019/11/11  14:32
 **/
public class CanRaffleState implements State {
    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("积分已扣除，暂不能扣除积分");
    }

    /**
     * 若中奖，将状态设置为发放奖品状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，轻稍后....");
        Random random = new Random();
        int i = random.nextInt(10);
        if(i==0){
            System.out.println("恭喜您,中奖了...");
            //中奖了，设置状态位已发奖品状态
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }
        //未中奖，设置成不能抽奖状态
        System.out.println("很遗憾没有抽中奖品！");
        raffleActivity.setState(raffleActivity.getNoRafflleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
