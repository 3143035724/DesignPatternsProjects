package syx.controller;

import syx.util.factory.abstracts.Animal;
import syx.util.factory.abstracts.Plant;
import syx.util.factory.abstracts.SRfarm;

/**
 * 抽象工厂模式
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 17:24
 */
public class AbstractFactory {
    /**
     * 1.对工厂方法模式的进一步升级
     * 工厂方法模式只考虑生产同等级的产品(一类产品的生产)
     * 抽象工厂模式考虑多等级(种类)的生产
     * 2.定义
     * 一种为访问类提供的一个创建一组相关或相互依赖对象的接口,且访问类无须指定所要产品的具体类就能够得到同族的不同等级的产品的模式结构
     * 3.需要满足的条件
     * 1) 系统中有多个产品族,每个具体工厂创建同一族但不同等级结构的产品
     * 2) 系统一次只可能消费其中某一族产品,即同族的产品一起使用
     * 4.优点(除具备工厂方法模式的优点外)
     * 1) 可以在类的内部对产品族中相关联的多等级产品共同管理,而不必专门引入多个新的类来进行管理
     * 2) 当需要产品族时,抽象工厂可以保证客户端始终只使用同一个产品的产品组
     * 3) 增强了程序的可扩展性,满足开闭原则
     * 5.缺点
     * 1) 当产品族中需要增加一个新的产品时,所有的工厂类都需要进行修改,增加了系统的抽象性和理解难度
     * 6.主要角色
     * 1) 抽象工厂: 提供了创建产品的接口,包含多个创建产品的方法,可以创建多个不同等级的产品
     * 2) 具体工厂: 实现抽象工厂中的多个抽象方法,完成具体产品的创建
     * 3) 抽象产品: 定义产品的规范,描述产品的主要特性和功能,抽象工厂模式有多个抽象产品
     * 4) 具体产品: 实现抽象产品角色所定义的接口,由具体工厂创建,和具体工厂之间是多对一的关系
     */
    public static void main(String[] args) {
        SRfarm sRfarm = new SRfarm();
        Animal animal = sRfarm.newAnimal();
        Plant plant = sRfarm.newPlant();
        animal.show();
        plant.show();
    }
}
