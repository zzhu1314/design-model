package com.cigit.state;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/11  14:51
 **/
public class Client {
    public static void main(String[] args) {
        //奖品数量
        int count = 1;
        RaffleActivity activity = new RaffleActivity(count);
        for (int i = 0; i <30 ; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
