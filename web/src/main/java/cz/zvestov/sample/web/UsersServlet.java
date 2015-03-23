package cz.zvestov.sample.web;

import cz.zvestov.sample.UserService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Users")
public class UsersServlet extends HttpServlet {

    //TODO Lubos
    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();

        for(String user : userService.getUserNames()) {
            writer.println(user);
        }

        writer.close();
    }

}
