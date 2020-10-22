package syx.util.factory.abstracts;

/**
 * 具体产品：牛类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 18:08
 */
public class Cattle implements Animal {

    public Cattle() {
        System.out.println("牛类实现抽象动物类...");
    }

    @Override
    public void show() {
        System.out.println("牛类实现抽象动物类---展示类");
    }
}
