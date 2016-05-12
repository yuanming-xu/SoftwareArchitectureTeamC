package cn.edu.pku.ss.sa.teamc.dao.sqlmapper;

import cn.edu.pku.ss.sa.teamc.dao.model.TCustomer;
import cn.edu.pku.ss.sa.teamc.dao.model.TCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerMapper {
    int countByExample(TCustomerExample example);

    int deleteByExample(TCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    List<TCustomer> selectByExample(TCustomerExample example);

    TCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);
}