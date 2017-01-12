package com.mitewater.test;


import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.druid.DruidPlugin;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.h2.tools.Server;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/10
 * Time: 17:42
 * Description: class name for JBlog try it self
 */
public class Generate {

    public static DataSource getDataSource() {
        Prop prop = PropKit.use("db.properties", "UTF-8");
        /**配置druid数据连接池插件**/
        DruidPlugin dp =new DruidPlugin(prop.get("jdbc.URL")
                ,prop.get("jdbc.username")
                ,prop.get("jdbc.password").trim()
                ,prop.get("jdbc.jdbc.driver"));
        /**配置druid监控**/
        dp.addFilter(new StatFilter());
        WallFilter wall = new WallFilter();
        wall.setDbType("h2");
        dp.addFilter(wall);

        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        arp.setShowSql(true);
        dp.start();
        return dp.getDataSource();
    }

    public static void main(String[] args) throws SQLException {
        // base model 所使用的包名
        String baseModelPackageName = "com.mitewater.blog.model.base";
        // base model 文件保存路径
        String baseModelOutputDir = "../JBlog/src/main/java/com/mitewater/blog/model/base";

        // model 所使用的包名 (MappingKit 默认使用的包名)
        String modelPackageName = "com.mitewater.blog.model";
        // model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
        String modelOutputDir = baseModelOutputDir + "/..";
        DataSource dataSource = getDataSource();
        dataSource.getConnection();
        // 创建生成器
        Generator gernerator = new Generator(dataSource, baseModelPackageName, baseModelOutputDir, modelPackageName, modelOutputDir);
        // 设置数据库方言
        gernerator.setDialect(new AnsiSqlDialect());
        // 添加不需要生成的表名
        gernerator.addExcludedTable("adv");
        // 设置是否在 Model 中生成 dao 对象
        gernerator.setGenerateDaoInModel(true);
        // 设置是否生成字典文件
        gernerator.setGenerateDataDictionary(false);
        // 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
        gernerator.setRemovedTableNamePrefixes("T_JBLOG_");
        // 生成
        gernerator.generate();
    }
}
