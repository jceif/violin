package cn.myviolin.model.userLogin;

import javax.persistence.*;

@Table(name = "user_login")
public class UserLogin {
    /**
     * 自动增长列
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户登陆账号
     */
    @Column(name = "login_account")
    private String loginAccount;

    /**
     * 用户登陆密码
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 用户登陆唯一标识码
     */
    @Column(name = "login_code")
    private String loginCode;

    /**
     * 获取自动增长列
     *
     * @return id - 自动增长列
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自动增长列
     *
     * @param id 自动增长列
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户登陆账号
     *
     * @return login_account - 用户登陆账号
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置用户登陆账号
     *
     * @param loginAccount 用户登陆账号
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * 获取用户登陆密码
     *
     * @return login_pwd - 用户登陆密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置用户登陆密码
     *
     * @param loginPwd 用户登陆密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * 获取用户登陆唯一标识码
     *
     * @return login_code - 用户登陆唯一标识码
     */
    public String getLoginCode() {
        return loginCode;
    }

    /**
     * 设置用户登陆唯一标识码
     *
     * @param loginCode 用户登陆唯一标识码
     */
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }
}