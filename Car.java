public abstract class Car{

private int price;
private String model;
private int vin;
private int year;

public Car(){
  price=0;
  model="undef";
  vin=0;
}

public Car (int p, String mod){
  price=p;
  model=mod;
}
public void setVin(int Vin){
  vin = Vin;
}
public void setPrice(int p){
  price=p;
}
public void setYear(int y){
  year = y;
}
public int getPrice(){
  return  price;
}
public int getVin(){
  return vin;
}
public int getYear(){
  return year;
}
public void setModel(String m){
  model=m;
}

public String getModel(){
  return  model;
}
}

