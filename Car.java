public abstract class Car{

private int price;
private String model;
private String vin;
private int year;

public Car(){
  price=0;
  model="undef";
  vin="";
  year=0;
}

public Car (int p, String mod, String vin, int year){
  setPrice(p);
  setModel(mod);
  setVin(vin);
  setYear(year);
}
public void setVin(String Vin){
  vin = Vin;
}
public void setPrice(int p){
  price=p;
}
public void setYear(int y){
  year = y;
}
public String getModel()
{
    return model;
}
public int getPrice(){
  return  price;
}
public String getVin(){
  return vin;
}
public int getYear(){
  return year;
}
public void setModel(String m){
  model=m;
}
@Override
public String toString() {
    return "Vin: " + vin + "\n" + "Price: $" + price + "\n" + "Year: " + year + "\n" + "Model: " + model + "\n";
}
}

