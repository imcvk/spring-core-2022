package mainapp;

import dao.UserDAO;

public class MainApp {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.fetchData();
    }

}

