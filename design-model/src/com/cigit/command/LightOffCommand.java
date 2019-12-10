package com.cigit.command;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/4  14:16
 * 具体命令，聚合命令接收者
 **/
public class LightOffCommand implements Command {
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();

    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
