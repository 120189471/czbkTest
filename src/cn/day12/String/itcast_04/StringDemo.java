package cn.day12.String.itcast_04;
/*
	String��Ļ�ȡ����
	int length								��ȡ�ַ����ĳ���
	char charAt(int index)					��ȡָ������λ�õ��ַ�
	int indexOf(int ch)						����ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�������ע��Ϊint����
		
	int	indexOf(String str)					����ָ���ַ����ڴ��ַ����е�һ�γ��ִ�����Ӱ
	int indexOf(int ch,int fromIndex)		����ָ���ַ��ڴ��ַ����д�ָ��λ�õ�һ�γ��ִ�������
	int indexOf(String str,int fromIndex)	����ָ���ַ����ڴ��ַ����д�ָ��λ�ÿ�ʼ��һ�γ��ֳ�������
	String substring(int start)				��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
	String subString(int start,int end)		��ָ��λ�ÿ�ʼ��ָ��λ�ý�������ȡ�ַ���
*/
public class StringDemo {
	public static void main(String[] args) {
		String s="Helloworld";
		System.out.println(s.length());
		System.out.println(s.charAt(0)+";");
		//System.out.println(s.charAt(20));	//String index out of rang
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf(99));
		System.out.println(s.indexOf("rl"));
		System.out.println(s.indexOf("l",5));
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(7));
		
		
	}

}
