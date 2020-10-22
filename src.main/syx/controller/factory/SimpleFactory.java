package syx.controller.factory;

import syx.util.factory.simple.Simple;
import syx.util.factory.simple.SimpleContest;
import syx.util.factory.simple.SimpleProductOne;
import syx.util.factory.simple.SimpleProductTwo;

import java.util.Objects;

/**
 * 简单工厂模式/静态工厂方法模式
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 14:04
 */
public class SimpleFactory {

    /**
     * 创建与使用相分离
     * 产品:被创建的对象
     * 工厂:创建产品的对象
     */

    public static void main(String[] args) {
        /**
         * 优缺点
         *  优点:
         *      1.工厂和产品的职责区分明确
         *      2.客户端无需知道所创建具体产品的类名,只需要知道参数即可
         *      3.可以引入配置文件,在不修改客户端代码的情况下更换和添加新的具体产品类
         *  缺点:
         *      1.代码臃肿,违背高聚合原则
         *      2.会增加系统中类的个数(引入新的工厂类),增加系统的复杂度和理解难度
         *      3.系统拓展困难
         *      4.使用static工厂方法,造成工厂角色无法形成基于继承的等级结构
         * 主要角色:
         *  1.简单工厂: 简单工厂模式的核心,负责实现创建所有实例的内部逻辑.工厂类的创建产品类的方法可以被外界直接调用,创建所需的产品对象
         *  2.抽象产品: 简单工厂创建的所有对象的父类,负责描述所有实例共有的公共接口
         *  3.具体产品: 简单工厂模式的创建目标
         */
        Objects.requireNonNull(switchSimple(1)).showProduct();
        Objects.requireNonNull(switchSimple(3)).showProduct();

    }

    public static Simple switchSimple(int status) {
        switch (status) {
            case SimpleContest.ONE:
                return new SimpleProductOne();
            case SimpleContest.TWO:
                return new SimpleProductTwo();
            default:
                return null;
        }
    }
}
