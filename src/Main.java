
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ExamQuestion> exam = new ArrayList();
        exam.add(new ExamQuestion(1));
        exam.add(new ExamQuestion(2));
        exam.add(new ExamQuestion(3));
        exam.add(new ExamQuestion(4));
        exam.add(new ExamQuestion(5));
        exam.add(new ExamQuestion(6));
        exam.add(new ExamQuestion(7));

        for (ExamQuestion e : exam) {
            System.out.println(e);
        }

        writeToFile(exam);
    }

    public static void writeToFile(List<ExamQuestion> exam){
        try{
            FileWriter writer = new FileWriter("questions.txt");
            for (ExamQuestion e : exam){
                writer.write( "\n" + e);
            }writer.close();

            System.out.println("\nQuestion.txt fil er oprettet!");
        }catch (IOException e){
            System.out.println("Der opstod en fejl." + e.getMessage());
        }
    }

    }


