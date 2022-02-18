package com.macro.mall.tiny.Test;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/2/10 17:14
 */
public class SyncTest {
    private static Object o1=new Object();
    private static Object o2=new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (o1){
                System.out.println(Thread.currentThread()+"get o1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"waiting get o2");
                synchronized (o2){
                    System.out.println(Thread.currentThread()+"get o2");
                }
            }

        }).start();

        new Thread(()->{
            synchronized (o2){
                System.out.println(Thread.currentThread()+"get o2");
                try {
                     
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"waiting get o1");
                synchronized (o1){
                    System.out.println(Thread.currentThread()+"get o1");
                }
            }
        }).start();
    }
}
