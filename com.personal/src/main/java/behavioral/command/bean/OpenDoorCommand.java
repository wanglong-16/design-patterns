package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:25:00
 * @author: wanglong16@meicai.cn
 */
public class OpenDoorCommand implements ICommand {

    private final Door door = new Door();

    @Override
    public void execute() {
        door.openDoor();
    }

    @Override
    public void undo() {
        door.closeDoor();
    }
}
