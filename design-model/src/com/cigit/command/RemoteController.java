package com.cigit.command;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/4  14:18
 * 调用者，发起命令，invoker
 * 聚合Command
 **/
public class RemoteController {
    //开 按钮的数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销命令
    Command undoCommand;

    //构造器，完成对命令的初始化，十组按钮
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no){
        // 找到你按下的开的按钮， 并调用对应方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }
    //按下关按钮
    public void offButtonWasPushed(int no){
        // 找到你按下的开的按钮， 并调用对应方法
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }
    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
