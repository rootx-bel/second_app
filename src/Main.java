import main.*;

public class Main {
    public static void main(String[] args) {
        IUStudent iu = new IUStudent("VMK",1,5);
        MathStudent ma = new MathStudent("VMK",1,5);
        System.out.println(iu.writeExam());
        System.out.println(ma.writeExam());
        Storage storage = new Storage();
        storage.append("test221");
        storage.append("test1");
        storage.append("test21");
        System.out.println(storage.displayMax());
        System.out.println(storage.displaySr());
    }
}