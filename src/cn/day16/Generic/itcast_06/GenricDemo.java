package cn.day16.Generic.itcast_06;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Searis on 2016/3/23.
 * <p>
 * 泛型的通配符
 * ？
 * ？ extends E
 * ? super E
 */
public class GenricDemo {
    public static void main(String[] args) {
        //? 表示所有类型
        Collection<?> c = new ArrayList<Object>();
        //泛型如果明确的时候，定义前后必须一致
        Collection<Object> c1 = new ArrayList<Object>();
        //Collection<Object> c2=new ArrayList<Animal>();
        //Collection<Object> c3=new ArrayList<Dog>();
        //Collection<Object> c4=new ArrayList<Cat>();

        //向下限定，E包括其子类
        //Collection<? extends Animal> c5=new ArrayList<Object>();
        Collection<? extends Animal> c6 = new ArrayList<Animal>();
        Collection<? extends Animal> c7 = new ArrayList<Dog>();
        Collection<? extends Animal> c8 = new ArrayList<Cat>();

        //向上限定，E包括父类
        Collection<? super Animal> c9 = new ArrayList<Object>();
        Collection<? super Animal> c10 = new ArrayList<Animal>();
        //Collection<? super Animal> c11=new ArrayList<Dog>();
        //Collection<? super Animal> c12=new ArrayList<Cat>();
    }

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

