package threads;

import java.sql.SQLOutput;

public class MyThread extends Thread {

        private String nome;
        private int tempo;

        public MyThread(String nome, int tempo) {
            this.nome = nome;
            this.tempo = tempo;
            start();
        }

        public void run() {
            System.out.println("Executando a thread!");

            try {
                for (int i = 0; i < 6; i++) {
                    System.out.println(nome + " contador: " + i);
                    Thread.sleep(tempo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Thread terminou a execucao");
        }
}
