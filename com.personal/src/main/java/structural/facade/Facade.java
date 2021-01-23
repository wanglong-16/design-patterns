package structural.facade;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 15:59:27
 * @author: wanglong16@meicai.cn
 */
public class Facade {

    public void startWorking() {
        IdeOperator.openIde();
        WebBrowserOperator.openWebBrowser();
    }

    public void stopWorking() {
        IdeOperator.closeIde();
        WebBrowserOperator.closeWebBrowser();
    }
}
