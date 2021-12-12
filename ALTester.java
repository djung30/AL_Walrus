import java.util.ArrayList;
public class ALTester {
  public static void main(String[] args) {
    ArrayList<Integer> bob = new ArrayList<Integer>();
    //Fills bob with 23 random integers from 0 to 10
    for (int i = 0; i < 23; i++){
      bob.add((int)(Math.random()*10));
    }
    System.out.println(bob);
    ArrayList<Integer> joe = new ArrayList<Integer>();
    //Fills joe with an increasing sequence of integers
    for (int i = 0; i < 23; i++){
      joe.add(i);
    }
    System.out.println(joe);
    //Testing isOrdered
    System.out.println(isOrdered(bob));
    System.out.println(isOrdered(joe));
  }
  //Takes an ArrayList of Integers, if they are in order, it returns true, otherwise, returns false
  public static boolean isOrdered(ArrayList<Integer> list){
    for (int i = 1; i<list.size(); i++){
      if (list.get(i) < list.get(i-1)){
        return false;
      }
    }
    return true;
  }
}
