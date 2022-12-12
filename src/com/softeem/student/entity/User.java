package com.softeem.student.entity;


public class User {

  private long uid;
  private String uname;
  private String password;
  private long status;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", uname='" + uname + '\'' +
            ", password='" + password + '\'' +
            ", status=" + status +
            '}';
  }
}
