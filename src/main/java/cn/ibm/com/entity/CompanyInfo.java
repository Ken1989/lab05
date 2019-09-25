package cn.ibm.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@Entity
@Table(name="Company_Info")
public class CompanyInfo {
	
	@Id
	private Long id;
	private String name;
	private String id_no;
	private String phone_num;
	private String email;
	private Date create_time;
	private Date modify_time;
	private String use_state;
	
}
