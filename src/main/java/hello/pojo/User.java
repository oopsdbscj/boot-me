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
 * 创建日期：2014-07-16 10:27:05
 * 开发者：叶明(MSN:guming123416@hotmail.com,QQ:47043760)
 * 修改者：
 * 修改时间：
 * 程序作用：
 * 1、
 * 2、
 * 修改说明：
 * 1、
 * 2、
 * 版本：@version 2.0
 * @author 叶明
 */
@SuppressWarnings("serial")
public class User implements Serializable {
	
	private int id;
	private String username;
	private String mobile;
	private String email;
	private String userpass;
	private String nickname;
	private String firstletter;
	private String spell;
	private String allspell;
	private int clazzid;
	private String realname;
	private Date birthday;
	private String sex;
	private String wechat;
	private String telephone;
	private String detail;
	private String chargtype;
	private String cardnum;
	private String cardpass;
	private String membertype;
	private Date memberendtime;
	private Date memberstarttime;
	private int paystatus;
	private String ordernum;
	private int viewnews;
	private int groupid;
	private int chargeid;
	private int logintimes;
	private Date lastlogintime;
	private String lastloginip;
    private String platform;
	private int adduserid;
	private Date addtime;
	private int edituserid;
	private Date edittime;
	private String slock;
	private Date headpiclastupdate;
	private String gtclient;   //个推的唯一标识
	private int customerId;

    private String ext_groupname;       //新增于数据库没有关系
    private String ext_headpic;
    
    


	private static String tableName;
	public static String getTableName(){
		if(null  == tableName) {
			tableName = "t_" + User.class.getSimpleName().toLowerCase();
		}
		return tableName;
	}


	public User(){}

	public User(int id, String username, String mobile, String email, String userpass, String nickname, String firstletter,
                String spell, String allspell, int clazzid, String realname, Date birthday, String sex, String wechat,
                String telephone, String detail, String chargtype, String cardnum, String cardpass, String membertype,
                Date memberendtime, Date memberstarttime, int paystatus, String ordernum, int viewnews, int groupid,
                int chargeid, int logintimes, Date lastlogintime, String lastloginip, String platform, int adduserid,
                Date addtime, int edituserid, Date edittime, String slock, Date headpiclastupdate, String gtclient, int customerId){
		this.id=id;
		this.username=username;
		this.mobile=mobile;
		this.email=email;
		this.userpass=userpass;
		this.nickname=nickname;
		this.firstletter=firstletter;
		this.spell=spell;
		this.allspell=allspell;
		this.clazzid=clazzid;
		this.realname=realname;
		this.birthday=birthday;
		this.sex=sex;
		this.wechat=wechat;
		this.telephone=telephone;
		this.detail=detail;
		this.chargtype=chargtype;
		this.cardnum=cardnum;
		this.cardpass=cardpass;
		this.membertype=membertype;
		this.memberendtime=memberendtime;
		this.memberstarttime=memberstarttime;
		this.paystatus=paystatus;
		this.ordernum=ordernum;
		this.viewnews=viewnews;
		this.groupid=groupid;
		this.chargeid=chargeid;
		this.logintimes=logintimes;
		this.lastlogintime=lastlogintime;
		this.lastloginip=lastloginip;
		this.platform=platform;
		this.adduserid=adduserid;
		this.addtime=addtime;
		this.edituserid=edituserid;
		this.edittime=edittime;
		this.slock=slock;
		this.headpiclastupdate=headpiclastupdate;
		this.gtclient=gtclient;
		this.customerId=customerId;
	}


	/**
	* @return the id
	*/
	public int getId(){
		return id;
	}

	/**
	* @param id the id to set
	*/
	public void setId(int id){
		this.id = id;
	}
	/**
	* @return the username
	*/
	public String getUsername(){
		return username;
	}

	/**
	* @param username the username to set
	*/
	public void setUsername(String username){
		this.username = username;
	}
	/**
	* @return the mobile
	*/
	public String getMobile(){
		return mobile;
	}

	
	/**
	* @param mobile the mobile to set
	*/
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	/**
	* @return the email
	*/
	public String getEmail(){
		return email;
	}

	/**
	* @param email the email to set
	*/
	public void setEmail(String email){
		this.email = email;
	}
	/**
	* @return the userpass
	*/
	public String getUserpass(){
		return userpass;
	}

