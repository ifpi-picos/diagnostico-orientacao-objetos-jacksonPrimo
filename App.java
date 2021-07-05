import aggregation.*;
import inheritence.*;
public class App {
  public static void main(String[] args){
    System.out.println("==================== AGREGAÇÃO ===========================");
    Teacher teacher1 = new Teacher("João Paulo");
    Teacher teacher2 = new Teacher("Aislan Rafael");
    Subject subject1 = new Subject("Programação Orientada a Objetos", 1, teacher1);
    Subject subject2 = new Subject("Engenharia de Software", 2, teacher2);
    Course c1 = new Course("Análise e Desenvolvimento de Sistemas");
    c1.AddSubject(subject1);
    c1.AddSubject(subject2);
    c1.showSubjects();
    System.out.println("==================== HERANÇA ===========================");
    Enterprise enterprite1 = new Enterprise("Pague Menos");
    Employee employee1 = new Pf("Jackson", 1500.00, "66666666666");
    Employee employee2 = new Pj("Jefferson", 1500.00, "1111111111111");
    enterprite1.addEmployee(employee1);
    enterprite1.addEmployee(employee2);
    enterprite1.showEmployees();
  }
}
