public class RunnerFetch {
    public static void main(String[] args) {
        ConfigurationSessionTransaction.getConfiguration();

//         Question question1 = ConfigurationSessionTransaction.session.get(Question.class, 101);
//        System.out.println(question1);

        String hqlQuery = "from Question";
        var resultList =  ConfigurationSessionTransaction.session.createQuery(hqlQuery).getResultList();
        for (var result: resultList) {
            System.out.println(result);
        }

        ConfigurationSessionTransaction.closeAll();
    }
}
