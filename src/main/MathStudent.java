package main;

public class MathStudent extends Student {
    public MathStudent(String fio, int course, int marklast){
        super(fio, course, marklast);
    }
    public String writeExam(){
        return "Пишет экзамен по математике.";
    }
}
