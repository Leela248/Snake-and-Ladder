package snakeandladder;
import java.util.*;
//dynamic number of dice head//each player has their own dice//grid size//snake and ladder input
public class Game {
    int[] grid = {11, 1, 1, 1, 1, 1, 1, 9, 1, 1, -9, 1, 1, 1, 9, 1, -7, 1, 1, 1, 1, 1, -19, 1};
    Scanner scanner = new Scanner(System.in);

    public Player start(){
        System.out.println("How many players : ");
        int n = Integer.parseInt(scanner.nextLine());
        Queue<Player> queue = new LinkedList<>();
        for( int i = 1 ; i <= n ; i ++){
            queue.add(getPlayer());
        }
        Player current = queue.peek();
        while(current.getPosition() < 25){
            current = queue.poll();
            int numMove = current.getDice().roll();
            current.setPosition(position(current.getPosition(), grid, numMove));
            queue.add(current);
        }
        return current;
    }

    private int position(int p, int[] grid, int d){
        p = p + d;
        p = p + grid[p];
        return p;
    }

    private Player getPlayer() {
        Player player;
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Do you have a die? ");
        if (scanner.nextLine().equals("yes")) {
            System.out.println(("what's the ending value? "));
            player = new Player(name, new DynamicDice(scanner.nextInt()));
        }
        else{
            player = new Player(name);
        }
        return player;
    }
}