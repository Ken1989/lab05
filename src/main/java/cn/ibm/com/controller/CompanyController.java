package cn.ibm.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ibm.com.entity.CompanyInfo;
import cn.ibm.com.service.CompanyService;

@RestController
@RequestMapping("/services")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public List<CompanyInfo> getAllCompanyInfo(){
		return this.companyService.getAllCompanyInfo();
	}

	
	@PostMapping
	public String addCompanyInfo(@RequestBody CompanyInfo companyInfo) {
		return this.companyService.addCompanyInfo(companyInfo);
	}
	
	
	@PutMapping
	public String updateCompanyInfo(@RequestBody CompanyInfo companyInfo) {
		return this.companyService.updateCompanyInfo(companyInfo);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public String deleteCompanyInfo(@PathVariable("id") Long id) {
		return this.companyService.deleteCompanyInfo(id);
	}
}
