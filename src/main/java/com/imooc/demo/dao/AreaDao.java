package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * Created by Administrator on 2018/5/13/013.
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据ID列出具体区域
     * @param areaID
     * @return
     */
    Area queryAreaById(int areaID);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
