package com.example.inner_class.demo5;

/**
 * 观察方法内部类
 */
class Outter{
    private int num;
    public void play(int test){
        class Inner{
            private void fun(){
                num++;
                System.out.println(num);
                System.out.println(test);
            }
        }
        new Inner().fun();
    }
}
public class Test{
    public static void main(String[] args) {
        Outter out = new Outter();
        out.play(18);
    }
}

