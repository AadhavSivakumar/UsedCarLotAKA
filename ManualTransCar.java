public class ManualTransCar extends Car{
private int numGears;

public ManualTransCar(){
  super();
  setNumGears(5);
}

public  ManualTransCar( int p,String m, int ng, String vin, int year){
   super(p,m,vin,year);
   setNumGears(5);
}

public void setNumGears(int ng){
    
    if (3<ng && ng <=6){
  
         numGears=ng;
  }
  else {
       numGears=5;
  }
}

public int getNumGears(){
  return numGears;
}
@Override
public String toString()
{
    return super.toString() + "Type: Manual" + "\n" + "Gears: " + numGears + "\n";
    
}
}