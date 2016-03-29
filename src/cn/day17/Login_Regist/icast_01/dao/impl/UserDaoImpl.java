package cn.day17.Login_Regist.icast_01.dao.impl;

import cn.day17.Login_Regist.icast_01.dao.UserDao;
import cn.day17.Login_Regist.icast_01.pojo.User;

import java.util.ArrayList;


/**
 * Created by Searis on 2016/3/29.
 * <p>
 * 这是用户操作具体实现类
 *
 * @author Dix
 * @version V1.0
 */
public class UserDaoImpl implements UserDao {
    // 为了让多个方法能够使用同一个集合，就把集合定义为成员变量
    // 为了不让外人看到，用private
    // 为了让多个对象共享同一个成员变量，用static
    private static ArrayList<User> arrayList = new ArrayList<User>();

    @Override
    public boolean isLogin(String userName, String userPwd) {
        // 遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;

        for (User user : arrayList) {
            if (user.getUserName().equals(userName) &&
                    user.getUserPwd().equals(userPwd)) {
                flag=true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void register(User user) {
        arrayList.add(user);
    }
}
