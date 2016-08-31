package org.opensource.myzone.modules.commons.base;

import java.io.Serializable;
import java.sql.Date;

/**
 * 共用的字段
 * @author king
 *
 */
public class BaseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	/**创建者*/
	private String createBy;
	/**创建时间*/
	private Date createDate;
	/**更新者*/
	private String lastUpdateBy;
	/**更新时间*/
	private Date lastUpdateDate;
	/**备注*/
	private String remark;
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
