package Hogwards;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hippogrif hippo1 = new Hippogrif("Raven", "grey");
        Hippogrif hippo2 = new Hippogrif("Serg", 95, "black", "laugh");
        Hippogrif hippo3 = new Hippogrif();
        Hippogrif hippo4 = new Hippogrif("Maria");

        hippo3.setName("Tom");

        Student student1 = new Student("Milan", "Programming", 35, new String[]{"kind", "earch", "fire"});

        hippo2.eat("iron");
        hippo2.eat("grass");
        System.out.println(hippo2.fly());
        System.out.println(hippo2.getAge());
        System.out.println(hippo2.giveRide(student1));

        System.out.println(Arrays.toString(student1.getAbility()));
    }
}