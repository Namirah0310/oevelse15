import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number){
        this.number = number;
        Random random = new Random();
        char ran = (char) ('A' + random.nextInt(6));
        this.grade = ran;
    }


    //getters
    public int getNumber(){
        return number;
    }
    public char getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return "Exam question : " + number + " - Grade: " + grade;
    }
}
