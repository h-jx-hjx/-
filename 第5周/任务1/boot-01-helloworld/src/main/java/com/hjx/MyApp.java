package com.hjx;

import com.hjx.domain.Student01;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        String config="mybatis.xml";
       InputStream in= Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory= builder.build(in);
        SqlSession sqlSession=factory.openSession();
        String sqlId="com.hjx.dao.Student01Dao.selectStudent01";

        List<Student01> student01List=sqlSession.selectList(sqlId);
        student01List.forEach(stu -> System.out.println(stu));
        sqlSession.close();
    }
}
