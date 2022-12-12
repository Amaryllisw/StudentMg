package com.softeem.student.entity;


public class Class {

  private long cid;
  private String cname;
  private String assistTeacher;


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }


  public String getAssistTeacher() {
    return assistTeacher;
  }

  public void setAssistTeacher(String assistTeacher) {
    this.assistTeacher = assistTeacher;
  }

  @Override
  public String toString() {
    return "Class{" +
            "cid=" + cid +
            ", cname='" + cname + '\'' +
            ", assistTeacher='" + assistTeacher + '\'' +
            '}';
  }
}
