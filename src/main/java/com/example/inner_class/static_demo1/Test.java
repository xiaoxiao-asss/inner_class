package com.example.inner_class.static_demo1;

/**
 * 使用static创建静态内部类，静态内部类中不能有外部类的非静态属性
 */

class Outter {
    private static String msg = "Hello World !";

    static class Inner {
        public void print() {
            System.out.println(msg);
        }
    }

    public void fun() {
        Inner in = new Inner();
        in.print();
    }
}
public class Test{
    public static void main(String[] args) {
        Outter out = new Outter();
        out.fun();
    }
}
