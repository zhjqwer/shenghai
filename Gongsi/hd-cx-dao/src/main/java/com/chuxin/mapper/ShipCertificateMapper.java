package com.chuxin.mapper;

import com.chuxin.pojo.ShipCertificate;
import com.chuxin.pojo.ShipCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipCertificateMapper {
    int countByExample(ShipCertificateExample example);

    int deleteByExample(ShipCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipCertificate record);

    int insertSelective(ShipCertificate record);

    List<ShipCertificate> selectByExample(ShipCertificateExample example);

    ShipCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipCertificate record, @Param("example") ShipCertificateExample example);

    int updateByExample(@Param("record") ShipCertificate record, @Param("example") ShipCertificateExample example);

    int updateByPrimaryKeySelective(ShipCertificate record);

    int updateByPrimaryKey(ShipCertificate record);
}