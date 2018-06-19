package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class NFSupportBean implements Serializable{

    /**
     * 系统编号
     */
    private int SystemId;

    /**
     * 系统名称
     * 例如新专属,小水,流程等
     */
    private String SystemName;

    /**
     * 模块编号
     */
    private int ModuleId;

    /**
     * 模块名称
     */
    private String ModuleName;

    /**
     * 问题编号
     */
    private int QuestionId;

    /**
     * 问题标题
     */
    private String QuestionTitle;

    /**
     * 问题回复
     */
    private String Reply;

    /**
     * 问题创建人
     */
    private String Creator;

    /**
     * 问题修改人
     */
    private String Modifer;

    /**
     * 问题创建时间
     */
    private Date CreateDate;

    /**
     * 问题修改时间
     */
    private Date ModifyDate;

    /**
     * 问题搜索次数
     */
    private int SearchCount;

    /**
     * 其他
     */
    private String Remark;


    public int getSystemId() {
        return SystemId;
    }

    public void setSystemId(int systemId) {
        SystemId = systemId;
    }

    public String getSystemName() {
        return SystemName;
    }

    public void setSystemName(String systemName) {
        SystemName = systemName;
    }

    public int getModuleId() {
        return ModuleId;
    }

    public void setModuleId(int moduleId) {
        ModuleId = moduleId;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public String getQuestionTitle() {
        return QuestionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        QuestionTitle = questionTitle;
    }

    public String getReply() {
        return Reply;
    }

    public void setReply(String reply) {
        Reply = reply;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public String getModifer() {
        return Modifer;
    }

    public void setModifer(String modifer) {
        Modifer = modifer;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Date getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        ModifyDate = modifyDate;
    }

    public int getSearchCount() {
        return SearchCount;
    }

    public void setSearchCount(int searchCount) {
        SearchCount = searchCount;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "NFSupportBean{" +
                "SystemId=" + SystemId +
                ", SystemName='" + SystemName + '\'' +
                ", ModuleId=" + ModuleId +
                ", ModuleName='" + ModuleName + '\'' +
                ", QuestionId=" + QuestionId +
                ", QuestionTitle='" + QuestionTitle + '\'' +
                ", Reply='" + Reply + '\'' +
                ", Creator='" + Creator + '\'' +
                ", Modifer='" + Modifer + '\'' +
                ", CreateDate=" + CreateDate +
                ", ModifyDate=" + ModifyDate +
                ", SearchCount=" + SearchCount +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
