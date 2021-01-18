package behavioral.iterator.bean;

/**
 * @description: 迭代器接口，和 jdk 相同
 * @version: 1.0
 * @date: 2021-01-18 09:35:41
 * @author: wanglong16@meicai.cn
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
