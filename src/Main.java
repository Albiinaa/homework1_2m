
public class Main {
    public static void main(String[] args) {
        Home home = new Home("Toktogula", 30);
        Mother mother = new Mother("Jane", 57, ColorEnum.BROWN, home, "Teacher");
        Daughter daughter = new Daughter("Kate", 25, ColorEnum.RED, home, "Dancer", "Ramen");
        Daughter daughter2 = new Daughter("Lily", 19, ColorEnum.DARK_BLUE, home, "Volunteer", "Plov");
        System.out.println(mother.getInfo());
        System.out.println();
        System.out.println(daughter.getInfo());
        System.out.println();
        System.out.println(daughter2.getInfo());
        System.out.println();
        daughter.cook();
        System.out.println();
        daughter2.cook("Lily is cooking cakes");
    }
}