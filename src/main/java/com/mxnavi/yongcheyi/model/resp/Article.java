package com.mxnavi.yongcheyi.model.resp;

import java.util.Date;

public class Article {
	private Integer id;

	private String title;

	private Integer thumbMediaId;

	private String author;

	private String digest;

	private Byte showCoverPic;

	private String contentSourceUrl;

	private String softDeleteFlag;

	private Date createTime;

	private Date updateTime;

	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Integer getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(Integer thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest == null ? null : digest.trim();
	}

	public Byte getShowCoverPic() {
		return showCoverPic;
	}

	public void setShowCoverPic(Byte showCoverPic) {
		this.showCoverPic = showCoverPic;
	}

	public String getContentSourceUrl() {
		return contentSourceUrl;
	}

	public void setContentSourceUrl(String contentSourceUrl) {
		this.contentSourceUrl = contentSourceUrl == null ? null : contentSourceUrl.trim();
	}

	public String getSoftDeleteFlag() {
		return softDeleteFlag;
	}

	public void setSoftDeleteFlag(String softDeleteFlag) {
		this.softDeleteFlag = softDeleteFlag == null ? null : softDeleteFlag.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}