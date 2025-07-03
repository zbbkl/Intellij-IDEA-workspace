package AnimaL;

public class AnimalDemo {
    public static void main(String[] args) {
        // 创建Animal、Dog和Cat对象
        Animal animal = new Animal("动物", 3);
        Dog dog = new Dog("旺财", 2, "金毛");

        Cat cat = new Cat("咪咪", 1, true);

        // 调用getInfo方法
        animal.getInfo();
        dog.getInfo();
        cat.getInfo();

        // 调用makeSound方法（展示多态）
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        // 调用子类特有的方法
        dog.fetch();
        cat.scratch();

        Animal animal1 = new Dog("小黑", 4, "拉布拉多");
        Animal animal2 = new Cat("小白", 2, false);

        // 调用的是子类重写后的方法
        animal1.makeSound();
        animal2.makeSound();
    }
}