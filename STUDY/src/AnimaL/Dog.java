package AnimaL;
public class Dog extends Animal {
    private String breed;

    // 构造函数
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // 重写父类方法
    @Override
    public void makeSound() {
        System.out.println("汪汪汪！");
    }

    // 子类特有方法
    public void fetch() {
        System.out.println(getName() + "正在捡球");
    }

    // Getter和Setter方法
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
