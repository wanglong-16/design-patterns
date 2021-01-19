package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:26:46
 * @author: wanglong16@meicai.cn
 */
public class OpenTVCommand implements ICommand {

    private final TV tv = new TV();

    @Override
    public void execute() {
       tv.openTV();
    }

    @Override
    public void undo() {
       tv.closeTV();
    }
}
