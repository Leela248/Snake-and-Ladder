package snakeandladder;

public class Player {
    String name = "";
    int position = 0;
    Dice dice;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDice(Dice dice){
        this.dice = dice;
    }
    public Dice getDice(){
        return dice;
    }

    public Player(String name, Dice dice){
        this.name = name;
        this.dice = dice;
    }

    public Player(String name){
        this.name = name;
        this.dice = new Dice();
    }

    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return position;
    }
}
