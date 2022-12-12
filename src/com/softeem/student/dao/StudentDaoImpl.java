package com.softeem.student.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.softeem.student.entity.Student;
import com.softeem.student.utils.PageBean;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    @Override
    public Student login(String name, String password) {
        return null;
    }

    @Override
    public List<Student> allInfo() throws SQLException {
        String sql ="select * from student";
        List<Student> studentList = qr.query(sql, new BeanListHandler<Student>(Student.class));
        // BeanListHandler集合，BeanHandler单个对象
        return studentList;
    }

    //升级的带分页的查询 关键字Limit
    @Override
    public List<Student> allInfo(PageBean pageBean) throws SQLException {
        String sql = "select * from student limit ?,?";
        //①?每页起始索引 ②？每页条数
        //获取每页起始索引
        int start =(pageBean.getPageNum()-1)* pageBean.getPageSize();
        //0=（1-1）*3,3           第1页
        //3=（2-1）*3,3           第2页
        //6=（3-1）*3,3           第3页
        //    ?     ,3           pageNum.getPageNum()
        //起始索引 =（第?页-1 *）每页条数
        List<Student> list = qr.query(sql,new BeanListHandler<Student>(Student.class),start,pageBean.getPageSize());
        return list;
    }

    @Override
    public List<Student> allInfo2(PageBean pageBean) throws SQLException {
        String sql = "select * from student where 1=1 ";
        if(!(pageBean.getName()==null || pageBean.getName().equals(""))){
            sql+=" and sname like'%"+pageBean.getName()+"%'";
        }
        if(!(pageBean.getScoreFrom()==null || pageBean.getScoreFrom().equals(""))){
            sql+=" and score >= "+pageBean.getScoreFrom();
        }
        if(!(pageBean.getScoreTo()==null || pageBean.getScoreTo().equals(""))){
            sql+=" and score <= "+pageBean.getScoreTo();
        }
        if(!(pageBean.getCid()==null || pageBean.getCid().equals(""))){
            sql+=" and cid = "+pageBean.getCid();
        }
        sql +=" limit ?,?";
        System.out.println("sql："+sql);
        int start =(pageBean.getPageNum()-1)* pageBean.getPageSize();
        List<Student> list = qr.query(sql,new BeanListHandler<Student>(Student.class),start,pageBean.getPageSize());
        return list;
    }



    @Override
    public int addInfo(Student s) throws SQLException {
        String sql ="insert into student(sname,password,sex,age,score,cid,examdate,phone,status)"+
                "values(?,?,?,?,?,?,?,?,?)";
        int i = qr.update(sql,s.getSname(),s.getPassword(),s.getSex(),s.getAge()
                ,s.getScore(),s.getCid(),s.getExamdate(),s.getPhone(),s.getStatus());
        return i;
    }

    @Override
    public Student getInfoById(int id) throws SQLException {
        String sql = "select * from student where sno =?";
        Student student = qr.query(sql, new BeanHandler<Student>(Student.class),id);
        return student;
    }

    @Override
    public int update(Student s) throws SQLException {
        String sql = "update student set sname=?,password=?," +
                "sex=?,age=?,score=?,cid =?,examdate=?,phone=?,status=? where = sno";
        int i = qr.update(sql,s.getSname(),s.getPassword(),s.getSex(),s.getAge()
                ,s.getScore(),s.getCid(),s.getExamdate(),s.getPhone(),s.getStatus());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException {
        return qr.update("delete  from  student where sno = ?",id);
    }

    //获取表格中的记录数
    @Override
    public int totalCounts() throws SQLException{
        String sql = "select count(*) from student"; //返回了统计结果
        String i  = qr.query(sql,new ScalarHandler()).toString();
        return Integer.valueOf(i);
        /*
        初代版本
        String sql = "select count(*) from student"; //返回了统计结果
        int i  = qr.query(sql,new ScalarHandler<>());
        return i;      报错！！！！！！！
        */
    }
}
