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
        //����һ�������
        int i = (int) (Math.random() * 100) + 1;

        System.out.println("��ӭ�����������Ϸ");

        int count = 0;

        while (true) {

            System.out.println("������1~100������");
            Scanner scanner = new Scanner(System.in);
            int guessNumber = scanner.nextInt();

            count++;

            if (guessNumber > i) {
                System.out.println("��µ����ִ���");

            } else if (guessNumber < i) {
                System.out.println("��µ�����С��");

            } else {
                System.out.println("��ϲ�㣬�¶��ˣ�������" + count + "�Ρ�");
                break;
            }
        }
    }
}
