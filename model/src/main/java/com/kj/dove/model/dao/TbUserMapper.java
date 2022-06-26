package com.kj.dove.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.kj.dove.model.entity.TbUser;
import com.kj.dove.model.entity.TbUserExample;

/**
* 注释用户表 Mapper
*
* @author daksy
* @date 2022-06-26 21:01
*/
@Mapper
public interface TbUserMapper extends tk.mybatis.mapper.common.Mapper<TbUser> {

    /**
     * 列表查询
     *
     * @param example 条件
     * @return 列表
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     * 根据主键id查询
     *
     * @param id
     * @return 记录信息
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     * 根据主键删除数据
     *
     * @param id
     * @return 数量
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 删除数据
     *
     * @param example 条件
     * @return 删除数量
     */
    int deleteByExample(TbUserExample example);

    /**
     * 插入数据库记录（不建议使用）
     *
     * @param record
     */
    int insert(TbUser record);

    /**
     * 插入数据库记录（建议使用）
     *
     * @param record 插入数据
     * @return 插入数量
     */
    int insertSelective(TbUser record);

    /**
     * 计数
     *
     * @param example 条件
     * @return 数量
     */
    long countByExample(TbUserExample example);

    /**
     * 修改数据
     *
     * @param record  更新值
     * @param example 条件
     * @return 更新数量
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * 修改数据
     *
     * @param record  更新值
     * @param example 条件
     * @return 更新数量
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * 修改数据(推荐使用)
     *
     * @param record 更新值
     * @return 更新数量
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * 根据主键更新数据
     *
     * @param record 更新值
     * @return 更新数量
     */
    int updateByPrimaryKey(TbUser record);
}
