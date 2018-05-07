/*************************************************************************
 * @system name：  :信人在线
 * @Author: 李宏伟 207416511@qq.com
 * @Date: 2018年4月28日 下午3:20:53
 * @(c) Copyright 上海达信财富
 **************************************************************************/

package cn.z.jiutian.md5;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @包名 :com.fuan.mwp.web.BO
 * @文件名 :lenderInfoBO.java TODO 类作用：
 * @系统名称 : 现金贷
 * @Author: 李宏伟
 * @Date: 2018年4月28日 下午3:20:53
 * @版本号 :v0.0.01
 */
public class LenderInfo implements Serializable {

	/**
	 * <code>serialVersionUID</code> of comment
	 */
	private static final long serialVersionUID = -3799000090401714710L;

	private String LendOrderType;
	
	private BigDecimal lenderAmount;
	
	private String lenderIdNum;
	
	private String lenderIdType;
	
	private String lenderMemberNo;
	
	private String lenderName;
	
	private String lenderOrderNo;
	

    public String getLendOrderType() {
        return LendOrderType;
    }

    public void setLendOrderType(String lendOrderType) {
        LendOrderType = lendOrderType;
    }

    public BigDecimal getLenderAmount() {
        return lenderAmount;
    }

    public void setLenderAmount(BigDecimal lenderAmount) {
        this.lenderAmount = lenderAmount;
    }

    public String getLenderIdNum() {
        return lenderIdNum;
    }

    public void setLenderIdNum(String lenderIdNum) {
        this.lenderIdNum = lenderIdNum;
    }

    public String getLenderIdType() {
        return lenderIdType;
    }

    public void setLenderIdType(String lenderIdType) {
        this.lenderIdType = lenderIdType;
    }

    public String getLenderMemberNo() {
        return lenderMemberNo;
    }

    public void setLenderMemberNo(String lenderMemberNo) {
        this.lenderMemberNo = lenderMemberNo;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public String getLenderOrderNo() {
        return lenderOrderNo;
    }

    public void setLenderOrderNo(String lenderOrderNo) {
        this.lenderOrderNo = lenderOrderNo;
    }
	
}
