package threads;

public class ThreadTest {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread#1", 900);
        MyThread thread2 = new MyThread("Thread#2", 300);
        MyThread thread3 = new MyThread("Thread#3", 500);

    }
}
