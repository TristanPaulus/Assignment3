package com.cput.tristan;

/**
 * Created by Tristan on 2017/03/26.
 */
public class Subject {

    private String subName;
    private String subCode;
    private double credit;

    Subject()
    {

    }

    Subject(String subName, String subCode, double credit)
    {
        this.subName = subName;
        this.subCode = subCode;
        this.credit = credit;
    }

    public String getSubName() {
        return subName;
    }

    public String getSubCode() {
        return subCode;
    }

    public double getCredit() {
        return credit;
    }
}
