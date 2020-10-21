package syx.util.singleton;

/**
 * 饿汉式单例模式(线程安全)
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/21 15:05
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "HungrySingleton";
    }

}
