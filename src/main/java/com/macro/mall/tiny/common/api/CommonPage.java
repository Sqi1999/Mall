package com.macro.mall.tiny.common.api;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 分页数据封装
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 14:19
 */
@Getter
@Setter
public class CommonPage <T>{
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将pageHelper分页的list转换为分页信息
     * @param list
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result=new CommonPage<T>();
        PageInfo<T> pageInfo=new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }
}
