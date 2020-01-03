package com.accp.dao;

import com.accp.pojo.Vendor_contact;

public interface Vendor_contactMapper {
    int deleteByPrimaryKey(String vcsupno);

    int insert(Vendor_contact record);

    int insertSelective(Vendor_contact record);

    Vendor_contact selectByPrimaryKey(String vcsupno);

    int updateByPrimaryKeySelective(Vendor_contact record);

    int updateByPrimaryKey(Vendor_contact record);
}