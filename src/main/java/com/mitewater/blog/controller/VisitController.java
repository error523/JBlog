package com.mitewater.blog.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/13
 * Time: 14:56
 * Description: class for JBlog try it self
 */
public class VisitController extends Controller{

    public void index(){
        renderText("我是首頁");
    }
}
