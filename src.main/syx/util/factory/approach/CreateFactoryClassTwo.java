package syx.util.factory.approach;

/**
 * 通过抽象工厂创建工厂的类2
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 17:08
 */
public class CreateFactoryClassTwo implements CreateFactory {
    @Override
    public Factory create() {
        System.out.println("通过抽象工厂创建的工厂2...");
        return new FactoryClassTwo();
    }
}
