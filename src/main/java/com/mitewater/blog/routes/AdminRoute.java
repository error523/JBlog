package com.mitewater.blog.routes;

import com.jfinal.config.Routes;
import com.mitewater.blog.controller.AdminController;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/12
 * Time: 17:18
 * Description: class for JBlog try it self
 */
public class AdminRoute extends Routes{
    @Override
    public void config() {
        add("/admin",AdminController.class);
    }
}
