package cn.z.jiutian.soap.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class cpsResponse {

	private String retInfo;
	private String retCode;
	private String systemSourceId;
	private String bgRetUrl;
	private String busiCode;
	private String chkValue;
	private String cmdId;
	private String guarType;
	private String instuCode;
	private String merCustId;
	private String merPriv;
	private String taxCode;
	private String url;
	private String userId;
	private String version;
	
	public String getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(String retInfo) {
		this.retInfo = retInfo;
	}
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getSystemSourceId() {
		return systemSourceId;
	}
	public void setSystemSourceId(String systemSourceId) {
		this.systemSourceId = systemSourceId;
	}
	public String getBgRetUrl() {
		return bgRetUrl;
	}
	public void setBgRetUrl(String bgRetUrl) {
		this.bgRetUrl = bgRetUrl;
	}
	public String getBusiCode() {
		return busiCode;
	}
	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}
	public String getChkValue() {
		return chkValue;
	}
	public void setChkValue(String chkValue) {
		this.chkValue = chkValue;
	}
	public String getCmdId() {
		return cmdId;
	}
	public void setCmdId(String cmdId) {
		this.cmdId = cmdId;
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
	public String getMerCustId() {
		return merCustId;
	}
	public void setMerCustId(String merCustId) {
		this.merCustId = merCustId;
	}
	public String getMerPriv() {
		return merPriv;
	}
	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
