package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessSupplier;
import com.bupt.core.supplier.model.TBusinessSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessSupplierMapper {
    int countByExample(TBusinessSupplierExample example);

    int deleteByExample(TBusinessSupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessSupplier record);

    int insertSelective(TBusinessSupplier record);

    List<TBusinessSupplier> selectByExample(TBusinessSupplierExample example);

    TBusinessSupplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessSupplier record, @Param("example") TBusinessSupplierExample example);

    int updateByExample(@Param("record") TBusinessSupplier record, @Param("example") TBusinessSupplierExample example);

    int updateByPrimaryKeySelective(TBusinessSupplier record);

    int updateByPrimaryKey(TBusinessSupplier record);
}