	/**
	* @param userpass the userpass to set
	*/
	public void setUserpass(String userpass){
		this.userpass = userpass;
	}
	/**
	* @return the nickname
	*/
	public String getNickname(){
		return nickname;
	}

	/**
	* @param nickname the nickname to set
	*/
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	/**
	* @return the firstletter
	*/
	public String getFirstletter(){
		return firstletter;
	}

	/**
	* @param firstletter the firstletter to set
	*/
	public void setFirstletter(String firstletter){
		this.firstletter = firstletter;
	}
	/**
	* @return the spell
	*/
	public String getSpell(){
		return spell;
	}

	/**
	* @param spell the spell to set
	*/
	public void setSpell(String spell){
		this.spell = spell;
	}
	/**
	* @return the allspell
	*/
	public String getAllspell(){
		return allspell;
	}

	/**
	* @param allspell the allspell to set
	*/
	public void setAllspell(String allspell){
		this.allspell = allspell;
	}
	/**
	* @return the clazzid
	*/
	public int getClazzid(){
		return clazzid;
	}

	/**
	* @param clazzid the clazzid to set
	*/
	public void setClazzid(int clazzid){
		this.clazzid = clazzid;
	}
	/**
	* @return the realname
	*/
	public String getRealname(){
		return realname;
	}

	/**
	* @param realname the realname to set
	*/
	public void setRealname(String realname){
		this.realname = realname;
	}
	/**
	* @return the birthday
	*/
	public Date getBirthday(){
		return birthday;
	}

	/**
	* @param birthday the birthday to set
	*/
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	/**
	* @return the sex
	*/
	public String getSex(){
		return sex;
	}

	/**
	* @param sex the sex to set
	*/
	public void setSex(String sex){
		this.sex = sex;
	}
	/**
	* @return the wechat
	*/
	public String getWechat(){
		return wechat;
	}

	/**
	* @param wechat the wechat to set
	*/
	public void setWechat(String wechat){
		this.wechat = wechat;
	}
	/**
	* @return the telephone
	*/
	public String getTelephone(){
		return telephone;
	}

	/**
	* @param telephone the telephone to set
	*/
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	/**
	* @return the detail
	*/
	public String getDetail(){
		return detail;
	}

	/**
	* @param detail the detail to set
	*/
	public void setDetail(String detail){
		this.detail = detail;
	}
	/**
	* @return the chargtype
	*/
	public String getChargtype(){
		return chargtype;
	}

	/**
	* @param chargtype the chargtype to set
	*/
	public void setChargtype(String chargtype){
		this.chargtype = chargtype;
	}
	/**
	* @return the cardnum
	*/
	public String getCardnum(){
		return cardnum;
	}

	/**
	* @param cardnum the cardnum to set
	*/
	public void setCardnum(String cardnum){
		this.cardnum = cardnum;
	}
	/**
	* @return the cardpass
	*/
	public String getCardpass(){
		return cardpass;
	}

	/**
	* @param cardpass the cardpass to set
	*/
	public void setCardpass(String cardpass){
		this.cardpass = cardpass;
	}
	/**
	* @return the membertype
	*/
	public String getMembertype(){
		return membertype;
	}

	/**
	* @param membertype the membertype to set
	*/
	public void setMembertype(String membertype){
		this.membertype = membertype;
	}
	/**
	* @return the memberendtime
	*/
	public Date getMemberendtime(){
		return memberendtime;
	}

	/**
	* @param memberendtime the memberendtime to set
	*/
	public void setMemberendtime(Date memberendtime){
		this.memberendtime = memberendtime;
	}
	/**
	* @return the memberstarttime
	*/
	public Date getMemberstarttime(){
		return memberstarttime;
	}

	/**
	* @param memberstarttime the memberstarttime to set
	*/
	public void setMemberstarttime(Date memberstarttime){
		this.memberstarttime = memberstarttime;
	}
	/**
	* @return the paystatus
	*/
	public int getPaystatus(){
		return paystatus;
	}

	/**
	* @param paystatus the paystatus to set
	*/
	public void setPaystatus(int paystatus){
		this.paystatus = paystatus;
	}
	/**
	* @return the ordernum
	*/
	public String getOrdernum(){
		return ordernum;
	}

