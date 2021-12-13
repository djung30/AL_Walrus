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
  public boolean addLinear(Integer newVal){
  	if(size()==0){
  		_data.add(newVal);
  		}
    for(int i = 0; i < size(); i++){
      if(_data.get(i) > newVal){
        _data.add(i,newVal);
        return true;
      }
    }
    _data.add(newVal);
    return true;
  }

  public void addBinary(Integer newVal){
        int midIndex = (int) size();
        if (newVal > midIndex){
            for(int i = midIndex; i < size(); i++){
                if(_data.get(i) > newVal){
                  _data.add(i,newVal);
                }
            }
        }
        if (newVal < midIndex){
            for(int i = 0; i < midIndex; i++){
                if(_data.get(i) > newVal){
                  _data.add(i,newVal);
                }
            }
        }
        if ( (int)newVal == midIndex){
            _data.add(midIndex,newVal);
        }

    }

  //Get method
  public Integer get (int i){
    return _data.get(i);
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
    /*OrderedArrayList Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
    Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );*/
  }
}
