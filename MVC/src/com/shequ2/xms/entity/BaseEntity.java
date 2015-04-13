/*
 *www.shequ2.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Project:SpringMVC
 * Package:entity
 * FileName:BaseEntity.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-4-8 下午10:38:35
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
	
	private Long id;
	private Boolean deleted;
	private Integer version;
	private Date createDate;
	/**
	 * Author XuMaoSen
	 * @return the id
	 */
	@Id
	@GeneratedValue()
	public Long getId() {
		return id;
	}
	/**
	 * Author XuMaoSen
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Author XuMaoSen
	 * @return the deleted
	 */
	@Column(insertable=false)
	public Boolean getDeleted() {
		return deleted;
	}
	/**
	 * Author XuMaoSen
	 * @param deleted the deleted to set
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	/**
	 * Author XuMaoSen
	 * @return the version
	 */
	@Version()
	@Column(insertable=false)
	public Integer getVersion() {
		return version;
	}
	/**
	 * Author XuMaoSen
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * Author XuMaoSen
	 * @return the createDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * Author XuMaoSen
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
