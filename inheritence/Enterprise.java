package inheritence;

import java.util.ArrayList;

public class Enterprise {
  String name;
  ArrayList<Employee> employees = new ArrayList<Employee>();
  public Enterprise(String name){
    this.name = name;
  }
  public void addEmployee(Employee e){
    this.employees.add(e);
  }
  public void showEmployees(){
    this.employees.forEach(e->{
      System.out.printf("nome: %s \n", e.getName());
      System.out.printf("salario liquido: %f \n", e.getNetSalary());
      System.out.printf("Benefícios: \n");
      e.getBenefits().forEach(b->{
        System.out.printf("%s \n", b);
      });
    });
  }
}
