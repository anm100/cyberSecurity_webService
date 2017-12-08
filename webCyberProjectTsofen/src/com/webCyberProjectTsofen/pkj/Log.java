package com.webCyberProjectTsofen.pkj;

public class Log {
	
	private String iPAdress;
    private String macAdress;
    private String status;
    private String updateTime;
    private String path;
	
    
    
    
    
    
    public Log(String iPAdress, String macAdress, String status, String updateTime, String path) {
		super();
		this.iPAdress = iPAdress;
		this.macAdress = macAdress;
		this.status = status;
		this.updateTime = updateTime;
		this.path = path;
	}
    
    
	public String getiPAdress() {
		return iPAdress;
	}
	public void setiPAdress(String iPAdress) {
		this.iPAdress = iPAdress;
	}
	public String getMacAdress() {
		return macAdress;
	}
	public void setMacAdress(String macAdress) {
		this.macAdress = macAdress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
    
    
    
    
    

}
