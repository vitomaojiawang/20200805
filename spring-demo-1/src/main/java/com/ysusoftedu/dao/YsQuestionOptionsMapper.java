package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsQuestionOptions;
import com.ysusoftedu.pojo.YsQuestionOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsQuestionOptionsMapper {
    int countByExample(YsQuestionOptionsExample example);

    int deleteByExample(YsQuestionOptionsExample example);

    int deleteByPrimaryKey(Integer questionOptionId);

    int insert(YsQuestionOptions record);

    int insertSelective(YsQuestionOptions record);

    List<YsQuestionOptions> selectByExample(YsQuestionOptionsExample example);

    YsQuestionOptions selectByPrimaryKey(Integer questionOptionId);

    int updateByExampleSelective(@Param("record") YsQuestionOptions record, @Param("example") YsQuestionOptionsExample example);

    int updateByExample(@Param("record") YsQuestionOptions record, @Param("example") YsQuestionOptionsExample example);

    int updateByPrimaryKeySelective(YsQuestionOptions record);

    int updateByPrimaryKey(YsQuestionOptions record);
}