package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsUserGroups;
import com.ysusoftedu.pojo.YsUserGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsUserGroupsMapper {
    int countByExample(YsUserGroupsExample example);

    int deleteByExample(YsUserGroupsExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(YsUserGroups record);

    int insertSelective(YsUserGroups record);

    List<YsUserGroups> selectByExample(YsUserGroupsExample example);

    YsUserGroups selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") YsUserGroups record, @Param("example") YsUserGroupsExample example);

    int updateByExample(@Param("record") YsUserGroups record, @Param("example") YsUserGroupsExample example);

    int updateByPrimaryKeySelective(YsUserGroups record);

    int updateByPrimaryKey(YsUserGroups record);
}