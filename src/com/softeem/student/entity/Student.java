package com.softeem.student.entity;



public class Student {

  private long sno;
  private String sname;
  private String password;
  private String sex;
  private long age;
  private double score;
  private long cid;
  private String examdate;
  private String phone;
  private long status;

  public Student(){}


  public Student(String sname, String password, String sex, long age, double score, long cid, String examdate, String phone, long status) {
    this.sname = sname;
    this.password = password;
    this.sex = sex;
    this.age = age;
    this.score = score;
    this.cid = cid;
    this.examdate = examdate;
    this.phone = phone;
    this.status = status;
  }

  public long getSno() {
    return sno;
  }

  public void setSno(long sno) {
    this.sno = sno;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getExamdate() {
    return examdate;
  }

  public void setExamdate(String examdate) {
    this.examdate = examdate;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Student{" +
            "sno=" + sno +
            ", sname='" + sname + '\'' +
            ", password='" + password + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            ", score=" + score +
            ", cid=" + cid +
            ", examdate=" + examdate +
            ", phone='" + phone + '\'' +
            ", status=" + status +
            '}';
  }
}
