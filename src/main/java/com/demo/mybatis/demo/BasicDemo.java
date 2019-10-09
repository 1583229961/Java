package com.demo.mybatis.demo;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.demo.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class BasicDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
        //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        Reader reader = Resources.getResourceAsReader(resource); 
        //����sqlSession�Ĺ���
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //������ִ��ӳ���ļ���sql��sqlSession
//        SqlSession session = sessionFactory.openSession();
//        String statement="com.demo.mybatis.DBMapping.UserMapper.addUser";
//        User user=new User("usermode",22,222.22,UserState.AVAILABLE);
//        session.insert(statement,user);
//        session.commit();
//        System.out.println(user.getId());select id,name,age,money,status from t_user
//        statement="com.demo.mybatis.DBMapping.UserMapper.getUser";
//        user=session.selectOne(statement, user.getId());
//        System.out.println(user.toString()); 
        

//        SqlSession session = sessionFactory.openSession();
//        String statement="com.demo.mybatis.DBMapping.UserMapper.getuser";
//        User user=session.selectOne(statement, 1);
//        user=session.selectOne(statement, 1);
//        System.out.println(user.toString()); 
//        session.commit();
//        SqlSession session1 = sessionFactory.openSession();
//        user=session1.selectOne(statement, 1);
//        System.out.println(user.toString()); 
//        session1.commit();
        
        
//        String statement="com.demo.mybatis.DBMapping.UserMapper.finduserbylikename1";
//        List<User> users=session.selectList(statement, "%J%");
//        System.out.println(users.size());
//        for(int i=0;i<users.size();i++)
//        {
//            System.out.println(users.get(i).toString());
//        }
//        statement="com.demo.mybatis.DBMapping.UserMapper.finduserbylikename2";
//        Map<String,Object> map=new HashMap<String,Object>();  
//        map.put("name", "J");  
//        users=session.selectList(statement, map);
//        System.out.println(users.size());
//        for(int i=0;i<users.size();i++)
//        {
//            System.out.println(users.get(i).toString());
//        }

//        String statement="com.demo.mybatis.DBMapping.UserMapper.findcardbyuserids";
//        List ids = new ArrayList();
//        ids.add("1");
//        ids.add("2");
//        ids.add("3");
//        Map<String,Object> map=new HashMap<String,Object>();  
//        map.put("ids", ids);  
//        List<User> users=session.selectList(statement,map);
//        for(int i=0;i<users.size();i++)
//        {
//            System.out.println(users.get(i).toString());
//        }
		  SqlSession session = sessionFactory.openSession();
		  String statement="com.demo.mybatis.DBMapping.UserMapper.getUserList"; 
		  PageHelper.startPage(1, 5, true);  
		  List<User> users=session.selectList(statement);
		  PageInfo<User> pageInfo = new PageInfo<User>(users);  
		  System.out.println("数据总数:" + pageInfo.getTotal());  
		  System.out.println("数据总页数:" + pageInfo.getPages());  
		  System.out.println("最后一页:" + pageInfo.getLastPage());  
		  for (User u: users)
		  {
			  System.out.println(u.toString());
		  } 
	      

	}
}

