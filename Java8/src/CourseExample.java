import java.util.*;
import java.util.stream.Collectors;

class Course {
  private final String name;
  private final int students;

  public Course(String name, int students) {
    this.name = name;
    this.students = students;
  }

  public int getStudents() {
    return students;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Course [name=" + name + ", students=" + students + "]";
  }
}

public class CourseExample{
  public static void main(String[] args) {
    List<Course> courses = new ArrayList<Course>();
    courses.add(new Course("C++", 400));
    courses.add(new Course("C#", 200));
    courses.add(new Course("Java", 100));
    courses.add(new Course("Python", 300));

    courses
        .stream()
        .filter(c -> c.getStudents() >= 300)
        .collect(Collectors.toMap(
            Course::getName,
            Course::getStudents
        ))
        .forEach((name, students) -> {
          System.out.println(name + ": " + students);
        });
  }
}