package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:25:51
 * @author: wanglong16@meicai.cn
 */
public class CloseDoorCommand implements ICommand {

    private final Door door = new Door();

    @Override
    public void execute() {
        door.closeDoor();
    }

    @Override
    public void undo() {
        door.openDoor();
    }
}
