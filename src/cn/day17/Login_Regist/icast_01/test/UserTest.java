package cn.day17.Login_Regist.icast_01.test;

import cn.day17.Login_Regist.icast_01.dao.UserDao;
import cn.day17.Login_Regist.icast_01.dao.impl.UserDaoImpl;
import cn.day17.Login_Regist.icast_01.game.GuessNumber;
import cn.day17.Login_Regist.icast_01.pojo.User;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/29.
 * �û�������
 *
 * @author Dix
 * @version V1.0
 *          <p>
 *          ������������С����
 *          <p>
 *          A:���������ͬһ����Ա�������þ�̬
 *          B:ѭ�����������switch��������switch������break����ô�����Ĳ���ѭ��������switch���
 */
public class UserTest {
    public static void main(String[] args) {
        while (true) {
            //������ӭ����
            System.out.println("-------------------��ӭ��½-------------------");
            System.out.println("1 ��½");
            System.out.println("2 ע��");
            System.out.println("3 �˳�");
            System.out.println("���������ѡ�� ");
            //��������ѡ��
            Scanner sc = new Scanner(System.in);
            //������Ϣ¼�룬ѡ���ַ�����
            String choiceString = sc.nextLine();

            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    //��½����
                    System.out.println("-------------------��ӭ��½-------------------");

                    System.out.println("�������û�����");
                    String userName = sc.nextLine();
                    System.out.println("���������룺");
                    String userPwd = sc.nextLine();

                    boolean flag = ud.isLogin(userName, userPwd);
                    if (flag == true) {
                        System.out.println("��½�ɹ�����ʼ����Ϸ��");
                        GuessNumber.start();

                    } else {
                        System.out.println("�û����������������");
                    }
                    break;
                case "2":
                    System.out.println("-------------------��ӭע��-------------------");
                    System.out.println("�������û���");
                    String regUserName = sc.nextLine();
                    System.out.println("����������");
                    String regUserPwd = sc.nextLine();

                    User user = new User(regUserName, regUserPwd);
                    ud.register(user);
                    System.out.println("ע��ɹ�");
                    break;
                case "3":
                default:
                    System.out.println("��ӭ�´�ʹ�ã�");
                    System.exit(0);
                    break;
            }
        }
    }
}
