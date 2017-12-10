package lab06;

public class Jelly {
    public static final int BLUE_JELLY = 0;
    public static final int RED_JELLY = 1;

    private int type; // to indicate which colour the Jelly is.
    private int health; // health of the Jelly (max health is 100, minimum health is 0).
    //public String name;


    public Jelly(int type, int health){
        this.type = type;
        setHealth(health);
    }

    public Jelly(int type){
        this.type = type;
        setHealth(100);
    }
    public int getType(){
        return type;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        if(health >= 0 && health <=100){
            this.health = health;
        }
    }

    public boolean isAlive(){
        if ((health <= 100)&& (health > 0)){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return ("The type is "+ type + " and health is "+ health);
    }

}