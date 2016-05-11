package com.mxnavi.yongcheyi.dto;

import java.util.Date;

public class ArticleDto {
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
		this.title = title;
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
		this.author = author;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
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
		this.contentSourceUrl = contentSourceUrl;
	}

	public String getSoftDeleteFlag() {
		return softDeleteFlag;
	}

	public void setSoftDeleteFlag(String softDeleteFlag) {
		this.softDeleteFlag = softDeleteFlag;
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
		this.content = content;
	}

}
