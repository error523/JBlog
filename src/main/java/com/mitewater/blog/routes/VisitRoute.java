package com.mitewater.blog.routes;

import com.jfinal.config.Routes;
import com.mitewater.blog.controller.VisitController;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/12
 * Time: 17:19
 * Description: class for JBlog try it self
 */
public class VisitRoute extends Routes{

    @Override
    public void config() {
        add("/",VisitController.class);
    }
}
