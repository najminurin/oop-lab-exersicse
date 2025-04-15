public class Parrot extends Bird {
    private String colour;

    public Parrot() {
        this.colour = "";
        System.out.println("Parrot Created");
    }

    @Override
    public void fly() {
        System.out.println("The parrot flies in a colourful pattern");
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setParrotDetails(String name, int age, String colour) {
        setName(name);  // Assuming Bird class has setName and setAge
        setAge(age);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Parrot{" + "name='" + getName() + "', age=" + getAge() + ", colour='" + colour + "'}";
    }
}
