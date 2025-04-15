public class Vehicle{
    private String brand;
    private int year;


    public Vehicle(){
        this.brand = " ";
        this.year = 0;
    }

    public void setBrand (String brand){
        this.brand = brand;
    }

    public void setYear (int year){
        this.year = year;
    }

    public String getBrand (){
        return this.brand;
    }

    public int getYear (){
        return this.year;
    }

}