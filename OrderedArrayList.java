import java.util.ArrayList;
public class OrderedArrayList{
  private ArrayList<Integer> _data;
  //Default constructor
  public OrderedArrayList(){
    _data = new ArrayList<Integer>();
  }
  //toString method
  public String toString(){
    return _data.toString();
  }
  //Add method: adds just before the first element that is larger
  public boolean add(int element){
    for(int i = 0; i < size(); i++){
      if(_data.get(i) > element){
        _data.add(i,element);
        return true;
      }
    }
    _data.add(element);
    return true;
  }
  //Get method
  public int get(int index){
    return _data.get(index);
  }
  public int size(){
    return _data.size();
  }
  public static void main(String[] args) {
    OrderedArrayList bob = new OrderedArrayList();
    System.out.println(bob);
    for (int i = 0; i < 23; i++){
      bob.add((int)(Math.random()*10));
    }
    System.out.println(bob);
  }
}
