public class SingleTon {
    
    public static void main(String[] args) {
        Car car1=Car.createObject("Thar","Mahindra","diesel");
        Car car2=Car.createObject("Brezza","Maruti","diesel");
        Car car3=Car.createObject("city","Honda","diesel");
       System.out.println(car1.name);
       System.out.println(car2.name);
       System.out.println(car3.name);
    }
}

class Car{
    static Car obj=null;
    String name;
    String brand;
    String _fuelType;

   private Car(String name,String brand2 , String fuelType)
    {
        this.name=name;
        brand=brand2;
        _fuelType=fuelType;
    }
    static Car createObject(String name , String brand , String fuelType)
    {   
        if(obj==null)
        {
           obj= new Car(name,brand ,fuelType);
        }
        return obj; 
    }
}
