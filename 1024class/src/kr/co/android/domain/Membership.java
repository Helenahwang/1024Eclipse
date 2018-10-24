package kr.co.android.domain;

public class Membership {
	
	private String logid;
	private String logpw;
	private String lognick;
	
	public String getLogid() {
		return logid;
	}
	public void setLogid(String logid) {
		this.logid = logid;
	}
	public String getLogpw() {
		return logpw;
	}
	public void setLogpw(String logpw) {
		this.logpw = logpw;
	}
	public String getLognick() {
		return lognick;
	}
	public void setLognick(String lognick) {
		this.lognick = lognick;
	}
	
	@Override
	public String toString() {
		return "Membership [logid=" + logid + ", logpw=" + logpw + ", lognick=" + lognick + "]";
	}


}
