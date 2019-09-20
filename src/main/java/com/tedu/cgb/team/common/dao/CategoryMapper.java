package com.tedu.cgb.team.common.dao;

import com.tedu.cgb.team.common.entity.Category;
import com.tedu.cgb.team.common.entity.CategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    long countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorys
     *
     * @mbg.generated Sat Sep 21 01:57:29 CST 2019
     */
    int updateByPrimaryKey(Category record);
}