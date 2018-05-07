/*************************************************************************
 * @system name：  :信人在线
 * @Author: 李宏伟 207416511@qq.com
 * @Date: 2018年4月28日 下午3:02:37
 * @(c) Copyright 上海达信财富
 **************************************************************************/

package cn.z.jiutian.md5;

import java.io.Serializable;
import java.util.List;

/**
 * @包名 :com.fuan.mwp.web.BO
 * @文件名 :BorrowingTheBO.java TODO 类作用：
 * @系统名称 : 现金贷
 * @Author: 李宏伟
 * @Date: 2018年4月28日 下午3:02:37
 * @版本号 :v0.0.01
 */
public class BorrowInfo implements Serializable {
	/**
	 * <code>serialVersionUID</code> of comment
	 */
	private static final long serialVersionUID = 7375397067047360496L;

	private long bidBeforDate;
	
	private long bidEndDate;
	
	private String bidNo;
	
	private List<LenderInfo> lenderInfoList;
	
	private String state;
	
	private String systemSource;
	

    public long getBidBeforDate() {
        return bidBeforDate;
    }

    public void setBidBeforDate(long bidBeforDate) {
        this.bidBeforDate = bidBeforDate;
    }

    public long getBidEndDate() {
        return bidEndDate;
    }

    public void setBidEndDate(long bidEndDate) {
        this.bidEndDate = bidEndDate;
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo;
    }

    public List<LenderInfo> getLenderInfoList() {
        return lenderInfoList;
    }

    public void setLenderInfoList(List<LenderInfo> lenderInfoList) {
        this.lenderInfoList = lenderInfoList;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }
	
}
