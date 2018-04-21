package cn.z.jiutian.soap.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class cpsRequest {

	private String bgRetUrl;
	private String bizId;
	private String cmdId;
	private String pageRetUrl;
	private String save;
	private String signature;
	private String systemSourceId;
	private String userId;
	private String busiCode;
	private String cardId;
	private String guarType;
	private String instuCode;
	private String mobilePhone;
	private String realName;
	private String taxCode;
	private String userNature;
	
	
	public String getBgRetUrl() {
		return bgRetUrl;
	}
	public void setBgRetUrl(String bgRetUrl) {
		this.bgRetUrl = bgRetUrl;
	}
	public String getBizId() {
		return bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getCmdId() {
		return cmdId;
	}
	public void setCmdId(String cmdId) {
		this.cmdId = cmdId;
	}
	public String getPageRetUrl() {
		return pageRetUrl;
	}
	public void setPageRetUrl(String pageRetUrl) {
		this.pageRetUrl = pageRetUrl;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSystemSourceId() {
		return systemSourceId;
	}
	public void setSystemSourceId(String systemSourceId) {
		this.systemSourceId = systemSourceId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBusiCode() {
		return busiCode;
	}
	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getGuarType() {
		return guarType;
	}
	public void setGuarType(String guarType) {
		this.guarType = guarType;
	}
	public String getInstuCode() {
		return instuCode;
	}
	public void setInstuCode(String instuCode) {
		this.instuCode = instuCode;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getUserNature() {
		return userNature;
	}
	public void setUserNature(String userNature) {
		this.userNature = userNature;
	}
	
}
