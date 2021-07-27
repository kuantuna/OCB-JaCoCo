package org.example;

public class HelloWorld
{
    public String getName(String name)
    {
        return name;
    }

    public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld();
        System.out.println("Hello, " + hw.getName("Tuna") + "!");
    }
}
