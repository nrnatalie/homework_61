

  import java.util.Objects;

  public class Student implements Comparable<Student> {

    String name;
    int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setScore(int score) {
      this.score = score;
    }

    public static String getName() {
      return name;
    }

    public int getScore() {
      return score;
    }

    @Override
    public String toString() {
      return name + " (score: " + score + ")";
    }


    @Override
    public int compareTo(Student o) {
      return 0;
    }
  }
