import java.util.Random;
public class Dice{
  int sides;
  Random random;

  //constructor 

  public dice(int sides){
   this.sides = sides ; 
   this.random = new Random();
  }

  public int roll(){
    return random.nextInt(sides) + 1;
  }
}