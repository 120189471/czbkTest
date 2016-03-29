package cn.day17.Login_Regist.icast_01.game;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/29.
 *
 * @author Dix
 * @version V1.0
 */
public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //创建一个随机数
        int i = (int) (Math.random() * 100) + 1;

        System.out.println("欢迎进入猜数字游戏");

        int count = 0;

        while (true) {

            System.out.println("请输入1~100间数字");
            Scanner scanner = new Scanner(System.in);
            int guessNumber = scanner.nextInt();

            count++;

            if (guessNumber > i) {
                System.out.println("你猜的数字大了");

            } else if (guessNumber < i) {
                System.out.println("你猜的数字小了");

            } else {
                System.out.println("恭喜你，猜对了！共用了" + count + "次。");
                break;
            }
        }
    }
}
