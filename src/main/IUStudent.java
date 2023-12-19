package main;

public class IUStudent extends Student{
    public IUStudent(String fio, int course, int marklast){
        super(fio, course, marklast);
    }
    public String writeExam(){
        return "Пишет экзамен по программированию.";
    }
}
