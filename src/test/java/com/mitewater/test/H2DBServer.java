package com.mitewater.test;

import org.h2.tools.Server;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/11
 * Time: 15:45
 * Description: class for JBlog try it self
 */
public class H2DBServer {

    public static void main(String[] args) {
        startH2();
    }

    public static void startH2(){
        try {
            Server.createWebServer().start();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
