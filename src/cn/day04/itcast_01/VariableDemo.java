package cn.day04.itcast_01;
/*
	��Ա�����;ֲ�����������
		a��������λ�ò�ͬ
			��Ա�����������з�����;
			�ֲ��������ڷ��������л򷽷�������
		B�����ڴ��е�λ�ò�ͬ
			��Ա�������ڶ��ڴ���
			�ֲ�����:��ջ�ڴ���
		C���������ڲ�ͬ
			��Ա����������󴴽������ڣ��������ʧ����ʧ
			�ֲ����������ŷ����ĵ��ö����ڣ�
		D����ʼ��֮��ͬ��
			��Ա����:��Ĭ�ϵĳ�ʼ��ֵ
			�ֲ�����:û��Ĭ�ϵĳ�ʼ��ֵ�����붨�壬��ֵ��Ȼ�����ʹ��
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
