package cn.day04.itcast_01;
/*
	成员变量和局部变量的区别
		a：在类中位置不同
			成员变量：在类中方法外;
			局部变量：在方法定义中或方法声明上
		B：在内存中的位置不同
			成员变量：在堆内存中
			局部变量:在栈内存中
		C：生命周期不同
			成员变量：随对象创建而存在，随对象消失而消失
			局部变量：随着方法的调用而存在，
		D：初始化之不同：
			成员变量:有默认的初始化值
			局部变量:没有默认的初始化值，必须定义，赋值，然后才能使用
*/
public class VariableDemo {
	public static void main(String[] args) {
		Variable v = new Variable();
		v.show();
		System.out.println(v.num);
		
	}
}

class Variable{
	int num;
	public void show(){
		int num2 =3;//The local variable num2 may not have been initialized
		System.out.println(num2);
	}
}
