package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessIndustry;
import com.bupt.core.supplier.model.TBusinessIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessIndustryMapper {
    int countByExample(TBusinessIndustryExample example);

    int deleteByExample(TBusinessIndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessIndustry record);

    int insertSelective(TBusinessIndustry record);

    List<TBusinessIndustry> selectByExample(TBusinessIndustryExample example);

    TBusinessIndustry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessIndustry record, @Param("example") TBusinessIndustryExample example);

    int updateByExample(@Param("record") TBusinessIndustry record, @Param("example") TBusinessIndustryExample example);

    int updateByPrimaryKeySelective(TBusinessIndustry record);

    int updateByPrimaryKey(TBusinessIndustry record);
}