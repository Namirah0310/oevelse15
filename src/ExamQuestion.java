import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number, char grade){

        this.number = number;
        this.grade = grade;
    }

    public int getNumber(){
        return number;
    }
    public char getGrade(){
        return grade;
    }

    // setter
    public void setGrade(char grade){
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "";
    }
}
