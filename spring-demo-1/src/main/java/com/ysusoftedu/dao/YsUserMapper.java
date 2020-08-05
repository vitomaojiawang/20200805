package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsUser;
import com.ysusoftedu.pojo.YsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsUserMapper {
    int countByExample(YsUserExample example);

    int deleteByExample(YsUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(YsUser record);

    int insertSelective(YsUser record);

    List<YsUser> selectByExample(YsUserExample example);

    YsUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") YsUser record, @Param("example") YsUserExample example);

    int updateByExample(@Param("record") YsUser record, @Param("example") YsUserExample example);

    int updateByPrimaryKeySelective(YsUser record);

    int updateByPrimaryKey(YsUser record);
}