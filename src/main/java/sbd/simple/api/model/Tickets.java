package sbd.simple.api.model;

import sbd.simple.api.util.JasonData;

public class Tickets {
    private String validateMessagesShowId;
    private Boolean status;
    private Integer httpstatus;

    private Data data = new Data();

    private JasonData jsonData = new JasonData();

    public String getValidateMessagesShowId() {
        this.validateMessagesShowId = this.jsonData.getData().getString("validateMessagesShowId");
        return this.validateMessagesShowId;
    }

    public void setValidateMessagesShowId(String validateMessagesShowId) {
        this.validateMessagesShowId = validateMessagesShowId;
    }

    public Boolean getStatus() {
        this.status = this.jsonData.getData().getBoolean("status");
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getHttpstatus() {
        this.httpstatus =  this.jsonData.getData().getInt("httpstatus");
        return this.httpstatus;
    }

    public void setHttpstatus(Integer httpstatus) {
        this.httpstatus = httpstatus;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
