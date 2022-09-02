import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        Question question4 = new Question();

        QuestionDetail questionDetail1 = new QuestionDetail();
        QuestionDetail questionDetail2 = new QuestionDetail();
        QuestionDetail questionDetail3 = new QuestionDetail();
        QuestionDetail questionDetail4 = new QuestionDetail();

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();
        Answer answer4 = new Answer();
        Answer answer5 = new Answer();
        Answer answer6 = new Answer();
        Answer answer7 = new Answer();
        Answer answer8 = new Answer();

        question1.setId(101);
        question1.setName("Do you have keys to the office?");
        question1.setPriority(Priority.OTHER);
        question1.setQuestionDetail(questionDetail1);
        question1.getAnswerList().add(answer1);
        question1.getAnswerList().add(answer2);


        question2.setId(102);
        question2.setName("Do you have token to enter the side?");
        question2.setPriority(Priority.FIRST);
        question2.setQuestionDetail(questionDetail2);
        question2.getAnswerList().add(answer3);
        question2.getAnswerList().add(answer4);

        question3.setId(103);
        question3.setName("Do you need credentials to login?");
        question3.setPriority(Priority.SECOND);
        question3.setQuestionDetail(questionDetail3);
        question3.getAnswerList().add(answer5);
        question3.getAnswerList().add(answer6);


        question4.setId(104);
        question4.setName("Do you want to change your password?");
        question4.setPriority(Priority.THIRD);
        question4.setQuestionDetail(questionDetail4);
        question4.getAnswerList().add(answer7);
        question4.getAnswerList().add(answer8);

        questionDetail1.setId(1);
        questionDetail1.setDescription("If you have the keys, you can enter the office anytime you want");
        questionDetail1.setQuestion(question1);

        questionDetail2.setId(2);
        questionDetail2.setDescription("If you have token, you can enter the internet side without asking any permission");
        questionDetail2.setQuestion(question2);

        questionDetail3.setId(3);
        questionDetail3.setDescription("If you need your credentials, the system can create credentials for you");
        questionDetail3.setQuestion(question3);

        questionDetail4.setId(4);
        questionDetail4.setDescription("If you need to change your password, you can do it just by typing new password");
        questionDetail4.setQuestion(question4);


        answer1.setId(1001);
        answer1.setName("No,I don`t have the keys");
        answer1.setQuestion(question1);
        answer1.setDescription(questionDetail1.getDescription());

        answer2.setId(1002);
        answer2.setName("Yes,I have the keys");
        answer2.setQuestion(question1);
        answer2.setDescription(questionDetail1.getDescription());

        answer3.setId(1003);
        answer3.setName("No, I don`t have token");
        answer3.setQuestion(question2);
        answer3.setDescription(questionDetail2.getDescription());

        answer4.setId(1004);
        answer4.setName("Yes,I have token");
        answer4.setQuestion(question2);
        answer4.setDescription(questionDetail2.getDescription());

        answer5.setId(1005);
        answer5.setName("No, I don`t need it");
        answer5.setQuestion(question3);
        answer5.setDescription(questionDetail3.getDescription());

        answer6.setId(1006);
        answer6.setName("Yes,I need it");
        answer6.setQuestion(question3);
        answer6.setDescription(questionDetail3.getDescription());

        answer7.setId(1007);
        answer7.setName("Yes, I need to change it");
        answer7.setQuestion(question4);
        answer7.setDescription(questionDetail4.getDescription());

        answer8.setId(1008);
        answer8.setName("No, I don`t need to change it");
        answer8.setQuestion(question4);
        answer8.setDescription(questionDetail4.getDescription());



        ConfigurationSessionTransaction.getConfiguration();


        ConfigurationSessionTransaction.session.save(question1);
        ConfigurationSessionTransaction.session.save(question2);
        ConfigurationSessionTransaction.session.save(question3);
        ConfigurationSessionTransaction.session.save(question4);

        ConfigurationSessionTransaction.session.save(questionDetail1);
        ConfigurationSessionTransaction.session.save(questionDetail2);
        ConfigurationSessionTransaction.session.save(questionDetail3);
        ConfigurationSessionTransaction.session.save(questionDetail4);

        ConfigurationSessionTransaction.session.save(answer1);
        ConfigurationSessionTransaction.session.save(answer2);
        ConfigurationSessionTransaction.session.save(answer3);
        ConfigurationSessionTransaction.session.save(answer4);
        ConfigurationSessionTransaction.session.save(answer5);
        ConfigurationSessionTransaction.session.save(answer6);
        ConfigurationSessionTransaction.session.save(answer7);
        ConfigurationSessionTransaction.session.save(answer8);

        ConfigurationSessionTransaction.closeAll();
    }
}
