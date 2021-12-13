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
  public void addLinear(Integer newVal){
    for(int i = 0; i < size(); i++){
      if(_data.get(i) > newVal){
        _data.add(i,newVal);
      }
  }
 }
 
  //Get method
  public Integer get(int index){
    return _data.get(index);
  }
  
  public int size(){
    return _data.size();
  }
  
  public Integer remove( int i ){
	_data.remove(i);
	return 1;
  }
  
  public static void main(String[] args) {
    OrderedArrayList bob = new OrderedArrayList();
    System.out.println(bob);
    for (int i = 0; i < 23; i++){
      bob.addLinear((int)(Math.random()*10));
    }
    System.out.println(bob);
    bob.remove(4);
    System.out.println(bob);
  }
}

