package cn.day14.Random.itcast_01;

import java.util.Random;

/**
 * Created by Searis on 2016/3/4.
 * Ｒandom：产生随机数
 *
 * 构造方法：
 *         public Random()  没有给种子，用的是默认的种子，是当前时间的毫秒值
 *         public Random(long seed) 给出指定的种子
 *
 *         给定种子后，每次给的随机数是相同的
 *
 * 成员方法
 *      public int nextInt()        返回的是int范围内的随机数
 *      public int netInt(int n)    返回的是[0，,n）之间的随机数
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
