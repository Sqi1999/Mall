package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 13:51
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id,PmsBrand brand);
    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum,int pageSize);

    PmsBrand getBrand(Long id);
}
