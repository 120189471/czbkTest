package cn.day14.Random.itcast_01;

import java.util.Random;

/**
 * Created by Searis on 2016/3/4.
 * ��andom�����������
 *
 * ���췽����
 *         public Random()  û�и����ӣ��õ���Ĭ�ϵ����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *         public Random(long seed) ����ָ��������
 *
 *         �������Ӻ�ÿ�θ������������ͬ��
 *
 * ��Ա����
 *      public int nextInt()        ���ص���int��Χ�ڵ������
 *      public int netInt(int n)    ���ص���[0��,n��֮��������
 */
public class RandomDeom {
    public static void main(String[] args) {

        //Random r=new Random();
        Random r=new Random(100);
        for (int x=0;x<5;x++){
            //int i=r.nextInt();
            int i=r.nextInt(100)+1;
            System.out.println(i);
        }
    }
}
