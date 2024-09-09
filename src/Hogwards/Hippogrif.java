package Hogwards;

import java.util.Random;

public class Hippogrif {
    private String name;
    private int age;
    private String colour;
    private String ability;

    public Hippogrif() {
    }

    public Hippogrif(String name, int age, String colour, String ability) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.ability = ability;
    }

    public Hippogrif(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Hippogrif(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public String getAbility() {
        return ability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if (food.equals("grass")) {
            System.out.println("It's great!!!");
        } else {
            System.out.println("It's bad eat!!!");
        }
    }

    public String fly() {
        String fly;
        if (this.age > 2) {
            fly = this.name + " fly!!!";
        } else {
            fly = this.name + " can not fly";
        }
        return fly;
    }

    public String giveRide(Student student) {
        Random rand = new Random();
        int isGivingRide = rand.nextInt(1, 11);
        if (isGivingRide > 1 && isGivingRide < 4) {
            return student.getName() + " летит на гиппогрифе!";
        } else if (isGivingRide > 4 && isGivingRide < 9) {
            return "can not flying " + student.getName();
        } else {
            return "repeat again, " + student.getName();
        }
    }


}
