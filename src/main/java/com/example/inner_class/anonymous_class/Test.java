package com.example.inner_class.anonymous_class;

interface MyInterface {
    void test();
}
class Outter {
    private int num;
    public void play(int para) {
// 匿名内部类，实现了MyInterface接口

        new MyInterface(){
            @Override
            public void test() {
                System.out.println("匿名内部类"+para);
            }
        }.test();
    }
}
public class Test {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.play(20);
    }
}
