public class DinhsDragon {
    private String color;
    private int health;
    private int age;

    public DinhsDragon() {
        color = "red";
        health = 100;
        age = 100;
    }

    public DinhsDragon(String c, int h) {
        color = c;
        health = h;
        age = 200;
    }

    public DinhsDragon(String c, int h, int a) {
        color = c;
        health = h;
        age = a;
    }

    public String getColor() {
        return color;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setHealth(int h) {
        health = h;
    }

    public void setAge(int a) {
        age = a;
    }

    public void increaseAge() {
        age += 10;
    }

    public void increaseHealth() {
        health += 20;
    }

    public void decreaseHealth() {
        health -= 20;
    }
   public String toString(){
   return "Color: " + color + "\nAge: " + age + "\nHealth: " + health;
   }
}
/* The code is good, but add things like the type of dragon, and what the dragon can do to attack.
Also, the first constructor, have it set the color to nothing, an empty string, the health to 100 is fine,
and the age to 0 or 1.
The second constructor is not needed, and if it was kept, get rid of the age = 200. It shouldnt be there if the user
didnt have it set, but i would just get rid of it compleatly, because with the third constructor, it is not really needed.
Finally, add a toString method.
Other than that, its fine.*/ 

   