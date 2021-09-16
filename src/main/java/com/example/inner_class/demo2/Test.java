package com.example.inner_class.demo2;

class Outer{
    private String msg = "Hello World !";
    public String getMsg(){                     // 通过此对象才能调用msg属性
        return this.msg;
    }
    public void fun(){
        Inner in = new Inner(this);         // 3、由out对象调用fun方法
        in.print();                              // 6、this表示当前对象，调用print方法
    }
}

class Inner {
    private Outer out;
    public Inner (Outer out){                   // 4、Inner.out = main.out
        this.out = out;                         // 5、引用传递
    }
    public void print(){                        // 7、执行方法
        System.out.println(out.getMsg());
    }
}

public class Test{
    public static void main(String[] args) {
        Outer out = new Outer();                // 1、实例化Outter对象
        out.fun();                              // 2、调用Outter类方法
    }
}

