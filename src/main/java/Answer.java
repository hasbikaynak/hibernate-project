import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    private int id;

    private String name;

    private String description;
}
