public class Mother extends Grandmother{
    private String profession;

    public Mother(String name, int age, ColorEnum colorEnum, Home home,String profession) {
        super(name, age, colorEnum, home);
        this.profession=profession;
    }

    public String getProfession() {
        return profession;
    }


    public void cook(String cook){
        System.out.println(cook);
    }
    public final void cook(){
        System.out.println("Mother is cooking");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nProfession: " + profession;
    }
}
