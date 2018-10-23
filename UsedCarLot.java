import java.util.ArrayList;
import java.util.List;
public class UsedCarLot
{
  // this is a brute force method of creating various car instance variables
  // How could we simplify this using a list?
 
  private Car c1, c2, c3, c4, c5;
  int totalValue;
  private List<Car> carList = new ArrayList<Car>();
     public UsedCarLot(){
         c1=(Car) new AutoTransCar(2500,"VW Bug", false, "WP1AB2A23DLA80763", 1998);
         c2=(Car) new AutoTransCar(5000,"Ford Mustang", false, "4UZA4FF48XCF83088", 2008);
         c3= (Car) new ManualTransCar(12000,"Honda Fit", 5, "1GCCSCDEXA8108174", 1998);
         carList.add(c1);
         carList.add(c2);
         carList.add(c3);
         System.out.println("c3 num gears = " + ((ManualTransCar)c3).getNumGears());
         totalValue = updatePrice();
    }

    public Car addCar(int p, String m, String carType, int ng, boolean cc, String vin, int year){
         if (p <= 0){ // Price check
             System.out.println("Price below 0, setting to 1");
             p=1;
         }
         if (searchVin(vin) != -1){ // VIN check 
             System.out.println("VIN not unique");
             return null;
         }  
         if (carType.equals("Auto")){
             Car c=(Car) new AutoTransCar(p,m, false, vin, year);
             carList.add(c);
             totalValue+=c.getPrice();
             return c;
            }
         if (carType.equals("Manual")) {
              if ((ng < 3) || (ng > 6))
              {
                  System.out.println("NumGears outside valid range, setting to 3");
                  ng = 3;
              }
              Car c= (Car) new ManualTransCar(p,m, ng, vin, year);
              carList.add(c);
              totalValue+=c.getPrice();  
              return c;
            }
            System.out.println("AddCar: Incorrect car type passed to addCar method!");
            return null;
        }
    
    /**
     * removeCar takes a Car variable as a param, and returns a null pointer,
     * thus setting the Car that you are trying to remove to null.  Why can't
     * we do this inside the method?
     * To call: c=removeCar(c);
     * @param c the car that you want to remove
     */
    public Car removeCar(Car c){
        totalValue-=c.getPrice();
        return null;
        // you could call System.gc() to force garbage collection
    }
    public int updatePrice()
    {
        int uP = 0;
        for (Car c: carList)
        {
            uP += c.getPrice();
        }
        return uP;
    }
    /**
     * Just a test method to allow testing through Bluej
     * @param n the car (c1,c2...) that you want to remove
     */
    public  void testRemove(int n){
        if (n==1) { c1=removeCar(c1);}
        if (n==2) { c2=removeCar(c2);}
        if (n==3) { c3=removeCar(c3);}
    }
    public int searchVin(String vin)
    {
        for (int i = 0; i< carList.size(); i++)
        {
            if (carList.get(i).getVin().equals(vin))
            {
                return i;
            }
        } 
        return -1;
    }
    public ArrayList<Integer> searchModel(String mod)
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>(0);
        for (int i = 0; i< carList.size(); i++)
        {
            if (carList.get(i).getModel().equals(mod))
            {
                l1.add(i);
            }
        }
        return l1;
    }
    public ArrayList<Integer> searchPrice(int p)
    {
        ArrayList<Integer> l1 = new ArrayList<Integer> ();
        for (int i = 0; i< carList.size(); i++)
        {
            if (carList.get(i).getPrice() <= p)
            {
                l1.add(i);
            }
        }
        return l1;
    }
}
