package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:23:45
 * @author: wanglong16@meicai.cn
 */
public interface ICommand {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
