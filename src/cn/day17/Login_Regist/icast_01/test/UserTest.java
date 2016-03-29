package cn.day17.Login_Regist.icast_01.test;

import cn.day17.Login_Regist.icast_01.dao.UserDao;
import cn.day17.Login_Regist.icast_01.dao.impl.UserDaoImpl;
import cn.day17.Login_Regist.icast_01.game.GuessNumber;
import cn.day17.Login_Regist.icast_01.pojo.User;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/29.
 * 用户测试类
 *
 * @author Dix
 * @version V1.0
 *          <p>
 *          新增加了两个小问题
 *          <p>
 *          A:多个对象共享同一个成员变量，用静态
 *          B:循环里面如果有switch，并且在switch里面有break，那么结束的不是循环，而是switch语句
 */
public class UserTest {
    public static void main(String[] args) {
        while (true) {
            //给出欢迎界面
            System.out.println("-------------------欢迎登陆-------------------");
            System.out.println("1 登陆");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请输入你的选择： ");
            //键盘输入选择
            Scanner sc = new Scanner(System.in);
            //方便信息录入，选择字符接受
            String choiceString = sc.nextLine();

            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    //登陆界面
                    System.out.println("-------------------欢迎登陆-------------------");

                    System.out.println("请输入用户名：");
                    String userName = sc.nextLine();
                    System.out.println("请输入密码：");
                    String userPwd = sc.nextLine();

                    boolean flag = ud.isLogin(userName, userPwd);
                    if (flag == true) {
                        System.out.println("登陆成功，开始玩游戏吧");
                        GuessNumber.start();

                    } else {
                        System.out.println("用户名和密码输入错误");
                    }
                    break;
                case "2":
                    System.out.println("-------------------欢迎注册-------------------");
                    System.out.println("请输入用户名");
                    String regUserName = sc.nextLine();
                    System.out.println("请输入密码");
                    String regUserPwd = sc.nextLine();

                    User user = new User(regUserName, regUserPwd);
                    ud.register(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                default:
                    System.out.println("欢迎下次使用！");
                    System.exit(0);
                    break;
            }
        }
    }
}
