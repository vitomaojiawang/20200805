package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsExamDetail;
import com.ysusoftedu.pojo.YsExamDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsExamDetailMapper {
    int countByExample(YsExamDetailExample example);

    int deleteByExample(YsExamDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YsExamDetail record);

    int insertSelective(YsExamDetail record);

    List<YsExamDetail> selectByExample(YsExamDetailExample example);

    YsExamDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YsExamDetail record, @Param("example") YsExamDetailExample example);

    int updateByExample(@Param("record") YsExamDetail record, @Param("example") YsExamDetailExample example);

    int updateByPrimaryKeySelective(YsExamDetail record);

    int updateByPrimaryKey(YsExamDetail record);
}