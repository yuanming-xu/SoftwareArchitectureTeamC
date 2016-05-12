package cn.edu.pku.ss.sa.teamc.dao.sqlmapper;

import cn.edu.pku.ss.sa.teamc.dao.model.TGoodsSale;
import cn.edu.pku.ss.sa.teamc.dao.model.TGoodsSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGoodsSaleMapper {
    int countByExample(TGoodsSaleExample example);

    int deleteByExample(TGoodsSaleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TGoodsSale record);

    int insertSelective(TGoodsSale record);

    List<TGoodsSale> selectByExample(TGoodsSaleExample example);

    TGoodsSale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TGoodsSale record, @Param("example") TGoodsSaleExample example);

    int updateByExample(@Param("record") TGoodsSale record, @Param("example") TGoodsSaleExample example);

    int updateByPrimaryKeySelective(TGoodsSale record);

    int updateByPrimaryKey(TGoodsSale record);
}