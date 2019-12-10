package com.cigit.command;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/4  14:12
 * 具体命令
 * 聚合命令接受者
 **/
public class LightOnCommand implements Command {
    LightReceiver lightReceiver;
    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.on();

    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
