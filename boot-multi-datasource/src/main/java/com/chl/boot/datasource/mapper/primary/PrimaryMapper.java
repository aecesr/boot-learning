package com.chl.boot.datasource.mapper.primary;

import com.chl.boot.datasource.entity.BootUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrimaryMapper {
    /**
     * 查询所有数据
     *
     * @return List<BootUser>
     */
    List<BootUser> selectAll();

    /**
     * 新增
     * @param bootUser
     */
    void insert(@Param("bootUser") BootUser bootUser);

}