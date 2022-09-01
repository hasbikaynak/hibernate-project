import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    private int id;

    private String name;

    @OneToOne(mappedBy = "question")
    private QuestionDetail questionDetail;

    @OneToMany(mappedBy = "question", orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Answer> answerList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Priority priority;

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

    public QuestionDetail getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(QuestionDetail questionDetail) {
        this.questionDetail = questionDetail;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", questionDetail=" + questionDetail +
                ", answerList=" + answerList +
                ", priority=" + priority +
                '}';
    }
}