	/**
	* @param ordernum the ordernum to set
	*/
	public void setOrdernum(String ordernum){
		this.ordernum = ordernum;
	}
	/**
	* @return the viewnews
	*/
	public int getViewnews(){
		return viewnews;
	}

	/**
	* @param viewnews the viewnews to set
	*/
	public void setViewnews(int viewnews){
		this.viewnews = viewnews;
	}
	/**
	* @return the groupid
	*/
	public int getGroupid(){
		return groupid;
	}

	/**
	* @param groupid the groupid to set
	*/
	public void setGroupid(int groupid){
		this.groupid = groupid;
	}
	/**
	* @return the chargeid
	*/
	public int getChargeid(){
		return chargeid;
	}

	/**
	* @param chargeid the chargeid to set
	*/
	public void setChargeid(int chargeid){
		this.chargeid = chargeid;
	}
	/**
	* @return the logintimes
	*/
	public int getLogintimes(){
		return logintimes;
	}

	/**
	* @param logintimes the logintimes to set
	*/
	public void setLogintimes(int logintimes){
		this.logintimes = logintimes;
	}
	/**
	* @return the lastlogintime
	*/
	public Date getLastlogintime(){
		return lastlogintime;
	}

	/**
	* @param lastlogintime the lastlogintime to set
	*/
	public void setLastlogintime(Date lastlogintime){
		this.lastlogintime = lastlogintime;
	}
	/**
	* @return the lastloginip
	*/
	public String getLastloginip(){
		return lastloginip;
	}

	/**
	* @param lastloginip the lastloginip to set
	*/
	public void setLastloginip(String lastloginip){
		this.lastloginip = lastloginip;
	}
	/**
	* @return the adduserid
	*/
	public int getAdduserid(){
		return adduserid;
	}

	/**
	* @param adduserid the adduserid to set
	*/
	public void setAdduserid(int adduserid){
		this.adduserid = adduserid;
	}
	/**
	* @return the addtime
	*/
	public Date getAddtime(){
		return addtime;
	}

	/**
	* @param addtime the addtime to set
	*/
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	/**
	* @return the edituserid
	*/
	public int getEdituserid(){
		return edituserid;
	}

	/**
	* @param edituserid the edituserid to set
	*/
	public void setEdituserid(int edituserid){
		this.edituserid = edituserid;
	}
	/**
	* @return the edittime
	*/
	public Date getEdittime(){
		return edittime;
	}

	/**
	* @param edittime the edittime to set
	*/
	public void setEdittime(Date edittime){
		this.edittime = edittime;
	}
	/**
	* @return the slock
	*/
	public String getSlock(){
		return slock;
	}

	/**
	* @param slock the slock to set
	*/
	public void setSlock(String slock){
		this.slock = slock;
	}

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getExt_groupname() {
        return ext_groupname;
    }

    public void setExt_groupname(String ext_groupname) {
        this.ext_groupname = ext_groupname;
    }

    
    
    /**
	 * @return the headpiclastupdate
	 */
	public Date getHeadpiclastupdate() {
		return headpiclastupdate;
	}


	/**
	 * @param headpiclastupdate the headpiclastupdate to set
	 */
	public void setHeadpiclastupdate(Date headpiclastupdate) {
		this.headpiclastupdate = headpiclastupdate;
	}

	/**
	 * @return the ext_headpic
	 */
	public String getExt_headpic() {
		return ext_headpic;
	}


	/**
	 * @param ext_headpic the ext_headpic to set
	 */
	public void setExt_headpic(String ext_headpic) {
		this.ext_headpic = ext_headpic;
	}

	/**
	* @return the gtclient
	*/
	public String getGtclient(){
		return gtclient;
	}

	/**
	* @param gtclient the gtclient to set
	*/
	public void setGtclient(String gtclient){
		this.gtclient = gtclient;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	/* (non-Javadoc)
        * @see cn.javaworker.yeming.pojo.Entry#hashCode()
        */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	/* (non-Javadoc)
	* @see cn.javaworker.yeming.pojo.Entry#toString()
	*/
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/* (non-Javadoc)
	* @see cn.javaworker.yeming.pojo.Entry#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
}