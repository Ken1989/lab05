package cn.ibm.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ibm.com.dao.CompanyInfoDao;
import cn.ibm.com.entity.CompanyInfo;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyInfoDao companyInfoDao;
	
	public List<CompanyInfo> getAllCompanyInfo(){
		return companyInfoDao.findAll();
	}

	
	public String addCompanyInfo(CompanyInfo companyInfo) {
		try {
			this.companyInfoDao.save(companyInfo);
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "Faied";
		}
	
	}
	
	public String updateCompanyInfo(CompanyInfo companyInfo) {
		try {
			this.companyInfoDao.save(companyInfo);
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "Faied";
		}
	}
	
	public String deleteCompanyInfo(Long id) {
		try {
			this.companyInfoDao.deleteById(id);
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "Faied";
		}
	}

}
