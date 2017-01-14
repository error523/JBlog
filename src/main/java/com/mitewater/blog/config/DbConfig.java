package com.mitewater.blog.config;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.IPlugin;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/12
 * Time: 17:22
 * Description: class for JBlog try it self
 */
public class DbConfig extends DruidPlugin {

    private static DbConfig config = null;

    private DbConfig(String url, String username, String password) {
        super(url, username, password);
    }

    public static DbConfig getInstance(){
        //获取classpath下的db配置文件
        Prop prop = PropKit.use("db.properties", "UTF-8");
        /**配置druid数据连接池插件**/
        config =new DbConfig(prop.get("jdbc.URL")
                ,prop.get("jdbc.username")
                ,prop.get("jdbc.password").trim());
        /**配置druid监控**/
        config.addFilter(new StatFilter());
        WallFilter wall = new WallFilter();
        wall.setDbType("h2");
        config.addFilter(wall);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(config);
        arp.setShowSql(true);
        return config;
    }
}
