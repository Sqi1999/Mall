package com.macro.mall.tiny.mbg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 用于生产MBG的代码
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 10:38
 */
public class Generator {
    public static void main(String[] args) throws Exception{
        //MBG执行过程中的警告信息
        List<String> warings=new ArrayList<>();
        //当生成的代码重复时候，覆盖源代码
        boolean overwrite=true;
        //读取我们的MBG配置文件
        InputStream is=Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp=new ConfigurationParser(warings);
        Configuration config=cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        //创建MBG
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warings);
        //执行生成的代码
        myBatisGenerator.generate(null);
        for (String waring:warings){
            System.out.println(waring);
        }

    }
}
