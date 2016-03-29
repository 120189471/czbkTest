package cn.day17.Login_Regist.icast_01.dao;

import cn.day17.Login_Regist.icast_01.pojo.User;

/**
 * 这是针对用户的进行操作的接口
 *
 * Created by Searis on 2016/3/29.
 * @author Dix
 * @version 1.0
 */
public interface UserDao {
    /**
     *
     * @param userName
     *      用户名
     * @param userPwd
     *      密码
     * @return
     *      返回登陆是否成功状态
     */
    public abstract boolean isLogin(String userName,String  userPwd);

    public abstract void register(User user);



}
