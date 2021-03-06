package com.mitewater.blog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMSG<M extends BaseMSG<M>> extends Model<M> implements IBean {

	public void setID(java.lang.String ID) {
		set("ID", ID);
	}

	public java.lang.String getID() {
		return get("ID");
	}

	public void setMsgContent(java.lang.String msgContent) {
		set("MSG_CONTENT", msgContent);
	}

	public java.lang.String getMsgContent() {
		return get("MSG_CONTENT");
	}

	public void setMsgAuthor(java.lang.String msgAuthor) {
		set("MSG_AUTHOR", msgAuthor);
	}

	public java.lang.String getMsgAuthor() {
		return get("MSG_AUTHOR");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("CREATE_TIME");
	}

	public void setCONTACT(java.lang.String CONTACT) {
		set("CONTACT", CONTACT);
	}

	public java.lang.String getCONTACT() {
		return get("CONTACT");
	}

	public void setREFERENCE(java.lang.String REFERENCE) {
		set("REFERENCE", REFERENCE);
	}

	public java.lang.String getREFERENCE() {
		return get("REFERENCE");
	}

	public void setWEBSITE(java.lang.String WEBSITE) {
		set("WEBSITE", WEBSITE);
	}

	public java.lang.String getWEBSITE() {
		return get("WEBSITE");
	}

}
