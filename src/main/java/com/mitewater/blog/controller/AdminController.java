package com.mitewater.blog.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/13
 * Time: 14:30
 * Description: class for JBlog try it self
 */
public class AdminController extends Controller{

    public void helloworld(){
        renderJson("{hello:world}");
    }

    public void index(){
        renderText("管理员首页");
    }

    public void login(){
        render("login.html");
    }
}
