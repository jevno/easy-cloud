package com.dq.easy.cloud.model.basic.entity;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 
 * @ClassName : DqBaseEntity 
 * @Description : 所有持久化实体的基础类 
 * @author daiqi
 * @date 2017年12月4日 下午12:47:39 
 *
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class DqBaseEntity {
	@Id
	@GeneratedValue(generator = "idGenerator")  
    @GenericGenerator(name = "idGenerator", strategy = "com.dq.easy.cloud.model.strategy.keygenerate.KeyGeneratSnowflakeldWorlker",  
    parameters = { @Parameter(name = "workerId", value = "0") ,@Parameter(name = "datacenterId", value = "0")}) 
	private Long id;
	@CreatedDate
	private Date createDate;
	@LastModifiedDate
	private Date updateDate;
	@Version
	private Integer version;
	@CreatedBy
	private Long createBy;
	@LastModifiedBy
	private Long updateBy;
//	删除标志
	private Integer isDeleted;
	@PrePersist
	public void basePrePersist(){
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
