import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    // if I implement the equals, I always implement the hashcode, this is golden rule,
    //Why?
    /*
    Key Takeaways
    -Consistency: If two objects are equal according to the equals method, they must have the same hash code.
    -Hash-Based Collections: Properly implementing both methods ensures correct behavior in hash-based collections.
    -Contract Compliance: Failing to do so can lead to incorrect behavior, such as the inability to find or store objects correctly in collections.
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
