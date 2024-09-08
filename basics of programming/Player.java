


public class Player {
    private String name;
    private char gender;
    private int points;
    private int diceRolled;

    public Player(){
    }

    public Player(String name,String gender){
        this.name = name;
        this.gender = gender.charAt(0);
        points = 0;
        diceRolled = 0;
    }

    public void getPlayer(){
        System.out.println("Player name is: " + name);
        System.out.println("Player gender is: " + gender);
        System.out.println("Player points are: " + points);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.charAt(0);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints() {
        this.points++;
    }

    public void setDiceRolled(int diceRolled) {
        this.diceRolled = diceRolled;
    } 
    public int getDiceRolled() {
        return this.diceRolled;
    }   
}