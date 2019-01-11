package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessSupplierAudit;
import com.bupt.core.supplier.model.TBusinessSupplierAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessSupplierAuditMapper {
    int countByExample(TBusinessSupplierAuditExample example);

    int deleteByExample(TBusinessSupplierAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessSupplierAudit record);

    int insertSelective(TBusinessSupplierAudit record);

    List<TBusinessSupplierAudit> selectByExample(TBusinessSupplierAuditExample example);

    TBusinessSupplierAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessSupplierAudit record, @Param("example") TBusinessSupplierAuditExample example);

    int updateByExample(@Param("record") TBusinessSupplierAudit record, @Param("example") TBusinessSupplierAuditExample example);

    int updateByPrimaryKeySelective(TBusinessSupplierAudit record);

    int updateByPrimaryKey(TBusinessSupplierAudit record);
}