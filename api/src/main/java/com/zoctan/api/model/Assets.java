package com.zoctan.api.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @data 2019-5-17
 * @Author:xiaobai
 */
public class Assets {
    /**
     * 资产id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;

    private String name;
    private String type;
    private String model;
    private String serialNumber;
    private String hall;
    private String department;
    private String cabinet;
    private Timestamp shelfTime;
    private String networkArea;
    private String cpu;
    private String memory;
    private String ip;
    private String operatingSystem;
    private String middleWare;
    private String dataBase;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getHall() {
        return hall;
    }

    public String getDepartment() {
        return department;
    }

    public String getCabinet() {
        return cabinet;
    }

    public Timestamp getShelfTime() {
        return shelfTime;
    }

    public String getNetworkArea() {
        return networkArea;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getIp() {
        return ip;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMiddleWare() {
        return middleWare;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public void setShelfTime(Timestamp shelfTime) {
        this.shelfTime = shelfTime;
    }

    public void setNetworkArea(String networkArea) {
        networkArea = networkArea;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setMiddleWare(String middleWare) {
        this.middleWare = middleWare;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
}
