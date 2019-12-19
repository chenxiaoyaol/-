package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hp.domain.TOrders;
@Repository("tOrderDao")
@Mapper
public interface TOrdersMapper {
	
	List<TOrders> getAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(TOrders record);

    int insertSelective(TOrders record);

    TOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrders record);

    int updateByPrimaryKey(TOrders record);
}