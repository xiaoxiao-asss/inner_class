package com.example.inner_class.demo1;

class Outer{
    private String msg = "Hello World !";
    class Inner{                            // 定义一个内部类
        public void print(){                // 在类中定义一个普通方法
            System.out.println(msg);        // 在此方法中调用外部类的私有属性
        }
    }
    public void fun(){                      // 在外部类中定义一个方法，该方法用于产生内部类对象并调用print方法
        Inner in = new Inner();             // 实例化对象
        in.print();
    }
}
public class Test{
    public static void main(String[] args) {
        Outer out = new Outer();            // 在主方法中产生外部类的对象
        out.fun();                          // 此对象调用外部类的普通方法
    }
}
