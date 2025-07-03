package VehiclE;

class Vehicle {
    private String brand;
    private double speed;
    private boolean isRunning;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + "已启动");
        } else {
            System.out.println(brand + "已经处于运行状态");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + "已停止");
        } else {
            System.out.println(brand + "已经处于停止状态");
        }
    }

    public void getInfo() {
        System.out.println("品牌: " + brand + ", 当前速度: " + speed + " km/h, 状态: " +
                (isRunning ? "运行中" : "已停止"));
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
