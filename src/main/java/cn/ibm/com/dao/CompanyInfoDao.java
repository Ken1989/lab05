package cn.ibm.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.ibm.com.entity.CompanyInfo;


public interface CompanyInfoDao extends JpaRepository<CompanyInfo, Long> {

}
