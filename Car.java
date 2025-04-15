public class Car extends Vehicle{
  private int numberOfDoors;
  
  public Car(){
    this.numberOfDoors = 4;
    System.out.println("Car default constructor is called");
  }

  public void setCarDetails(String brand , int year){
    setBrand(brand);
    setYear(year);
  }

  public void displayCarInfo(){
    System.out.println("Brand : " + getBrand() + "\n" +"Year: " +getYear() + "\nNumber of doors : " +numberOfDoors);
  }
}