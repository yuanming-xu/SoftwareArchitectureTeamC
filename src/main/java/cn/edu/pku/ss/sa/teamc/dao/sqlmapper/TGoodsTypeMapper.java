package cn.edu.pku.ss.sa.teamc.dao.sqlmapper;

import cn.edu.pku.ss.sa.teamc.dao.model.TGoodsType;
import cn.edu.pku.ss.sa.teamc.dao.model.TGoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGoodsTypeMapper {
    int countByExample(TGoodsTypeExample example);

    int deleteByExample(TGoodsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodsType record);

    int insertSelective(TGoodsType record);

    List<TGoodsType> selectByExample(TGoodsTypeExample example);

    TGoodsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGoodsType record, @Param("example") TGoodsTypeExample example);

    int updateByExample(@Param("record") TGoodsType record, @Param("example") TGoodsTypeExample example);

    int updateByPrimaryKeySelective(TGoodsType record);

    int updateByPrimaryKey(TGoodsType record);
}