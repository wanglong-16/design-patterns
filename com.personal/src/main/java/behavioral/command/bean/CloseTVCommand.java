package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:26:57
 * @author: wanglong16@meicai.cn
 */
public class CloseTVCommand implements ICommand {

    private final TV tv = new TV();

    @Override
    public void execute() {
        tv.closeTV();
    }

    @Override
    public void undo() {
        tv.openTV();
    }
}
