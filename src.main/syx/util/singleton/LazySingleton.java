package syx.util.singleton;

import java.util.Objects;

/**
 * 懒汉式单例模式(线程不安全)
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/21 15:05
 */
public class LazySingleton {

    /**
     * 保证instance早所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * 特点：
     * 类加载时不生成对应实例
     */
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton";
    }
}
