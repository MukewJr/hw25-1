import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Car car=new Car();
//        car.setId(1);
//        car.setId(2);
//        car.setId(3);
//        car.setNO("A123B");
//        car.setNO("C456D");
//        car.setNO("E890F");
//
        CarData cd=new CarData();
//        cd.setYear(2010);
//        cd.setYear(2015);
//        cd.setYear(2020);
//        cd.setModel("Tesla");
//        cd.setModel("BMW");
//        cd.setModel("Mercedes");
//        cd.setPrice(90000);
//        cd.setPrice(70000);
//        cd.setPrice(120000);
//        cd.setColor("white");
//        cd.setColor("Black");
//        cd.setColor("Red");


        HashMap<Car,CarData> cars=new HashMap<>();
       // cars.put(car,cd);
       cars.put(new Car(1,"A123B"),new CarData(2010, "Tesla",90000,"White"));
        cars.put(new Car(2,"C456D"),new CarData(2015, "BMW",110000,"Black"));
        cars.put(new Car(3,"E7898F"),new CarData(2020, "Mercedes",120000,"Red"));

            for (Map.Entry a: cars.entrySet()) {
                System.out.println(a.getKey()+" "+ a.getValue());

            }



    }
}