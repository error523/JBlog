package com.mitewater.blog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVIEW<M extends BaseVIEW<M>> extends Model<M> implements IBean {

	public void setID(java.lang.String ID) {
		set("ID", ID);
	}

	public java.lang.String getID() {
		return get("ID");
	}

	public void setViewTitle(java.lang.String viewTitle) {
		set("VIEW_TITLE", viewTitle);
	}

	public java.lang.String getViewTitle() {
		return get("VIEW_TITLE");
	}

	public void setViewText(java.lang.String viewText) {
		set("VIEW_TEXT", viewText);
	}

	public java.lang.String getViewText() {
		return get("VIEW_TEXT");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("CREATE_TIME");
	}

	public void setLeaveMsgId(java.lang.String leaveMsgId) {
		set("LEAVE_MSG_ID", leaveMsgId);
	}

	public java.lang.String getLeaveMsgId() {
		return get("LEAVE_MSG_ID");
	}

	public void setViewAuthor(java.lang.String viewAuthor) {
		set("VIEW_AUTHOR", viewAuthor);
	}

	public java.lang.String getViewAuthor() {
		return get("VIEW_AUTHOR");
	}

	public void setViewClassification(java.lang.String viewClassification) {
		set("VIEW_CLASSIFICATION", viewClassification);
	}

	public java.lang.String getViewClassification() {
		return get("VIEW_CLASSIFICATION");
	}

	public void setViewComments(java.lang.Integer viewComments) {
		set("VIEW_COMMENTS", viewComments);
	}

	public java.lang.Integer getViewComments() {
		return get("VIEW_COMMENTS");
	}

}