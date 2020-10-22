package syx.util.factory.abstracts;

/**
 * 具体产品: 马类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 18:07
 */
public class Horse implements Animal {

    public Horse() {
        System.out.println("马类实现抽象动物类...");
    }


    @Override
    public void show() {
        System.out.println("马类实现抽象动物类---展示类");
    }
}
