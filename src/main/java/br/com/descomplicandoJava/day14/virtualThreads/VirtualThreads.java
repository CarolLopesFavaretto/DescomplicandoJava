package br.com.descomplicandoJava.day14.virtualThreads;


//thread - instância da CPU da máquina virtual Java e que tem associada um trecho de código que será executado em uma area de memoria
//são criadas na JVM e não são 1:1 com as threads do sitema operacional
// a JVM fia responsavel por fazer esse gerenciamento das threads

import java.util.Random;

public class VirtualThreads {

    public static void main(String[] args) {
        //flag que controla o uso de threads virtuais
        boolean virtualFlag = false;
        System.out.println("Threads virtuais ligadas? " + virtualFlag);

        long horaInicio = System.currentTimeMillis();

        Random random = new Random();
        // criar numeros inteiros aleatorios ate o valor de bound
        Runnable runnable = () ->{
            Integer i = random.nextInt(999999999);
        };

        for (int i = 0; i <100; i++){
            if (virtualFlag){
//                Thread.startVirtualThread(runnable); -> Java 19

            }else {
                Thread thread = new Thread(runnable);
                thread.start();
            }
        }

        long horaDeFim = System.currentTimeMillis();
        long tempoGasto = horaDeFim - horaInicio;
        System.out.println("Tempo gasto em execução: " + tempoGasto);
    }
}
