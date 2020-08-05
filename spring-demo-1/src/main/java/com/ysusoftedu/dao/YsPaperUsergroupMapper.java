package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsPaperUsergroup;
import com.ysusoftedu.pojo.YsPaperUsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsPaperUsergroupMapper {
    int countByExample(YsPaperUsergroupExample example);

    int deleteByExample(YsPaperUsergroupExample example);

    int insert(YsPaperUsergroup record);

    int insertSelective(YsPaperUsergroup record);

    List<YsPaperUsergroup> selectByExample(YsPaperUsergroupExample example);

    int updateByExampleSelective(@Param("record") YsPaperUsergroup record, @Param("example") YsPaperUsergroupExample example);

    int updateByExample(@Param("record") YsPaperUsergroup record, @Param("example") YsPaperUsergroupExample example);
}