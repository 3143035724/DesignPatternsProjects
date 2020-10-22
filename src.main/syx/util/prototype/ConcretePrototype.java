package syx.util.prototype;

/**
 * 原型模式中的具体原型类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 11:50
 */
public class ConcretePrototype implements Cloneable {

    public ConcretePrototype() {
        System.out.println("这是具体原型类的源对象");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型类复制成功...");
        return (ConcretePrototype) super.clone();
    }
}
