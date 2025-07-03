package AnimaL;
public class Cat extends Animal {
    private boolean hasLongHair;

    // 构造函数
    public Cat(String name, int age, boolean hasLongHair) {
        super(name, age);
        this.hasLongHair = hasLongHair;
    }

    // 重写父类方法
    @Override
    public void makeSound() {
        System.out.println("喵喵喵！");
    }

    // 子类特有方法
    public void scratch() {
        System.out.println(getName() + "正在抓沙发");
    }

    // Getter和Setter方法
    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }
}