package cn.day17.Login_Regist.icast_01.dao;

import cn.day17.Login_Regist.icast_01.pojo.User;

/**
 * ��������û��Ľ��в����Ľӿ�
 *
 * Created by Searis on 2016/3/29.
 * @author Dix
 * @version 1.0
 */
public interface UserDao {
    /**
     *
     * @param userName
     *      �û���
     * @param userPwd
     *      ����
     * @return
     *      ���ص�½�Ƿ�ɹ�״̬
     */
    public abstract boolean isLogin(String userName,String  userPwd);

    public abstract void register(User user);



}
