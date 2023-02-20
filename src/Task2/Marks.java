package Task2;

public abstract class Marks {
    abstract void getPrecentage();
}
class studentA extends Marks{
    @Override
    void getPrecentage() {
        int average=(subject1+subject2+subject3)/3;
        System.out.println(average);
    }

    int subject1;
    int subject2;
    int subject3;

    public studentA(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
}
class studentB extends Marks{
    @Override
    void getPrecentage() {
        int average=(subject1+subject2+subject3+subject4)/4;
        System.out.println(average);
    }
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public studentB(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
}
class Main{
    public static void main(String[] args) {
        studentA hw=new studentA(80,70,90);
        hw.getPrecentage();
        studentB hw1=new studentB(90,65,82,98);
        hw1.getPrecentage();
    }
}
