package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsQuestionDb;
import com.ysusoftedu.pojo.YsQuestionDbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsQuestionDbMapper {
    int countByExample(YsQuestionDbExample example);

    int deleteByExample(YsQuestionDbExample example);

    int deleteByPrimaryKey(Integer questionDbId);

    int insert(YsQuestionDb record);

    int insertSelective(YsQuestionDb record);

    List<YsQuestionDb> selectByExample(YsQuestionDbExample example);

    YsQuestionDb selectByPrimaryKey(Integer questionDbId);

    int updateByExampleSelective(@Param("record") YsQuestionDb record, @Param("example") YsQuestionDbExample example);

    int updateByExample(@Param("record") YsQuestionDb record, @Param("example") YsQuestionDbExample example);

    int updateByPrimaryKeySelective(YsQuestionDb record);

    int updateByPrimaryKey(YsQuestionDb record);
}