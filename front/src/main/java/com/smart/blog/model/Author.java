package com.smart.blog.model;


/**
 * 作者
 * <p>
 * Created by zhangjinhua on 16-4-8.
 */
public class Author {
    private int id;//数据库主键
    private String realName;//真实名字
    private String nickName;//昵称
    private String mail;//邮箱
    private String job;//工作
    private String company;//公司

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mail='" + mail + '\'' +
                ", job='" + job + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
