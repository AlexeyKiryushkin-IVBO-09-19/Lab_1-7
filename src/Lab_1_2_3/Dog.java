package Lab_1_2_3;

public class Dog {
    protected String name;
    protected int age;

    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int toHumanAge (int age) {
        age = age * 7;
        return age;
    }

    public String toString () {
        String info;
        info = "Name = " + name + "; Age = " + age;
        return info;
    }

}
