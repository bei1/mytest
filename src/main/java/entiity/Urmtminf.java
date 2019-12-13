package entiity;

public class Urmtminf{
    private static final long serialVersionUID = 1L;
    /*记录编号，描述记录是文件体中的第几条记录*/
    private String recId;

    /*商户号*/
    private String mercId;


    /*状态-0：正常;1：销户;5：冻结;2：注册失败;3：虚销户;7：未激活*/
    private String mercSts;

    /*商户类型 4-间联；3-直联*/
    private String mercType;

    /*代理商编号*/
    private String agtMercId;

    /*商户简称*/
    private String mercAbbr;

    /*商户注册日期*/
    private String createTime;

    /*最后更新日期时间*/
    private String updDt;

    /*最后更新日期时间*/
    private String updateTime;

    /*清分标志 mercType=3 clrFlag = Y,其他=N*/
    private String clrFlg;

    /*02 为社会统一信用证*/
    private String regType;

    /*证照代码*/
    private String regId;

    /*商户名称*/
    private String mercCnm;

    /*商户法定代表人姓名*/
    private String crpNm;

    /*商户法定代表人身份证号*/

    private String crpIdNo;

    /*结算账户性质*/

    private String clrAcTyp;

    /*结算账户账户号*/

    private String clrAc;

    /*注册日期*/

    private String creDt;


    private String lastUpTime;


    private String mangoCreateTime;

    public String getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(String lastUpTime) {
        this.lastUpTime = lastUpTime;
    }

    public String getMangoCreateTime() {
        return mangoCreateTime;
    }

    public void setMangoCreateTime(String mangoCreateTime) {
        this.mangoCreateTime = mangoCreateTime;
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public String getMercSts() {
        return mercSts;
    }

    public void setMercSts(String mercSts) {
        this.mercSts = mercSts;
    }

    public String getMercType() {
        return mercType;
    }

    public void setMercType(String mercType) {
        this.mercType = mercType;
    }

    public String getAgtMercId() {
        return agtMercId;
    }

    public void setAgtMercId(String agtMercId) {
        this.agtMercId = agtMercId;
    }

    public String getMercAbbr() {
        return mercAbbr;
    }

    public void setMercAbbr(String mercAbbr) {
        this.mercAbbr = mercAbbr;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdDt() {
        return updDt;
    }

    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getClrFlg() {
        return clrFlg;
    }

    public void setClrFlg(String clrFlg) {
        this.clrFlg = clrFlg;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getMercCnm() {
        return mercCnm;
    }

    public void setMercCnm(String mercCnm) {
        this.mercCnm = mercCnm;
    }

    public String getCrpNm() {
        return crpNm;
    }

    public void setCrpNm(String crpNm) {
        this.crpNm = crpNm;
    }

    public String getCrpIdNo() {
        return crpIdNo;
    }

    public void setCrpIdNo(String crpIdNo) {
        this.crpIdNo = crpIdNo;
    }

    public String getClrAcTyp() {
        return clrAcTyp;
    }

    public void setClrAcTyp(String clrAcTyp) {
        this.clrAcTyp = clrAcTyp;
    }

    public String getClrAc() {
        return clrAc;
    }

    public void setClrAc(String clrAc) {
        this.clrAc = clrAc;
    }

    public String getCreDt() {
        return creDt;
    }

    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }

    @Override
    public String toString() {
        return "Urmtminf{" +
                "recId='" + recId + '\'' +
                ", mercId='" + mercId + '\'' +
                ", mercSts='" + mercSts + '\'' +
                ", mercType='" + mercType + '\'' +
                ", agtMercId='" + agtMercId + '\'' +
                ", mercAbbr='" + mercAbbr + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updDt='" + updDt + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", clrFlg='" + clrFlg + '\'' +
                ", regType='" + regType + '\'' +
                ", regId='" + regId + '\'' +
                ", mercCnm='" + mercCnm + '\'' +
                ", crpNm='" + crpNm + '\'' +
                ", crpIdNo='" + crpIdNo + '\'' +
                ", clrAcTyp='" + clrAcTyp + '\'' +
                ", clrAc='" + clrAc + '\'' +
                ", creDt='" + creDt + '\'' +
                ", lastUpTime='" + lastUpTime + '\'' +
                ", mangoCreateTime='" + mangoCreateTime + '\'' +
                '}';
    }
}
