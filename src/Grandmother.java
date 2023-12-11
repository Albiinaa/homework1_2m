public class Grandmother {
    private String name;
    private int age;
    private ColorEnum colorEnum;
    private Home home;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ColorEnum getColorOfHair() {
        return colorEnum;
    }

    public Home getHome() {
        return home;
    }

    public Grandmother(String name, int age, ColorEnum colorEnum, Home home) {
        this.name = name;
        this.age = age;
        this.colorEnum = colorEnum;
        this.home = home;
    }

    public String getInfo(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nColor of hair: " + colorEnum +
                "\nHome address: " + home.getAddress() +
                "\nHome number: " + home.getNumberOfHome();
    }
}
