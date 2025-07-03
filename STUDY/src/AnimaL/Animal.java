package AnimaL;

public class Animal {
    private String name;
    private int age;

    // 构造函数
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void makeSound() {
        System.out.println("动物发出声音");
    }
    public void getInfo() {
        System.out.println("名称: " + name + ", 年龄: " + age);
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
