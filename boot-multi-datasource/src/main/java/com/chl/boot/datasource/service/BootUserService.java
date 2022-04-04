package com.chl.boot.datasource.service;

import com.chl.boot.datasource.entity.BootUser;
import com.chl.boot.datasource.mapper.primary.PrimaryMapper;
import com.chl.boot.datasource.mapper.secibdary.SecondaryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/4/1 22:35
 */
@Service
public class BootUserService {
    @Resource
    private PrimaryMapper primaryMapper;
    @Resource
    private SecondaryMapper secondaryMapper;

    public List<BootUser> getUsers() {
        List<BootUser> primaryUsers = primaryMapper.selectAll();
        List<BootUser> secondaryUsers = secondaryMapper.selectAll();
        List<BootUser> result = new ArrayList<>();
        result.addAll(primaryUsers);
        result.addAll(secondaryUsers);
        return result;
    }
    @Transactional(rollbackFor = {RuntimeException.class})
    public void saveUser(BootUser bootUser) {
        primaryMapper.insert(bootUser);
        int a = 2 / 0;
        secondaryMapper.insert(bootUser);
    }
}