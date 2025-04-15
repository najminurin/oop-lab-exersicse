public class Bird {
    private String name;
    private int age;

    public Bird(){
        name = "";
        age = 0;
        System.out.println("Birds created");
    }

    public void setName(){
        this.name = name;
    }

    public void setAge(){
        this.age = age;
    }

    public String getName(String name){
        return this.name;
    }

    public int getAge(int age){
        return this.age;
    }
     
    
    public String fly(){
        return "The bird is flying";
    }

    
    public String toString(){
        return "Bird: " + name + "Age :" + age ;
    }


}
