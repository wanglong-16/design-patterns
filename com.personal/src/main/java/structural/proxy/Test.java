package structural.proxy;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 16:18:11
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        HttpClient client = new HttpClient();
        HttpProxy proxy = new HttpProxy(client);
        proxy.request("request ...");

        proxy.response();
    }
}
