package com.scxd.beans.pojo;

import java.util.Date;

public class SysPdaLog {
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
     * This field corresponds to the database column SYS_PDA_LOG.JKID
     *
     * @mbggenerated
     */
    private String jkid;

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
     * This method returns the value of the database column SYS_PDA_LOG.JKID
     *
     * @return the value of SYS_PDA_LOG.JKID
     *
     * @mbggenerated
     */
    public String getJkid() {
        return jkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PDA_LOG.JKID
     *
     * @param jkid the value for SYS_PDA_LOG.JKID
     *
     * @mbggenerated
     */
    public void setJkid(String jkid) {
        this.jkid = jkid == null ? null : jkid.trim();
    }
}