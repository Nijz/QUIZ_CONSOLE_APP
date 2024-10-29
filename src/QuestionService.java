import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String ans[] = new String[5];

    public QuestionService(){

        questions[0] = new Question(1, "What is the name of the first programming language?", "C", "C", "C++", "Python", "JavaScript");
        questions[1] = new Question(2, "Who is the founder of Java?", "Guido van Rossum", "Bill Gates", "Steve Jobs", "Larry Page", "Guido van Rossum");
        questions[2] = new Question(3, "In which year was Java released?", "1995", "1996", "1997", "1998", "1999");
        questions[3] = new Question(4, "What is the name of the first Java framework?", "Spring", "Spring", "Struts", "Hibernate", "JSF");
        questions[4] = new Question(5, "Who is the G.O.A.T of cricket", "Virat Kohli", "Virat Kohli", "Rohit Sharma", "Abd Velliers", "Sachin Tendulkar");

    }

    public void playQuiz() {

        int i = 0;
        int marks = 0;

        for(Question q : questions){
            System.out.print("Question No. " + q.getId());
            System.out.println(") " +q.getQuestion());
            System.out.println("A) " + q.getOpt1());
            System.out.println("B) " + q.getOpt2());
            System.out.println("C) " + q.getOpt3());
            System.out.println("D) " + q.getOpt4());
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            ans[i] = sc.nextLine();
            i++;
            if(q.getAnswer().equals(ans[i-1])){
                System.out.println("Correct Answer");
                marks++;
            }
            else{
                System.out.println("Wrong Answer");
                System.out.println("Correct Answer is -> " + q.getAnswer());
            }
        }

        System.out.println("=============================================================");
        System.out.println("Your answers: ");
        for(String s : ans){
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("=============================================================");

        System.out.println("Total marks: " + marks + "/5");

    }
}
