package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessSupplierCertificate;
import com.bupt.core.supplier.model.TBusinessSupplierCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessSupplierCertificateMapper {
    int countByExample(TBusinessSupplierCertificateExample example);

    int deleteByExample(TBusinessSupplierCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessSupplierCertificate record);

    int insertSelective(TBusinessSupplierCertificate record);

    List<TBusinessSupplierCertificate> selectByExample(TBusinessSupplierCertificateExample example);

    TBusinessSupplierCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessSupplierCertificate record, @Param("example") TBusinessSupplierCertificateExample example);

    int updateByExample(@Param("record") TBusinessSupplierCertificate record, @Param("example") TBusinessSupplierCertificateExample example);

    int updateByPrimaryKeySelective(TBusinessSupplierCertificate record);

    int updateByPrimaryKey(TBusinessSupplierCertificate record);
}