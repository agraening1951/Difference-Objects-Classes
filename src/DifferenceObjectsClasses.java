// Dachshund is the class
class Dachshund
{
    String name;
    String color;

// Constructor to initialize objects
    public Dachshund(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public void display()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
    }
}

// Dachshund objects
public class DifferenceObjectsClasses
{
    public static void main(String[] args)
    {
        Dachshund dog1 = new Dachshund("Gxx", "Red");
        Dachshund dog2 = new Dachshund("Maple", "Brown & Tan");

        System.out.println("Dog 1:");
        dog1.display();
        System.out.println();

        System.out.println("Dog 2:");
        dog2.display();
    }
}