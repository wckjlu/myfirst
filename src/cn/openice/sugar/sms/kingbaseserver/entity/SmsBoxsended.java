package cn.openice.sugar.sms.kingbaseserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SmsBoxsended entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sms_boxsended", catalog = "sugar2014")
public class SmsBoxsended implements java.io.Serializable {

	// Fields

	private String id;
	private String appid;
	private String sender;
	private String receiver;
	private String content;
	private String moduleid;
	private String inserttime;
	private String createtime;
	private String pri;
	private String sendtime;
	private String taskBatchname;
	private Integer retrytimes;
	private String addtion1;
	private String addtion2;
	private String addtion3;
	private String sendmode;
	private Integer sid;
	private String receipt;
	private String receipttime;
	private String innerid;
	private Integer fragcount;
	private String configid;
	private String linkid1;
	private String linkid2;
	private String validityperiod;
	private String ifreceipt;
	private String outteruser;

	// Constructors

	/** default constructor */
	public SmsBoxsended() {
	}

	/** minimal constructor */
	public SmsBoxsended(String id) {
		this.id = id;
	}

	/** full constructor */
	public SmsBoxsended(String id, String appid, String sender,
			String receiver, String content, String moduleid,
			String inserttime, String createtime, String pri, String sendtime,
			String taskBatchname, Integer retrytimes, String addtion1,
			String addtion2, String addtion3, String sendmode, Integer sid,
			String receipt, String receipttime, String innerid,
			Integer fragcount, String configid, String linkid1, String linkid2,
			String validityperiod, String ifreceipt, String outteruser) {
		this.id = id;
		this.appid = appid;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.moduleid = moduleid;
		this.inserttime = inserttime;
		this.createtime = createtime;
		this.pri = pri;
		this.sendtime = sendtime;
		this.taskBatchname = taskBatchname;
		this.retrytimes = retrytimes;
		this.addtion1 = addtion1;
		this.addtion2 = addtion2;
		this.addtion3 = addtion3;
		this.sendmode = sendmode;
		this.sid = sid;
		this.receipt = receipt;
		this.receipttime = receipttime;
		this.innerid = innerid;
		this.fragcount = fragcount;
		this.configid = configid;
		this.linkid1 = linkid1;
		this.linkid2 = linkid2;
		this.validityperiod = validityperiod;
		this.ifreceipt = ifreceipt;
		this.outteruser = outteruser;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "appid", length = 20)
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	@Column(name = "sender", length = 20)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Column(name = "receiver", length = 20)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "moduleid", length = 20)
	public String getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(String moduleid) {
		this.moduleid = moduleid;
	}

	@Column(name = "inserttime", length = 20)
	public String getInserttime() {
		return this.inserttime;
	}

	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
	}

	@Column(name = "createtime", length = 20)
	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	@Column(name = "pri", length = 1)
	public String getPri() {
		return this.pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}

	@Column(name = "sendtime", length = 20)
	public String getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

	@Column(name = "task_batchname", length = 40)
	public String getTaskBatchname() {
		return this.taskBatchname;
	}

	public void setTaskBatchname(String taskBatchname) {
		this.taskBatchname = taskBatchname;
	}

	@Column(name = "retrytimes")
	public Integer getRetrytimes() {
		return this.retrytimes;
	}

	public void setRetrytimes(Integer retrytimes) {
		this.retrytimes = retrytimes;
	}

	@Column(name = "addtion1", length = 20)
	public String getAddtion1() {
		return this.addtion1;
	}

	public void setAddtion1(String addtion1) {
		this.addtion1 = addtion1;
	}

	@Column(name = "addtion2", length = 30)
	public String getAddtion2() {
		return this.addtion2;
	}

	public void setAddtion2(String addtion2) {
		this.addtion2 = addtion2;
	}

	@Column(name = "addtion3", length = 40)
	public String getAddtion3() {
		return this.addtion3;
	}

	public void setAddtion3(String addtion3) {
		this.addtion3 = addtion3;
	}

	@Column(name = "sendmode", length = 1)
	public String getSendmode() {
		return this.sendmode;
	}

	public void setSendmode(String sendmode) {
		this.sendmode = sendmode;
	}

	@Column(name = "sid")
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Column(name = "receipt", length = 20)
	public String getReceipt() {
		return this.receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	@Column(name = "receipttime", length = 20)
	public String getReceipttime() {
		return this.receipttime;
	}

	public void setReceipttime(String receipttime) {
		this.receipttime = receipttime;
	}

	@Column(name = "innerid", length = 50)
	public String getInnerid() {
		return this.innerid;
	}

	public void setInnerid(String innerid) {
		this.innerid = innerid;
	}

	@Column(name = "fragcount")
	public Integer getFragcount() {
		return this.fragcount;
	}

	public void setFragcount(Integer fragcount) {
		this.fragcount = fragcount;
	}

	@Column(name = "configid", length = 20)
	public String getConfigid() {
		return this.configid;
	}

	public void setConfigid(String configid) {
		this.configid = configid;
	}

	@Column(name = "linkid1", length = 50)
	public String getLinkid1() {
		return this.linkid1;
	}

	public void setLinkid1(String linkid1) {
		this.linkid1 = linkid1;
	}

	@Column(name = "linkid2", length = 50)
	public String getLinkid2() {
		return this.linkid2;
	}

	public void setLinkid2(String linkid2) {
		this.linkid2 = linkid2;
	}

	@Column(name = "validityperiod", length = 20)
	public String getValidityperiod() {
		return this.validityperiod;
	}

	public void setValidityperiod(String validityperiod) {
		this.validityperiod = validityperiod;
	}

	@Column(name = "ifreceipt", length = 1)
	public String getIfreceipt() {
		return this.ifreceipt;
	}

	public void setIfreceipt(String ifreceipt) {
		this.ifreceipt = ifreceipt;
	}

	@Column(name = "outteruser", length = 100)
	public String getOutteruser() {
		return this.outteruser;
	}

	public void setOutteruser(String outteruser) {
		this.outteruser = outteruser;
	}

}