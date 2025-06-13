// package ASSIGNMENTFOLDERKUNAL.KunalOOP.OOPClass1;

public class CarClass {
    public static void main(String[] args) {
        // Car car = new Car();
        Car Maruti = new Car("Maruti","Petrol Engine",100000,4);
        Car Farari = new Car("Farari","Diesal Engine",20000000,2);
        Car Tesla =  new Car("Tesla","Electric Engine",10000000,4);
        System.out.println(Maruti.toString()+"\n");
        System.out.println(Farari.toString()+"\n");
        System.out.println(Tesla.toString());
        System.out.println(Farari.Price);
    }
}

class Car{
    String C_Name;
    String Engine;
    double Price;
    int seats;

    Car(){
        // this.Engine=Engine;
        // this.Price=Price;
        // this.seats=seats;
    }

    Car(String C_Name,String Engine,int seats){
        this.C_Name=C_Name;
        this.Engine=Engine;
        this.seats=seats;
    }

    Car(String C_Name,String Engine,double Price,int seats){
        this.C_Name=C_Name;
        this.Engine=Engine;
        this.Price=Price;
        this.seats=seats;
    }

    public String toString(){
        return "Car:"+C_Name+"\nEngine_Type:"+Engine +"\nPrice:"+Price+"\nSeats: "+seats;
    }
}
