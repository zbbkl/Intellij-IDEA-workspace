package VehiclE;

class Bicycle extends Vehicle {
    private String type;

    public Bicycle(String brand, String type) {
        super(brand);
        this.type = type;
    }

    @Override
    public void start() {
        if (!isRunning()) {
            System.out.println("开始骑行" + getBrand() + type + "自行车");
            super.start();
        } else {
            System.out.println("已经在骑行" + getBrand());
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            super.stop();
            System.out.println("下车停下" + getBrand());
        } else {
            System.out.println(getBrand() + "已经停下");
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("类型: " + type + "自行车");
    }

    public void ringBell() {
        System.out.println("叮铃铃! " + getBrand() + "自行车发出铃声");
    }

    public String getType() {
        return type;
    }
}