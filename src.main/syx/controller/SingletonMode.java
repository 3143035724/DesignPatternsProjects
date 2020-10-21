package syx.controller;

import syx.util.singleton.HungrySingleton;
import syx.util.singleton.LazySingleton;

/**
 * 单例模式
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/21 14:13
 */
public class SingletonMode {
    /**
     * 单例模式：一个类只有一个实例
     * 特点：
     * 1.单例类只有一个实例对象
     * 2.该单例对象必须由单例类自行创建
     * 3.单例类对外提供一个访问该单例的全局访问点
     */
    public static void main(String[] args) {
        /** 优点
         * 1.可以保证内存里只有一个实例，减少了内存的开销
         * 2.避免对资源的多重占用
         * 3.设置全局访问点，可以优化和共享资源的访问
         */
        /** 缺点
         * 1.违背开闭原则
         * 2.不利于代码调试
         * 3.较容易违背单一职责原则
         */
        // 懒汉式
        LazySingleton lazySingleton = LazySingleton.getInstance();

        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        if (lazySingleton.equals(lazySingleton1)) {
            System.out.println(lazySingleton.toString());
        }

        // 饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();

        if (hungrySingleton.equals(hungrySingleton1)) {
            System.out.println(hungrySingleton.toString());
        }
    }
}
