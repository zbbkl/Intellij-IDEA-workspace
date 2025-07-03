package VehiclE;
class Car extends Vehicle {
    private int numSeats;
    private int gear;

    public Car(String brand, int numSeats) {
        super(brand);
        this.numSeats = numSeats;
        this.gear = 0;
    }

    // 重写启动方法
    @Override
    public void start() {
        if (!isRunning()) {
            System.out.println("启动" + getBrand() + "引擎...");
            super.start();
            shiftGear(1);
        } else {
            System.out.println(getBrand() + "已经启动");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            shiftGear(0);
            super.stop();
        } else {
            System.out.println(getBrand() + "已经停止");
        }
    }

    public void shiftGear(int newGear) {
        if (isRunning()) {
            gear = newGear;
            System.out.println(getBrand() + "换至" + gear + "档");
        } else {
            System.out.println("请先启动" + getBrand());
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("类型: 汽车, 座位数: " + numSeats + ", 当前档位: " + gear);
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getGear() {
        return gear;
    }
}
