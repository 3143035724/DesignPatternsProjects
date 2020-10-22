package syx.controller;

import syx.util.factory.approach.CreateFactoryClassTwo;
import syx.util.factory.approach.Factory;

/**
 * 工厂方法模式
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 15:28
 */
public class FactoryApproach {

    /**
     * 1.对简单工厂模式的进一步抽象化,可以在不修改源代码的情况下引入新产品,也就是满足开闭原则
     * 2.优点:
         * 1) 用户只需要知道具体工厂的名称就可以得到所需要的产品,无需知道产品的具体创建过程
         * 2) 灵活性增强
         * 3) 是一个典型的解耦框架.满足迪米特法则,依赖倒置原则和里氏替换原则
     * 3.缺点:
         * 1) 类的个数容易过多,增加复杂度
         * 2) 增加了系统的抽象性和理解难度
         * 3) 抽象产品只能生产一种产品
     * 4.主要角色
         * 1) 抽象工厂: 提供创建产品的接口,调用者通过它访问具体工厂的工厂方法 newProduct()来创建产品
         * 2) 具体工厂: 实现抽象工厂中的抽象方法,完成具体产品的创建
         * 3) 抽象产品: 定义产品的规范,描述产品的主要特性和功能
         * 4) 具体产品: 实现抽象产品角色所定义的接口,由具体工厂创建,与具体工厂之间一一对应
     * 5.注意事项
         * 1)工厂方法模式只考虑生产同等级的产品
     */
    public static void main(String[] args) {
        CreateFactoryClassTwo createFactoryClassTwo = new CreateFactoryClassTwo();
        Factory factory = createFactoryClassTwo.create();
        factory.show();
    }

}
