package syx.util.factory.abstracts;

/**
 * 抽象工厂-农场类
 *
 * @author syx
 * @version 1.0
 * @since 2020/10/22 18:16
 */
public interface Farm {

    public Animal newAnimal();

    public Plant newPlant();

}
