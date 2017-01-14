package com.mitewater.blog.config;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.mitewater.blog.routes.AdminRoute;
import com.mitewater.blog.routes.VisitRoute;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/12
 * Time: 17:00
 * Description: class for JBlog try it self
 */
public class JBlogConfig extends JFinalConfig{

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.FREE_MARKER);
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new AdminRoute());
        me.add(new VisitRoute());
    }

    @Override
    public void configPlugin(Plugins me) {
        me.add(DbConfig.getInstance());
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
