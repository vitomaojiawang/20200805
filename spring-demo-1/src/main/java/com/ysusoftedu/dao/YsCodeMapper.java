package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsCode;
import com.ysusoftedu.pojo.YsCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsCodeMapper {
    int countByExample(YsCodeExample example);

    int deleteByExample(YsCodeExample example);

    int insert(YsCode record);

    int insertSelective(YsCode record);

    List<YsCode> selectByExample(YsCodeExample example);

    int updateByExampleSelective(@Param("record") YsCode record, @Param("example") YsCodeExample example);

    int updateByExample(@Param("record") YsCode record, @Param("example") YsCodeExample example);
}