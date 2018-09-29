package com.alick.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 功能:
 * 作者: 崔兴旺
 * 日期: 2018/9/27
 * 备注:
 */
public class UserInfo extends BaseObservable {
    private String username="无";
    private boolean sex;
    private int age;
    private String userId;

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(com.alick.databinding.BR.username);
    }

    @Bindable
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
        notifyPropertyChanged(com.alick.databinding.BR.sex);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.alick.databinding.BR.age);
    }

    @Bindable
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
        notifyPropertyChanged(com.alick.databinding.BR.userId);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", userId='" + userId + '\'' +
                '}';
    }
}
