/**
 * <p> * Title: 叶明开发的代码系统*</p>
 * <p> * Description: * </p>
 * <p> * Copyright: Copyright (c) 2012-2014* </p>
 * <p> * Company: java工作者 * </p>
 * @author 叶明（开发）
 * @version 2.0
 */
package hello.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@SuppressWarnings("serial")
public class News  implements Serializable {

	private int id;
	private String title;
	private String picurl;
	private String author;
	private int authorid;
	private String tag;
	private String keylist;
	private String summary;
	private String origin;
	private String originurl;
	private int sectionid;
	private String sectionname;
	private int topicid;
	private int groupid;
	private String newstype;
	// 2.2版本新增，展示新闻类型
	private String showtype; // 展示类型
	private String isstick;
	private String isspecial;
	private String ismember;
	private String isadvertise;
	private String issendmsg;
	private String isreplay;
	private int replay;
	private int praise;
	private int viewcount;
	private int collectcount;
	private int templateid;
	private int noweditid;
	private String noweditname;
	private Date editlocktime;
	private String editer;
	private String editername;
	private String dutyedit;
	private String dutyeditname;
	private Date publishtime;
	private String publisher;
	private String publishername;
	private String ispublish;
	private String status;
	private String auditer;
	private String rejectreason;
	private Date preannouncetime;
	private Date addtime;
	private String adduser;
	private Date edittime;
	private String edittimeuser;
	private String slock;
	private int iorder;
	private int continuity; // 并排新闻展示 0：后面的新闻不并排展示；1：后面的新闻并排展示
	// 2.0.1 副标题 广州观察增加
	private String subtitle; // 副标题
	// siance 2.0.1 h5的新闻连接地址
	private String linkurl; // 连接地址
	private String isshare; // 是否允许分享

	private String detail;
	private String ext_shareurl;
	private String ext_sharepic; // 分享图片地址
	private int customerId;
	private String tagid;
	private String titleother; // 第二标题，详情页使用
	private int showviewcount;// 添加的浏览量

	private String leader;
	private int leaderid;

	private String isapp;
	private String isweb;

	private Date webpublishtime;
	private String webisstick;
	private int webiorder;

	private String webtitle;

	public String getWebtitle() {
		return webtitle;
	}

	public void setWebtitle(String webtitle) {
		this.webtitle = webtitle;
	}

	public Date getWebpublishtime() {
		return webpublishtime;
	}

	public void setWebpublishtime(Date webpublishtime) {
		this.webpublishtime = webpublishtime;
	}

	public String getWebisstick() {
		return webisstick;
	}

	public void setWebisstick(String webisstick) {
		this.webisstick = webisstick;
	}

	public int getWebiorder() {
		return webiorder;
	}

	public void setWebiorder(int webiorder) {
		this.webiorder = webiorder;
	}

	private static String tableName;

	public static String getTableName() {
		if (null == tableName) {
			tableName = "t_" + News.class.getSimpleName().toLowerCase();
		}
		return tableName;
	}

	public News() {
	}

