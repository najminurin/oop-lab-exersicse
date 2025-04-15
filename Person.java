public class Person {
   private String name;
   private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
