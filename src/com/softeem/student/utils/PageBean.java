package com.softeem.student.utils;

public class PageBean {
    //分页要素：当前页，每页数，总页数，总条数
    private  int pageNum;  //当前页
    private  int pageSize = 3; //每页条数
    private  int totalPages; //总页数
    private  int totalCounts; //总条数


    //追加条件查询的要素
    private String name="";
    private String scoreFrom="";       //成绩条件：开始成绩
    private String scoreTo="";         //成绩条件：结束成绩
    private String cid="";             //班级
    private String examdateFrom;    //考试时间：开始
    private String examdateTo;      //考试时间：结束


    public PageBean() {}

    public int getPageNum() {
        return pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScoreFrom() {
        return scoreFrom;
    }

    public void setScoreFrom(String scoreFrom) {
        this.scoreFrom = scoreFrom;
    }

    public String getScoreTo() {
        return scoreTo;
    }

    public void setScoreTo(String scoreTo) {
        this.scoreTo = scoreTo;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getExamdateFrom() {
        return examdateFrom;
    }

    public void setExamdateFrom(String examdateFrom) {
        this.examdateFrom = examdateFrom;
    }

    public String getExamdateTo() {
        return examdateTo;
    }

    public void setExamdateTo(String examdateTo) {
        this.examdateTo = examdateTo;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public PageBean(int pageNum, int pageSize, int totalPages, int totalCounts) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalCounts = totalCounts;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", totalCounts=" + totalCounts +
                ", name='" + name + '\'' +
                ", scoreFrom='" + scoreFrom + '\'' +
                ", scoreTo='" + scoreTo + '\'' +
                ", cid='" + cid + '\'' +
                ", examdateFrom='" + examdateFrom + '\'' +
                ", examdateTo='" + examdateTo + '\'' +
                '}';
    }
}
