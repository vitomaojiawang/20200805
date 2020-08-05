package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsPaperQuestion;
import com.ysusoftedu.pojo.YsPaperQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsPaperQuestionMapper {
    int countByExample(YsPaperQuestionExample example);

    int deleteByExample(YsPaperQuestionExample example);

    int insert(YsPaperQuestion record);

    int insertSelective(YsPaperQuestion record);

    List<YsPaperQuestion> selectByExample(YsPaperQuestionExample example);

    int updateByExampleSelective(@Param("record") YsPaperQuestion record, @Param("example") YsPaperQuestionExample example);

    int updateByExample(@Param("record") YsPaperQuestion record, @Param("example") YsPaperQuestionExample example);
}