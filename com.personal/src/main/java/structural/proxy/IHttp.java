package structural.proxy;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 16:12:33
 * @author: wanglong16@meicai.cn
 */
public interface IHttp {

    void request(String requestBody);

    String response();
}
