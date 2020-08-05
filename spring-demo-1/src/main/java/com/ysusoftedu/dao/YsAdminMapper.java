package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsAdmin;
import com.ysusoftedu.pojo.YsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsAdminMapper {
    int countByExample(YsAdminExample example);

    int deleteByExample(YsAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(YsAdmin record);

    int insertSelective(YsAdmin record);

    List<YsAdmin> selectByExample(YsAdminExample example);

    YsAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") YsAdmin record, @Param("example") YsAdminExample example);

    int updateByExample(@Param("record") YsAdmin record, @Param("example") YsAdminExample example);

    int updateByPrimaryKeySelective(YsAdmin record);

    int updateByPrimaryKey(YsAdmin record);
}