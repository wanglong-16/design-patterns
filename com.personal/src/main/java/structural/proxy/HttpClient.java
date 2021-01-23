package structural.proxy;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 16:13:54
 * @author: wanglong16@meicai.cn
 */
public class HttpClient implements IHttp{

    @Override
    public void request(String requestBody) {
        System.out.println("发送客户端请求中。。。。。。");
    }

    @Override
    public String response() {
        System.out.println("接受到客户端响应。。。。。。");
        return "response body ......";
    }
}
