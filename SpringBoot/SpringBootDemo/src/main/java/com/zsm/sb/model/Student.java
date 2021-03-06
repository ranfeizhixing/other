package com.zsm.sb.model;

import java.util.Date;

public class Student {
    private Integer id;

    private String user_no;

    private String user_name;

    private String password;

    private String user_sex;

    private Date user_birthday;

    private String user_class;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no == null ? null : user_no.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex == null ? null : user_sex.trim();
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_class() {
        return user_class;
    }

    public void setUser_class(String user_class) {
        this.user_class = user_class == null ? null : user_class.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString()
    {
        return "Student{" +
               "id=" + id +
               ", user_no='" + user_no + '\'' +
               ", user_name='" + user_name + '\'' +
               ", password='" + password + '\'' +
               ", user_sex='" + user_sex + '\'' +
               ", user_birthday=" + user_birthday +
               ", user_class='" + user_class + '\'' +
               ", createtime=" + createtime +
               ", updatetime=" + updatetime +
               '}';
    }
}
