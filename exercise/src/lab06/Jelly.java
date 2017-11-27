package lab06;

public class Jelly {
    public static final int BLUE_JELLY = 0;
    public static final int RED_JELLY = 1;

    public int type; // to indicate which colour the Jelly is.
    public int health; // health of the Jelly (max health is 100, minimum health is 0).
    public String name;

        public Jelly(int type, int health){
            this.type = type;
            this.health = health;

            if(type == BLUE_JELLY){
                this.name = "Blue Jelly";
            }else if(type == RED_JELLY){
                this.name = "Red Jelly";
            }

        }


}
