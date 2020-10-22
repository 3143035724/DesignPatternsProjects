package syx.util.factory.simple;

/**
 * 简单工厂模式的工厂
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 14:50
 */
public class SimpleProductTwo implements Simple {

    @Override
    public void showProduct() {
        System.out.println("简单工厂模式-实现2的展示...");
    }
}
