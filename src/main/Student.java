package main;

public abstract class Student {
    private String fio;
    private int course;
    private int marklast;
    public Student(String fio, int course, int marklast){
        this.fio = fio;
        this.course = course;
        this.marklast = marklast;
    }
    abstract String writeExam();
}
