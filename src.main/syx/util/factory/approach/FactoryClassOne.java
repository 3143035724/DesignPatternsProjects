package syx.util.factory.approach;

/**
 * 工厂方法模式-工厂实现类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 17:06
 */
public class FactoryClassOne implements Factory {
    @Override
    public void show() {
        System.out.println("通过工厂创建的对象1...");
    }
}
