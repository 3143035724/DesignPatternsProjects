package syx.util.factory.approach;

/**
 * 通过抽象工厂创建工厂的类1
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 17:08
 */
public class CreateFactoryClassOne implements CreateFactory {
    @Override
    public Factory create() {
        System.out.println("通过抽象工厂创建的工厂1...");
        return new FactoryClassOne();
    }
}
