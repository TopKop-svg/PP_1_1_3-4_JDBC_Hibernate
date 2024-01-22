package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        userService.createUsersTable();

        userService.saveUser("Alex", "Li", (byte) 23);
        userService.saveUser("Den", "Nau", (byte) 26);
        userService.saveUser("Zina", "Ali", (byte) 22);
        userService.saveUser("Vita", "Golos", (byte) 24);

        userService.removeUserById(3);
        userService.getAllUsers();
        //userDao.cleanUsersTable();
        //userDao.dropUsersTable();
        Util.closeConnection();
    }
}
