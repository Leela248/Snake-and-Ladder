package snakeandladder;

public class DynamicDice extends Dice {
    private int end = 6;
    public DynamicDice(int end){
        this.end = end;
    }
    public int roll() {
        return (int) (Math.random() * end) + 1;
    }

}
