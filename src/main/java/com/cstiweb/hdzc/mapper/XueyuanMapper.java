package com.cstiweb.hdzc.mapper;

import com.cstiweb.hdzc.model.Xueyuan;
import com.cstiweb.hdzc.model.XueyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueyuanMapper {
    long countByExample(XueyuanExample example);

    int deleteByExample(XueyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xueyuan record);

    int insertSelective(Xueyuan record);

    List<Xueyuan> selectByExample(XueyuanExample example);

    Xueyuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xueyuan record, @Param("example") XueyuanExample example);

    int updateByExample(@Param("record") Xueyuan record, @Param("example") XueyuanExample example);

    int updateByPrimaryKeySelective(Xueyuan record);

    int updateByPrimaryKey(Xueyuan record);
}