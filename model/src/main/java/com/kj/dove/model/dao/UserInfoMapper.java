package com.kj.dove.model.dao;

import com.kj.dove.model.entity.UserInfo;
import com.kj.dove.model.entity.UserInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
* 注释 Mapper
*
* @author daksy
* @date 2022-06-25 17:58
*/
@Mapper
public interface UserInfoMapper extends tk.mybatis.mapper.common.Mapper<UserInfo> {

    /**
     * 列表查询
     *
     * @param example 条件
     * @return 列表
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * 根据主键id查询
     *
     * @param id
     * @return 记录信息
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * 根据主键删除数据
     *
     * @param id
     * @return 数量
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 删除数据
     *
     * @param example 条件
     * @return 删除数量
     */
    int deleteByExample(UserInfoExample example);

    /**
     * 插入数据库记录（不建议使用）
     *
     * @param record
     */
    int insert(UserInfo record);

    /**
     * 插入数据库记录（建议使用）
     *
     * @param record 插入数据
     * @return 插入数量
     */
    int insertSelective(UserInfo record);

    /**
     * 计数
     *
     * @param example 条件
     * @return 数量
     */
    long countByExample(UserInfoExample example);

    /**
     * 修改数据
     *
     * @param record  更新值
     * @param example 条件
     * @return 更新数量
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * 修改数据
     *
     * @param record  更新值
     * @param example 条件
     * @return 更新数量
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * 修改数据(推荐使用)
     *
     * @param record 更新值
     * @return 更新数量
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 根据主键更新数据
     *
     * @param record 更新值
     * @return 更新数量
     */
    int updateByPrimaryKey(UserInfo record);
}
