package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Alex", "Li", (byte) 23);
        userDao.saveUser("Den", "Nau", (byte) 26);
        userDao.saveUser("Zina", "Ali", (byte) 22);
        userDao.saveUser("Vita", "Golos", (byte) 24);

        //userDao.removeUserById(1);
        userDao.getAllUsers();
        //userDao.cleanUsersTable();
        //userDao.dropUsersTable();
    }
}
