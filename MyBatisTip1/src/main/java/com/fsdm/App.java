package com.fsdm;

import com.fsdm.dao.IUsersMapper;
import com.fsdm.pojo.Users;
import com.fsdm.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Scanner input = new Scanner(System.in);
    private static SqlSession session;
    private static IUsersMapper mapper;

    public static void main(String[] args) {
        session = SessionFactory.getSession();
        mapper = session.getMapper(IUsersMapper.class);
        System.out.println("======================================");
        if (login()) {
            System.out.println("登陆成功");
            menu();
        } else {
            System.out.println("用户名或密码错误");
        }
        System.out.println("======================================");
        session.close();
        System.out.println("程序结束！！！");
    }

    private static boolean login() {
        System.out.print("请输入用户名：");
        String userName = input.next();
        System.out.print("请输入密码：");
        String password = input.next();
        Users login = mapper.login(userName, password);
        return login == null ? false : true;
    }

    private static void menu() {
        System.out.println("请选择：");
        System.out.println("\t1.查询所有");
        System.out.println("\t2.查询指定");
        System.out.println("\t3.删除指定");
        System.out.println("\t4.修改指定");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                findAll();
                break;
            case 2:
                findBy();
                break;
            case 3:
                delBy();
                break;
            case 4:
                upBy();
                break;
            default:
                System.out.println("======================================");
                session.close();
                System.out.println("程序结束！！！");
                System.exit(0);
                break;
        }
    }

    public static void upBy() {
        System.out.println("修改条件？请选择根据什么修改？");
        System.out.println("请选择：");
        System.out.println("\t1.id===》");
        System.out.println("\t2.userName===》");
        System.out.println("\t3.password===》");
        Users userBy = new Users();

        menuUtil(userBy);

        System.out.println("修改为：");
        System.out.print("userName===》");
        String userName = input.next();
        System.out.print("password===》");
        String password = input.next();
        Users userNew = new Users();
        userNew.setUserName(userName);
        userNew.setPassword(password);

        int count = mapper.upBy(userNew, userBy);
        session.commit();
        System.out.println("**********************************");
        System.out.println("受影响行数===》" + count);
        System.out.println("**********************************");

        menu();
    }

    private static void delBy() {
        System.out.println("删除条件？请选择根据什么删除？");
        System.out.println("请选择：");
        System.out.println("\t1.id===》");
        System.out.println("\t2.userName===》");
        System.out.println("\t3.password===》");
        Users user = new Users();

        menuUtil(user);

        int count = mapper.delBy(user);
        session.commit();
        System.out.println("**********************************");
        System.out.println("受影响行数===》" + count);
        System.out.println("**********************************");

        menu();
    }

    private static void menuUtil(Users user) {
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.print("id===》");
                int id = input.nextInt();
                user.setId(id);
                break;
            case 2:
                System.out.print("userName===》");
                String userName = input.next();
                user.setUserName(userName);
                break;
            case 3:
                System.out.print("password===》");
                String password = input.next();
                user.setPassword(password);
                break;
        }
    }


    private static void findBy() {
        System.out.println("查询条件？请选择根据什么查询？");
        System.out.println("请选择：");
        System.out.println("\t1.id===》");
        System.out.println("\t2.userName===》");
        System.out.println("\t3.password===》");
        Users user = new Users();


        menuUtil(user);

        List<Users> list = mapper.findBy(user);
        System.out.println("**********************************");
        System.out.println("id\tuserName\tpassword");
        for (Users users : list) {
            System.out.println(users.getId() + "\t" + users.getUserName() + "\t" + users.getPassword());
        }
        System.out.println("**********************************");
        menu();
    }

    private static void findAll() {
        System.out.println("**********************************");
        System.out.println("id\tuserName\tpassword");
        List<Users> list = mapper.findAll();
        for (Users users : list) {
            System.out.println(users.getId() + "\t" + users.getUserName() + "\t" + users.getPassword());
        }
        System.out.println("**********************************");
        menu();
    }


}
