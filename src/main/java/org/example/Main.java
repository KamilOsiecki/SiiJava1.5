package org.example;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        var truck1 = new Truck(120);
        var truck2 = new Truck(105);
        var boat1 = new Boat(90);
        var boat2 = new Boat(85);
        var human1 = new Human();
        var human2 = new Human();
        var superTruck = new Truck(350) {
            @Override
            public void move() {
                System.out.println("Im super truck I can drive with 350km/h");
            }
        };

        List<Mobile> mobiles = List.of(truck1, truck2, boat1, boat2, human1, human2, superTruck);
        Mobile mobile = generic(mobiles);
        mobile.move();
        print(() -> System.out.println("I cannot run at all"));
        introduce((name) -> System.out.println("Hello " + name));
    }

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    public static <T extends Mobile> T generic(List<T> mobileGroup) {
        for (T t : mobileGroup) {
            System.out.println(t instanceof Vehicle ? "to jest pojazd "
                    + ((Vehicle) t).getMaxSpeed() : "to nie jest pojazd");
        }
        return mobileGroup.get(new Random().nextInt(mobileGroup.size()));
    }
}