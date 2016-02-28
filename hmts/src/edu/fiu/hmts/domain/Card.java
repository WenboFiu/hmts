package edu.fiu.hmts.domain;

import java.util.Date;

public class Card extends CardKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.card_num
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private String cardNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.card_owner
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private String cardOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.bill_address
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private String billAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.exp_date
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private Date expDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.sec_code
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private String secCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card.bs_consistency
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    private Integer bsConsistency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.card_num
     *
     * @return the value of card.card_num
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.card_num
     *
     * @param cardNum the value for card.card_num
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.card_owner
     *
     * @return the value of card.card_owner
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public String getCardOwner() {
        return cardOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.card_owner
     *
     * @param cardOwner the value for card.card_owner
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner == null ? null : cardOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.bill_address
     *
     * @return the value of card.bill_address
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public String getBillAddress() {
        return billAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.bill_address
     *
     * @param billAddress the value for card.bill_address
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress == null ? null : billAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.exp_date
     *
     * @return the value of card.exp_date
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public Date getExpDate() {
        return expDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.exp_date
     *
     * @param expDate the value for card.exp_date
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.sec_code
     *
     * @return the value of card.sec_code
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public String getSecCode() {
        return secCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.sec_code
     *
     * @param secCode the value for card.sec_code
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setSecCode(String secCode) {
        this.secCode = secCode == null ? null : secCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card.bs_consistency
     *
     * @return the value of card.bs_consistency
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public Integer getBsConsistency() {
        return bsConsistency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card.bs_consistency
     *
     * @param bsConsistency the value for card.bs_consistency
     *
     * @mbggenerated Sun Feb 28 17:00:29 EST 2016
     */
    public void setBsConsistency(Integer bsConsistency) {
        this.bsConsistency = bsConsistency;
    }
}