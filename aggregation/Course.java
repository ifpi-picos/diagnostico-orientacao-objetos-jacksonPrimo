package aggregation;
import java.util.ArrayList;

public class Course {
  String name;
  ArrayList<Subject> subjects;
  
  public Course(String name){
    this.name = name;
    this.subjects = new ArrayList<Subject>();
  }

  public void AddSubject(Subject s){
    subjects.add(s);
  }
  public void RemoveSubject(int index){
    subjects.remove(index);
  }
  public void showSubjects(){
    subjects.forEach(el->{
      System.out.printf("Disciplina: %s \n", el.name);
      System.out.printf("professor: %s \n", el.teacher.name);
    });
  }
}
