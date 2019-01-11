package com.bupt.core.supplier.mapper;

import com.bupt.core.supplier.model.TBusinessEvaluationModel;
import com.bupt.core.supplier.model.TBusinessEvaluationModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessEvaluationModelMapper {
    int countByExample(TBusinessEvaluationModelExample example);

    int deleteByExample(TBusinessEvaluationModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBusinessEvaluationModel record);

    int insertSelective(TBusinessEvaluationModel record);

    List<TBusinessEvaluationModel> selectByExample(TBusinessEvaluationModelExample example);

    TBusinessEvaluationModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBusinessEvaluationModel record, @Param("example") TBusinessEvaluationModelExample example);

    int updateByExample(@Param("record") TBusinessEvaluationModel record, @Param("example") TBusinessEvaluationModelExample example);

    int updateByPrimaryKeySelective(TBusinessEvaluationModel record);

    int updateByPrimaryKey(TBusinessEvaluationModel record);
}