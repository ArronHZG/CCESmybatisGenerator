package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessCertificate;
import com.bupt.core.supplier.model.TBusinessCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessCertificateMapper {
    int countByExample(TBusinessCertificateExample example);

    int deleteByExample(TBusinessCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessCertificate record);

    int insertSelective(TBusinessCertificate record);

    List<TBusinessCertificate> selectByExample(TBusinessCertificateExample example);

    TBusinessCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessCertificate record, @Param("example") TBusinessCertificateExample example);

    int updateByExample(@Param("record") TBusinessCertificate record, @Param("example") TBusinessCertificateExample example);

    int updateByPrimaryKeySelective(TBusinessCertificate record);

    int updateByPrimaryKey(TBusinessCertificate record);
}