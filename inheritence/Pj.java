package inheritence;

import java.util.ArrayList;
import java.util.Arrays;

public class Pj extends Employee{
  String cnpj;
  public Pj(String name, Double salary, String cnpj){
    super(name, salary);
    this.cnpj = cnpj;
    this.benefits = new ArrayList<>(Arrays.asList("Plano de Saúde"));
  }
  @Override
  public Double getNetSalary() {
    return this.salary - (this.salary * 0.05);
  }
}
