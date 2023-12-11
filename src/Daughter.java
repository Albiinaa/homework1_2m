 public final class Daughter extends Mother {
    private String favoriteFood;

     public String getFavoriteFood() {
         return favoriteFood;
     }

     public Daughter(String name, int age, ColorEnum colorEnum, Home home, String profession,String favoriteFood) {
         super(name, age, colorEnum, home,profession);
         this.favoriteFood = favoriteFood;
     }


     @Override
     public String getInfo() {
         return super.getInfo() +
                 "\nFavorite food: " + favoriteFood;
     }
 }
