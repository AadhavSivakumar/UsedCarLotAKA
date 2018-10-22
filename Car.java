public abstract class Car{

private int price;
private String model;
private int vin;

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

public int getPrice(){
  return  price;
}
public int getVin(){
  return vin;
}
public void setModel(String m){
  model=m;
}

public String getModel(){
  return  model;
}
}

