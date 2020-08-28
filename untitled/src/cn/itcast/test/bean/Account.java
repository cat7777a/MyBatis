package cn.itcast.test.bean;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/27/2020
 */

public class Account {
    String accountName;
    String accountPrice;
    String accountType;
    String accountDate;

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountPrice='" + accountPrice + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountDate='" + accountDate + '\'' +
                '}';
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountPrice(String accountPrice) {
        this.accountPrice = accountPrice;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPrice() {
        return accountPrice;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountDate() {
        return accountDate;
    }
}
