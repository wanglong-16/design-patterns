package structural.proxy;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 16:15:55
 * @author: wanglong16@meicai.cn
 */
public class HttpProxy implements  IHttp{

    private HttpClient httpClient;

    public HttpProxy(HttpClient httpClient) {
        this.httpClient = httpClient;
    }


    @Override
    public void request(String requestBody) {
        System.out.println("打印日志 " + requestBody);
        httpClient.request(requestBody);
    }

    @Override
    public String response() {
        String resp = httpClient.response();
        System.out.println("打印日志 " + resp);
        return resp;
    }
}
