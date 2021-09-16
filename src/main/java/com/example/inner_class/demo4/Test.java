package com.example.inner_class.demo4;

/**
 * 观察内部类可以直接访问外部类的元素 （内部类可以直接访问外部类的原因：编译以后内部内有一个指向外部类的引用  格式：外部类.this）
 */
class Outter {
    private String outName;
    private int outAge;
    class Inner{
        private int inAge;
        public Inner(){
            Outter.this.outName = "I am a Outerclass";
            Outter.this.outAge = 18;
        }
        public void play(){
            System.out.println(outName);
            System.out.println(outAge);
        }
    }
}
public class Test{
    public static void main(String[] args) {
        Outter.Inner inner = new Outter().new Inner();
        inner.play();
    }
}

