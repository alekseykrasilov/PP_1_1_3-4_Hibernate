package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args)  {
        // реализуйте алгоритм здесь

        UserService user = new UserServiceImpl();

        //UserDaoHibernateImpl user = new UserDaoHibernateImpl();

        user.createUsersTable();

        user.saveUser("Name1", "LastName1", (byte) 22);
        user.saveUser("Name2", "LastName2", (byte) 20);
        user.saveUser("Name3", "LastName3", (byte) 32);
        user.saveUser("Name4", "LastName4", (byte) 40);


        System.out.println(user.getAllUsers());


        user.removeUserById(1);

        user.cleanUsersTable();

        user.dropUsersTable();


    }
}
