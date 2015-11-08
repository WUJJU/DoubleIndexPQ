import java.util.Scanner;
import java.util.Set;

public class CarTracker {
    
    public static void  print(Object i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        print("");
       int i=0;
       DoublePQ minpq = new DoublePQ();
       print("input 1 to add car");
       print("input 2 to update car");
       print("input 3 to remove car");
       print("input 4 to retrieve lowest price car");
       print("input 5 to retrieve lowest mileage car");
       print("input 6 to retrieve lowest price car by model and make");
       print("input 7 to retrieve lowest mileage car by model and make");
       print("input 8 to retreve all cars in double PQ");
       print("input 9 to quite");
        do{
            
            
            
        i=sc.nextInt();
        if(i==1){//add car
           print("please input the VIN of the car");
           String vin= sc.next();
           print("please input the make of the car");
           String make=sc.next();
           print("please input the model of the car");
           String model=sc.next();
           print("please input the price of the car");
           double price=sc.nextDouble();
           print("please input the mileage of the car");
           int mileage=sc.nextInt();
           print("please input the color of the car");
           String color=sc.next();
           Car car=new Car(vin,make,model,price,mileage,color);
          
           minpq.insert(car);
           print("new car added into Double Priority Queue");
           minpq.printindex();
         }else if(i==2){//update
             print("please input the VIN to update the car");
             String vin=sc.next();
             print("if you want to change color, input c");
             print("if you want to change price, input p");
             print("if you want to change mileage, input m");
             String mode=sc.next();
             if(mode.equals("c")){
                 String color=sc.next();
                 minpq.updateColor(vin,color);
                 print("already updated");
             }else if(mode.equals("p")){
                 double price=sc.nextDouble();
                 minpq.updatePrice(vin,price);
                 print("already updated");
             }else if(mode.equals("m")){
                 int mileage=sc.nextInt();
                 minpq.updateMileage(vin,mileage);
                 print("already updated");
             }else{
                 print("Wrong mode, try again");
             }
                          
         }else if(i==3){//remove
             print("please input the VIN to remove the car");
             String vin=sc.next();
             minpq.delCar(vin);
             print("print all vin and position");
             minpq.printindex();
            
         }else if(i==4){//retrieve the lowest price car 
            Car car=minpq.minp();
            print("Lowest Price Car");
            System.out.println("VIN:"+car.getVIN()+" Make: "+car.getMake()+" Model: "+car.getModel()+" Color: "+car.getColor()+" Mileage: "+car.getMileage()+" Price: "+car.getPrice());
             
         }else if(i==5){//retrieve the lowest mileage car
             Car car=minpq.minm();
             print("Lowest Mileage Car");
             System.out.println("VIN:"+car.getVIN()+" Make: "+car.getMake()+" Model: "+car.getModel()+" Color: "+car.getColor()+" Mileage: "+car.getMileage()+" Price: "+car.getPrice());
              
         }else if(i==6){//retrieve the lowest price by model and make
             print("input model");
             String model=sc.next();
             print("input make");
             String make=sc.next();
             
             Car car=minpq.findP(model, make);
             if(car!=null){
                 System.out.println("VIN:"+car.getVIN()+" Make: "+car.getMake()+" Model: "+car.getModel()+" Color: "+car.getColor()+" Mileage: "+car.getMileage()+" Price: "+car.getPrice());
             }else{
                 print("not find the car in this model and make");
             }
             
             
         }else if(i==7){//retrieve the lowest mileage by model and make
             print("input model");
             String model=sc.next();
             print("input make");
             String make=sc.next();
             
             Car car=minpq.findM(model, make);
             if(car!=null){
                 System.out.println("VIN:"+car.getVIN()+" Make: "+car.getMake()+" Model: "+car.getModel()+" Color: "+car.getColor()+" Mileage: "+car.getMileage()+" Price: "+car.getPrice());
             }else{
                 print("not find the car in this model and make");
             }
         }else if(i==8){
             minpq.findAll();
         }
        
        }while(i!=9);
    }
}