	/**
	 * @param id
	 * @param title
	 * @param picurl
	 * @param author
	 * @param authorid
	 * @param tag
	 * @param keylist
	 * @param summary
	 * @param origin
	 * @param originurl
	 * @param sectionid
	 * @param sectionname
	 * @param topicid
	 * @param groupid
	 * @param newstype
	 * @param showtype
	 * @param isstick
	 * @param isspecial
	 * @param ismember
	 * @param isadvertise
	 * @param issendmsg
	 * @param isreplay
	 * @param replay
	 * @param praise
	 * @param viewcount
	 * @param collectcount
	 * @param templateid
	 * @param noweditid
	 * @param noweditname
	 * @param editlocktime
	 * @param editer
	 * @param editername
	 * @param dutyedit
	 * @param dutyeditname
	 * @param publishtime
	 * @param publisher
	 * @param publishername
	 * @param ispublish
	 * @param status
	 * @param auditer
	 * @param rejectreason
	 * @param preannouncetime
	 * @param addtime
	 * @param adduser
	 * @param edittime
	 * @param edittimeuser
	 * @param slock
	 * @param iorder
	 * @param subtitle
	 * @param linkurl
	 * @param isshare
	 * @param detail
	 */
	public News(String isapp, String isweb, String leader, int leaderid, int id, String title, String picurl,
                String author, int authorid, String tag, String keylist, String summary, String origin, String originurl,
                int sectionid, String sectionname, int topicid, int groupid, String newstype, String showtype,
                String isstick, String isspecial, String ismember, String isadvertise, String issendmsg, String isreplay,
                int replay, int praise, int viewcount, int collectcount, int templateid, int noweditid, String noweditname,
                Date editlocktime, String editer, String editername, String dutyedit, String dutyeditname, Date publishtime,
                String publisher, String publishername, String ispublish, String status, String auditer,
                String rejectreason, Date preannouncetime, Date addtime, String adduser, Date edittime, String edittimeuser,
                String slock, int iorder, String subtitle, String linkurl, String isshare, String detail, int continuity,
                int customerId, String titleother, int showviewcount) {
		super();
		this.isapp = isapp;
		this.isweb = isweb;
		this.leader = leader;
		this.leaderid = leaderid;
		this.id = id;
		this.title = title;
		this.picurl = picurl;
		this.author = author;
		this.authorid = authorid;
		this.tag = tag;
		this.keylist = keylist;
		this.summary = summary;
		this.origin = origin;
		this.originurl = originurl;
		this.sectionid = sectionid;
		this.sectionname = sectionname;
		this.topicid = topicid;
		this.groupid = groupid;
		this.newstype = newstype;
		this.showtype = showtype;
		this.isstick = isstick;
		this.isspecial = isspecial;
		this.ismember = ismember;
		this.isadvertise = isadvertise;
		this.issendmsg = issendmsg;
		this.isreplay = isreplay;
		this.replay = replay;
		this.praise = praise;
		this.viewcount = viewcount;
		this.collectcount = collectcount;
		this.templateid = templateid;
		this.noweditid = noweditid;
		this.noweditname = noweditname;
		this.editlocktime = editlocktime;
		this.editer = editer;
		this.editername = editername;
		this.dutyedit = dutyedit;
		this.dutyeditname = dutyeditname;
		this.publishtime = publishtime;
		this.publisher = publisher;
		this.publishername = publishername;
		this.ispublish = ispublish;
		this.status = status;
		this.auditer = auditer;
		this.rejectreason = rejectreason;
		this.preannouncetime = preannouncetime;
		this.addtime = addtime;
		this.adduser = adduser;
		this.edittime = edittime;
		this.edittimeuser = edittimeuser;
		this.slock = slock;
		this.iorder = iorder;
		this.subtitle = subtitle;
		this.linkurl = linkurl;
		this.isshare = isshare;
		this.detail = detail;
		this.continuity = continuity;
		this.customerId = customerId;
		this.titleother = titleother;
		this.showviewcount = showviewcount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the picurl
	 */
	public String getPicurl() {
		return picurl;
	}

	/**
	 * @param picurl
	 *            the picurl to set
	 */
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the authorid
	 */
	public int getAuthorid() {
		return authorid;
	}

	/**
	 * @param authorid
	 *            the authorid to set
	 */
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag
	 *            the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the keylist
	 */
	public String getKeylist() {
		return keylist;
	}

	/**
	 * @param keylist
	 *            the keylist to set
	 */
	public void setKeylist(String keylist) {
		this.keylist = keylist;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the originurl
	 */
	public String getOriginurl() {
		return originurl;
	}

	/**
	 * @param originurl
	 *            the originurl to set
	 */
	public void setOriginurl(String originurl) {
		this.originurl = originurl;
	}

	/**
	 * @return the sectionid
	 */
	public int getSectionid() {
		return sectionid;
	}

	/**
	 * @param sectionid
	 *            the sectionid to set
	 */
	public void setSectionid(int sectionid) {
		this.sectionid = sectionid;
	}

	/**
	 * @return the sectionname
	 */
	public String getSectionname() {
		return sectionname;
	}

	/**
	 * @param sectionname
	 *            the sectionname to set
	 */
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

	/**
	 * @return the topicid
	 */
	public int getTopicid() {
		return topicid;
	}

	/**
	 * @param topicid
	 *            the topicid to set
	 */
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	/**
	 * @return the groupid
	 */
	public int getGroupid() {
		return groupid;
	}

	/**
	 * @param groupid
	 *            the groupid to set
	 */
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	/**
	 * @return the newstype
	 */
	public String getNewstype() {
		return newstype;
	}

	/**
	 * @param newstype
	 *            the newstype to set
	 */
	public void setNewstype(String newstype) {
		this.newstype = newstype;
	}

	/**
	 * @return the isstick
	 */
	public String getIsstick() {
		return isstick;
	}

	/**
	 * @param isstick
	 *            the isstick to set
	 */
	public void setIsstick(String isstick) {
		this.isstick = isstick;
	}

	/**
	 * @return the isspecial
	 */
	public String getIsspecial() {
		return isspecial;
	}

	/**
	 * @param isspecial
	 *            the isspecial to set
	 */
	public void setIsspecial(String isspecial) {
		this.isspecial = isspecial;
	}

	/**
	 * @return the ismember
	 */
	public String getIsmember() {
		return ismember;
	}

	/**
	 * @param ismember
	 *            the ismember to set
	 */
	public void setIsmember(String ismember) {
		this.ismember = ismember;
	}

	/**
	 * @return the isadvertise
	 */
	public String getIsadvertise() {
		return isadvertise;
	}

	/**
	 * @param isadvertise
	 *            the isadvertise to set
	 */
	public void setIsadvertise(String isadvertise) {
		this.isadvertise = isadvertise;
	}

	/**
	 * @return the issendmsg
	 */
	public String getIssendmsg() {
		return issendmsg;
	}

	/**
	 * @param issendmsg
	 *            the issendmsg to set
	 */
	public void setIssendmsg(String issendmsg) {
		this.issendmsg = issendmsg;
	}

	/**
	 * @return the isreplay
	 */
	public String getIsreplay() {
		return isreplay;
	}

	/**
	 * @param isreplay
	 *            the isreplay to set
	 */
	public void setIsreplay(String isreplay) {
		this.isreplay = isreplay;
	}

	/**
	 * @return the replay
	 */
	public int getReplay() {
		return replay;
	}

	/**
	 * @param replay
	 *            the replay to set
	 */
	public void setReplay(int replay) {
		this.replay = replay;
	}

	/**
	 * @return the praise
	 */
	public int getPraise() {
		return praise;
	}

	/**
	 * @param praise
	 *            the praise to set
	 */
	public void setPraise(int praise) {
		this.praise = praise;
	}

	/**
	 * @return the viewcount
	 */
	public int getViewcount() {
		return viewcount;
	}

	/**
	 * @param viewcount
	 *            the viewcount to set
	 */
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	/**
	 * @return the collectcount
	 */
	public int getCollectcount() {
		return collectcount;
	}

	/**
	 * @param collectcount
	 *            the collectcount to set
	 */
	public void setCollectcount(int collectcount) {
		this.collectcount = collectcount;
	}

	/**
	 * @return the templateid
	 */
	public int getTemplateid() {
		return templateid;
	}

	/**
	 * @param templateid
	 *            the templateid to set
	 */
	public void setTemplateid(int templateid) {
		this.templateid = templateid;
	}

	/**
	 * @return the noweditid
	 */
	public int getNoweditid() {
		return noweditid;
	}

	/**
	 * @param noweditid
	 *            the noweditid to set
	 */
	public void setNoweditid(int noweditid) {
		this.noweditid = noweditid;
	}

	/**
	 * @return the noweditname
	 */
	public String getNoweditname() {
		return noweditname;
	}

	/**
	 * @param noweditname
	 *            the noweditname to set
	 */
	public void setNoweditname(String noweditname) {
		this.noweditname = noweditname;
	}

	/**
	 * @return the editlocktime
	 */
	public Date getEditlocktime() {
		return editlocktime;
	}

	/**
	 * @param editlocktime
	 *            the editlocktime to set
	 */
	public void setEditlocktime(Date editlocktime) {
		this.editlocktime = editlocktime;
	}

	/**
	 * @return the editer
	 */
	public String getEditer() {
		return editer;
	}

	/**
	 * @param editer
	 *            the editer to set
	 */
	public void setEditer(String editer) {
		this.editer = editer;
	}

	/**
	 * @return the editername
	 */
	public String getEditername() {
		return editername;
	}

	/**
	 * @param editername
	 *            the editername to set
	 */
	public void setEditername(String editername) {
		this.editername = editername;
	}

	/**
	 * @return the dutyedit
	 */
	public String getDutyedit() {
		return dutyedit;
	}

	/**
	 * @param dutyedit
	 *            the dutyedit to set
	 */
	public void setDutyedit(String dutyedit) {
		this.dutyedit = dutyedit;
	}

	/**
	 * @return the dutyeditname
	 */
	public String getDutyeditname() {
		return dutyeditname;
	}

	/**
	 * @param dutyeditname
	 *            the dutyeditname to set
	 */
	public void setDutyeditname(String dutyeditname) {
		this.dutyeditname = dutyeditname;
	}

	/**
	 * @return the publishtime
	 */
	public Date getPublishtime() {
		return publishtime;
	}

	/**
	 * @param publishtime
	 *            the publishtime to set
	 */
	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the publishername
	 */
	public String getPublishername() {
		return publishername;
	}

	/**
	 * @param publishername
	 *            the publishername to set
	 */
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

	/**
	 * @return the ispublish
	 */
	public String getIspublish() {
		return ispublish;
	}

	/**
	 * @param ispublish
	 *            the ispublish to set
	 */
	public void setIspublish(String ispublish) {
		this.ispublish = ispublish;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the auditer
	 */
	public String getAuditer() {
		return auditer;
	}

	/**
	 * @param auditer
	 *            the auditer to set
	 */
	public void setAuditer(String auditer) {
		this.auditer = auditer;
	}

	/**
	 * @return the rejectreason
	 */
	public String getRejectreason() {
		return rejectreason;
	}

	/**
	 * @param rejectreason
	 *            the rejectreason to set
	 */
	public void setRejectreason(String rejectreason) {
		this.rejectreason = rejectreason;
	}

	/**
	 * @return the preannouncetime
	 */
	public Date getPreannouncetime() {
		return preannouncetime;
	}

	/**
	 * @param preannouncetime
	 *            the preannouncetime to set
	 */
	public void setPreannouncetime(Date preannouncetime) {
		this.preannouncetime = preannouncetime;
	}

	/**
	 * @return the addtime
	 */
	public Date getAddtime() {
		return addtime;
	}

	/**
	 * @param addtime
	 *            the addtime to set
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	/**
	 * @return the adduser
	 */
	public String getAdduser() {
		return adduser;
	}

	/**
	 * @param adduser
	 *            the adduser to set
	 */
	public void setAdduser(String adduser) {
		this.adduser = adduser;
	}

	/**
	 * @return the edittime
	 */
	public Date getEdittime() {
		return edittime;
	}

	/**
	 * @param edittime
	 *            the edittime to set
	 */
	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	/**
	 * @return the edittimeuser
	 */
	public String getEdittimeuser() {
		return edittimeuser;
	}

	/**
	 * @param edittimeuser
	 *            the edittimeuser to set
	 */
	public void setEdittimeuser(String edittimeuser) {
		this.edittimeuser = edittimeuser;
	}

	/**
	 * @return the slock
	 */
	public String getSlock() {
		return slock;
	}

	/**
	 * @param slock
	 *            the slock to set
	 */
	public void setSlock(String slock) {
		this.slock = slock;
	}

	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * @param subtitle
	 *            the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * @return the linkurl
	 */
	public String getLinkurl() {
		return linkurl;
	}

	/**
	 * @param linkurl
	 *            the linkurl to set
	 */
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail
	 *            the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getExt_shareurl() {
		return ext_shareurl;
	}

	public void setExt_shareurl(String ext_shareurl) {
		this.ext_shareurl = ext_shareurl;
	}

	public String getExt_sharepic() {
		return ext_sharepic;
	}

	public void setExt_sharepic(String ext_sharepic) {
		this.ext_sharepic = ext_sharepic;
	}

	public int getIorder() {
		return iorder;
	}

	public void setIorder(int iorder) {
		this.iorder = iorder;
	}

	/**
	 * @return the isshare
	 */
	public String getIsshare() {
		return isshare;
	}

	/**
	 * @param isshare
	 *            the isshare to set
	 */
	public void setIsshare(String isshare) {
		this.isshare = isshare;
	}

	/**
	 * @return the showtype
	 */
	public String getShowtype() {
		return showtype;
	}

	/**
	 * @param showtype
	 *            the showtype to set
	 */
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public int getContinuity() {
		return continuity;
	}

	public void setContinuity(int continuity) {
		this.continuity = continuity;
	}

	public String getTitleother() {
		return titleother;
	}

	public void setTitleother(String titleother) {
		this.titleother = titleother;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.javaworker.yeming.pojo.Entry#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.javaworker.yeming.pojo.Entry#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.javaworker.yeming.pojo.Entry#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTagid() {
		return tagid;
	}

	public void setTagid(String tagid) {
		this.tagid = tagid;
	}

	public int getShowviewcount() {
		return showviewcount;
	}

	public void setShowviewcount(int showviewcount) {
		this.showviewcount = showviewcount;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public int getLeaderid() {
		return leaderid;
	}

	public void setLeaderid(int leaderid) {
		this.leaderid = leaderid;
	}

	public String getIsapp() {
		return isapp;
	}

	public void setIsapp(String isapp) {
		this.isapp = isapp;
	}

	public String getIsweb() {
		return isweb;
	}

	public void setIsweb(String isweb) {
		this.isweb = isweb;
	}
}