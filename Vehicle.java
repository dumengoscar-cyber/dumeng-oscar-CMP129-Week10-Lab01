//name: oscar dumeng
// week: 10
// lab: 1
// course: cmp129
// date: 11/3/2026
public class Vehicle {
    private String make;
    private String model;
private int year;
//stores each by itself
public Vehicle(String make, String model, int year)
{
    this.make = make;
    this.model = model;
    this.year = year;
}
  //initilizes info, getters + setters
public String getMake(){ return make; }
public String getModel(){ return model; }
public int getYear(){ return year; }

public void setMake(String make)
{
    this.make = make;
}
public void setModel(String model)
{
    this.model = model;
}
public void setYear(int year)
{
    this.year = year;
}
//output format
public void displayInfo()
{
    System.out.println("make: " + make);
    System.out.println("model: " + model);
    System.out.println("year: "+ year);
}
}
