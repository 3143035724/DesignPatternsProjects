package syx.controller;

import syx.util.prototype.ConcretePrototype;

/**
 * 原型模式
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/21 16:50
 */
public class PrototypePattern {

    /**
     * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
     * 原型实例指定了要创建的对象的种类
     * 优点：
     *  1.java自带的原型模式基于二进制流的复制，在性能上比直接new一个对象更加优良
     *  2.可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化创建对象的过程，可以辅助实现撤销操作
     * 缺点：
     *  1.需要为每一个类都配置一个clone方法
     *  2.违背开闭原则(clone位于类的内部，对已有类进行改造的时候，需要修改代码)
     *  3.实现深克隆时，需要编写较为复杂的代码，存在多重嵌套引用时，为实现深克隆，每层对象对应的类都必须支持深克隆，实现较为复杂
     */
    /**
     * 包含的角色
     * 1.抽象原型类：规定了具体原型对象必须实现的接口
     * 2.具体原型类：实现抽象原型类的clone方法，是可被复制的对象
     * 3.访问类：使用具体原型类中的clone方法来复制新的对象
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // 深克隆和浅克隆
        /**
         * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址
         * 浅克隆：创建一个对象，属性完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址
         */
        // 具体原型类拷贝测试
        ConcretePrototype concretePrototype = new ConcretePrototype();
        ConcretePrototype cloneObject = (ConcretePrototype) concretePrototype.clone();
        System.out.println("concretePrototype == cloneObject ? " + (concretePrototype == cloneObject));
    }

}
