package syx.util.factory.abstracts;

/**
 * //具体产品：蔬菜类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 18:16
 */
public class Vegetables implements Plant {


    public Vegetables() {
        System.out.println("蔬菜类实现植物类接口....");
    }

    @Override
    public void show() {
        System.out.println("蔬菜类实现植物类接口....---展示类");
    }

}
