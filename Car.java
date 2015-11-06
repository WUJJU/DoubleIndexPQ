
public class Car {
    
    private String VIN;
    private String make;
    private String model;
    private double price;
    private int mileage;
    private String color;
 
    public Car(){
        
    }
    public Car(String VIN,String make,String model,double price,int mileage,String color){
        this.VIN=VIN;
        this.make=make;
        this.model=model;
        this.price=price;
        this.mileage=mileage;
        this.color=color;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String vIN) {
        this.VIN = vIN;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
   
    

}
