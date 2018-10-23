public class AutoTransCar extends Car{ 
private boolean cruzControlOn;

public  AutoTransCar(){
   super();
   cruzControlOn=false;
}

public void toggleCruzControl(){
    cruzControlOn= ! cruzControlOn;
}

public  AutoTransCar (int p, String m,  boolean ccOn, String vin, int year){
   super(p,m,vin,year);
   cruzControlOn=ccOn;
}

public void setCruzControl(boolean cc){
  cruzControlOn=cc;
}
public boolean getCruzControl(){
  return cruzControlOn;
}
@Override
public String toString()
{
    return super.toString() + "Type: Automatic" + "\n" + "Cruise Control Status: " + cruzControlOn + "\n";
}


}


 