package com.cigit.command;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/4  14:11
 **/
public interface Command {

    //执行任务
    void execute();
    //撤销动作
    void undo();
}
