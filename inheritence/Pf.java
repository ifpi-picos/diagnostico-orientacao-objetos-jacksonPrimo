package inheritence;

import java.util.ArrayList;
import java.util.Arrays;

public class Pf extends Employee{
  String cpf;
  public Pf(String name, Double salary, String cpf){
    super(name, salary);
    this.cpf = cpf;
    this.benefits = new ArrayList<>(Arrays.asList("Plano de Saúde", "Vale Refeição", "férias"));
  }
  @Override
  public Double getNetSalary() {
    return this.salary - (this.salary * 0.1);
  }
}
