package VehiclE;

public class VehicleDemo {
    public static void main(String[] args) {
       
        Vehicle vehicle = new Vehicle("通用");
        Car car = new Car("丰田", 5);
        Bicycle bicycle = new Bicycle("捷安特", "山地");

        System.out.println("基本功能测试");
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();

        System.out.println("\n汽车功能测试");
        car.start();
        car.shiftGear(3);
        car.stop();
        car.getInfo();

        System.out.println("\n自行车功能测试");
        bicycle.start();
        bicycle.ringBell();
        bicycle.stop();
        bicycle.getInfo();

        System.out.println("\n多态演示");
        Vehicle vehicle1 = new Car("本田", 4);
        Vehicle vehicle2 = new Bicycle("上海", "公路");
        Vehicle vehicle3 =  new Car("特斯拉", 5);
        Vehicle vehicle4 =  new Bicycle("bike", "城市");


    }
}