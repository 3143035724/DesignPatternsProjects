package syx.util.factory.abstracts;

/**
 * 具体产品：水果类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 18:14
 */
public class Fruitage implements Plant {

    public Fruitage() {
        System.out.println("水果类实现植物类接口....");
    }

    @Override
    public void show() {
        System.out.println("水果类实现植物类接口....---展示类");
    }
}
