package inheritence;

import java.util.ArrayList;

public abstract class Employee {
  String name;
  Double salary;
  ArrayList<String> benefits;

  public Employee(String name, Double salary){
    this.name = name;
    this.salary = salary;
  }
  public String getName(){
    return this.name;
  }
  public abstract Double getNetSalary();
  
  public ArrayList<String> getBenefits(){
    return this.benefits;
  }
}
