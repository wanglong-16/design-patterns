package behavioral.command;

import behavioral.command.bean.CloseTVCommand;
import behavioral.command.bean.ICommand;
import behavioral.command.bean.OpenDoorCommand;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:30:46
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        handle();
    }


    private static void handle() {
        ICommand command = new CloseTVCommand();
        command.execute();
        command.undo();

        ICommand command1 = new OpenDoorCommand();
        command1.execute();
        command1.undo();
    }
}
