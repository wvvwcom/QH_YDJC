package com.scxd.beans.pojo;

import java.util.Date;

public class PdaCashBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PDA_LOG.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PDA_LOG.WYM
     *
     * @mbggenerated
     */
    private String wym;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PDA_LOG.CJSJ
     *
     * @mbggenerated
     */
    private Date cjsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PDA_LOG.LOGINNAME
     *
     * @mbggenerated
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PDA_LOG.INDATA
     *
     * @mbggenerated
     */
    private String indata;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PDA_LOG.ID
     *
     * @return the value of SYS_PDA_LOG.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.ID
     *
     * @param id the value for SYS_PDA_LOG.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PDA_LOG.WYM
     *
     * @return the value of SYS_PDA_LOG.WYM
     *
     * @mbggenerated
     */
    public String getWym() {
        return wym;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.WYM
     *
     * @param wym the value for SYS_PDA_LOG.WYM
     *
     * @mbggenerated
     */
    public void setWym(String wym) {
        this.wym = wym == null ? null : wym.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PDA_LOG.CJSJ
     *
     * @return the value of SYS_PDA_LOG.CJSJ
     *
     * @mbggenerated
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.CJSJ
     *
     * @param cjsj the value for SYS_PDA_LOG.CJSJ
     *
     * @mbggenerated
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PDA_LOG.LOGINNAME
     *
     * @return the value of SYS_PDA_LOG.LOGINNAME
     *
     * @mbggenerated
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.LOGINNAME
     *
     * @param loginname the value for SYS_PDA_LOG.LOGINNAME
     *
     * @mbggenerated
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PDA_LOG.INDATA
     *
     * @return the value of SYS_PDA_LOG.INDATA
     *
     * @mbggenerated
     */
    public String getIndata() {
        return indata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.INDATA
     *
     * @param indata the value for SYS_PDA_LOG.INDATA
     *
     * @mbggenerated
     */
    public void setIndata(String indata) {
        this.indata = indata == null ? null : indata.trim();
    }
}