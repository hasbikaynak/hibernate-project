import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionDetail {

    @Id
    private int id;

    private String description;

    @OneToOne
    private Question question;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "QuestionDetail{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
