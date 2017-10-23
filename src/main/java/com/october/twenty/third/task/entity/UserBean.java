package com.october.twenty.third.task.entity;

public class UserBean {
    private String account;
    private String password;
    private String namer;
    private String address;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamer() {
        return namer;
    }

    public void setNamer(String namer) {
        this.namer = namer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserBean() {
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", namer='" + namer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
