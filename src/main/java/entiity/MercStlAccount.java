package entiity;

public class MercStlAccount {
    private static final long serialVersionUID = 1L;

    /*商户号*/

    private String mercId;

    /*结算账户名称*/

    private String accountName;


    /*结算账户账户号*/

    private String accountNo;

    /*结算账户性质 11,12,13 为个人账户；21,22,23,24为单位账户*/

    private String accountType;

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "MercStlAccount{" +
                "mercId='" + mercId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
