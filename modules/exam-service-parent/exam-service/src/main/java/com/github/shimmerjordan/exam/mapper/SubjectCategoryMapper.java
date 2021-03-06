package com.github.shimmerjordan.exam.mapper;

import com.github.shimmerjordan.common.core.persistence.CrudMapper;
import com.github.shimmerjordan.exam.api.module.SubjectCategory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目分类Mapper
 *
 * @author shimmerjordan
 * @date 2018/12/4 21:48
 */
@Mapper
public interface SubjectCategoryMapper extends CrudMapper<SubjectCategory> {
}
