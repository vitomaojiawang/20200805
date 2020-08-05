package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsQuestion;
import com.ysusoftedu.pojo.YsQuestionExample;
import com.ysusoftedu.pojo.YsQuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsQuestionMapper {
    int countByExample(YsQuestionExample example);

    int deleteByExample(YsQuestionExample example);

    int deleteByPrimaryKey(Integer questionId);

    int insert(YsQuestionWithBLOBs record);

    int insertSelective(YsQuestionWithBLOBs record);

    List<YsQuestionWithBLOBs> selectByExampleWithBLOBs(YsQuestionExample example);

    List<YsQuestion> selectByExample(YsQuestionExample example);

    YsQuestionWithBLOBs selectByPrimaryKey(Integer questionId);

    int updateByExampleSelective(@Param("record") YsQuestionWithBLOBs record, @Param("example") YsQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") YsQuestionWithBLOBs record, @Param("example") YsQuestionExample example);

    int updateByExample(@Param("record") YsQuestion record, @Param("example") YsQuestionExample example);

    int updateByPrimaryKeySelective(YsQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(YsQuestionWithBLOBs record);

    int updateByPrimaryKey(YsQuestion record);
    
    
    
    
    
    List<Integer> selectQId(@Param("dbId")String dbId,@Param("type")String type);
    
    
    
}