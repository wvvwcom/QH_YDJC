package com.scxd.beans.pojo;

import java.util.Date;

public class SysMenuRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu_role.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu_role.MENU_ID
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu_role.ROLE_ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu_role.CREATETIME
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu_role.CREATER
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu_role.ID
     *
     * @return the value of sys_menu_role.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu_role.ID
     *
     * @param id the value for sys_menu_role.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu_role.MENU_ID
     *
     * @return the value of sys_menu_role.MENU_ID
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu_role.MENU_ID
     *
     * @param menuId the value for sys_menu_role.MENU_ID
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu_role.ROLE_ID
     *
     * @return the value of sys_menu_role.ROLE_ID
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu_role.ROLE_ID
     *
     * @param roleId the value for sys_menu_role.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu_role.CREATETIME
     *
     * @return the value of sys_menu_role.CREATETIME
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu_role.CREATETIME
     *
     * @param createtime the value for sys_menu_role.CREATETIME
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu_role.CREATER
     *
     * @return the value of sys_menu_role.CREATER
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu_role.CREATER
     *
     * @param creater the value for sys_menu_role.CREATER
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}