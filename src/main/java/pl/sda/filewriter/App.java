package pl.sda.filewriter;


import java.util.Scanner;

public class App
{

    static class Task1 implements Runnable {

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            SingletonEnum fileSingleton = SingletonEnum.INSTANCE;
            fileSingleton.write(scanner.nextLine(), scanner.nextLine());
        }
    }
    static class Task2 implements Runnable {

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            SingletonEnum fileSingleton = SingletonEnum.INSTANCE;
            fileSingleton.write(scanner.nextLine(), scanner.nextLine());
        }
    }


    public static void main( String[] args )
    {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();





    }
}
