package syx.util.bulider;

/**
 * Builder模式的实体类(角色产品类)
 *
 * @author syx
 * @version 1.0
 * @since 2020/11/4 21:44
 */
public class BuilderEntity {

    private String id;

    private String name;

    private double score;

    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
