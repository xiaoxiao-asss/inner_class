package com.example.inner_class;

/**
 * 观察外部类可以通过 内部类引用 间接访问内部类元素
 */
class Outter {
    public void play() {
        Inner inner = new Inner();
        inner.play();
    }
    class Inner {
        public void play() {
            System.out.println("I am a InnerClass");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Outter out = new Outter();
        out.play();
    }
}
