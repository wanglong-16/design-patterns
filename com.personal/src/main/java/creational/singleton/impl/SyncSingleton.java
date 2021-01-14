package creational.singleton.impl;

/**
 * @description: 线程安全的单例模式
 * @version: 1.0
 * @date: 2021-01-14 08:21:20
 * @author: wanglong16@meicai.cn
 */
public class SyncSingleton {

    /**
     * JVM 底层为了优化程序运行效率，可能会对我们的代码进行指令重排序，[todo: 指令重排序问题]
     * 在一些特殊情况下会导致出现空指针，为了防止这个问题，
     * 更进一步的优化是给 instance 变量加上 volatile 关键字。
     */
    private static volatile SyncSingleton instance = null;

    private SyncSingleton() {}

    /**
     * 使用双检索模式实现单例
     * @return
     */
    public static SyncSingleton getInstance() {
        if (instance == null) {
            //第一步检索：提高代码执行效率，当多个线程来并发获取单例时，
            // 如果不做空检测的话，线程会处于锁竞争状态
            synchronized (SyncSingleton.class) {
                //第二步检索：防止并发获取单例时，new出多个实例，
                // 如果里面不做空检查，可能会有两个线程同时通过了外面的空检查，
                // 然后在一个线程 new 出实例后，第二个线程进入锁中又 new 出一个实例，导致创建多个实例。
                if (instance == null) {
                    instance = new SyncSingleton();
                }
            }
        }
        return instance;
    }

    //-----------------------------------------------------------------------------------

    private static class InstanceHolder {
        public static SyncSingleton syncSingleton = new SyncSingleton();
    }

    /**
     * 通过静态内部类来获取单例
     *
     * 一、静态内部类方式是怎么实现懒加载的？
     * 二、静态内部类方式是怎么保证线程安全的？
     *
     * Java 类的加载过程包括：加载、验证、准备、解析、初始化。初始化阶段即执行类的 clinit 方法
     * （clinit = class + initialize），包括为类的静态变量赋初始值和执行静态代码块中的内容。
     * 但不会立即加载内部类，内部类会在使用时才加载。所以当此 Singleton 类加载时，
     * SingletonHolder 并不会被立即加载，所以不会像饿汉式那样占用内存。
     *
     * 另外，Java 虚拟机规定，当访问一个类的静态字段时，如果该类尚未初始化，则立即初始化此类。
     * 当调用Singleton 的 getInstance 方法时，由于其使用了 SingletonHolder 的静态变量 instance，
     * 所以这时才会去初始化 SingletonHolder，在 SingletonHolder 中 new 出 Singleton 对象。这就实现了懒加载。
     * 第二个问题的答案是 Java 虚拟机的设计是非常稳定的，早已经考虑到了多线程并发执行的情况。虚拟机在加载类的
     * clinit 方法时，会保证 clinit 在多线程中被正确的加锁、同步。即使有多个线程同时去初始化一个类，
     * 一次也只有一个线程可以执行 clinit 方法，其他线程都需要阻塞等待，从而保证了线程安全。
     */
    public static SyncSingleton getInstanceByPlaceHolder() {
        return InstanceHolder.syncSingleton;
    }


    public void printOut() {
        System.out.println("SyncSingleton！！！");
    }

}
