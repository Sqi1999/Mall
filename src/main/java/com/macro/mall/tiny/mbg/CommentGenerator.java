package com.macro.mall.tiny.mbg;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 10:57
 */
public class CommentGenerator extends DefaultCommentGenerator {
    private boolean addRemarkComents=false;

    /**
     * 设置用户配置的参数
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComents= StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    /**
     * 给字段加注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        String remarks=introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if (addRemarkComents&&StringUtility.stringHasValue(remarks)){
            addFieldJavaDoc(field,remarks);
        }
    }

    private void addFieldJavaDoc(Field field, String remarks) {
        //文档开始注释
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String [] remarkLines=remarks.split(System.getProperty("line.separator"));
        for (String remarkLine: remarkLines) {
            field.addJavaDocLine("*"+remarkLine);
        }
        addJavadocTag(field,false);
        field.addJavaDocLine(" */");
    }
}
