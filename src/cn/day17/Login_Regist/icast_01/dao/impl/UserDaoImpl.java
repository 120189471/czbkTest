package cn.day17.Login_Regist.icast_01.dao.impl;

import cn.day17.Login_Regist.icast_01.dao.UserDao;
import cn.day17.Login_Regist.icast_01.pojo.User;

import java.util.ArrayList;


/**
 * Created by Searis on 2016/3/29.
 * <p>
 * �����û���������ʵ����
 *
 * @author Dix
 * @version V1.0
 */
public class UserDaoImpl implements UserDao {
    // Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա����
    // Ϊ�˲������˿�������private
    // Ϊ���ö��������ͬһ����Ա��������static
    private static ArrayList<User> arrayList = new ArrayList<User>();

    @Override
    public boolean isLogin(String userName, String userPwd) {
        // �������ϣ���ȡÿһ���û������жϸ��û����û����������Ƿ�ʹ��ݹ�����ƥ��
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
