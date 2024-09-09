package Hogwards;

public class Student {
    private String name;
    private String faculty;
    private int age;
    private String[] ability = new String[3];


    public Student(String name, String faculty, int age, String[] ability) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String[] getAbility() {
        return ability;
    }
}
