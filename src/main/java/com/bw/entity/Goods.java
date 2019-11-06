package com.bw.entity;

public class Goods {
	
	private Integer gid;
	private String gname;
	private String gname2;
	private Integer gsize;
	private Integer gmoney;
	private Integer gcount;
	private String gbq;
	private String gpic;
	private String bname;
	private String kname;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGname2() {
		return gname2;
	}
	public void setGname2(String gname2) {
		this.gname2 = gname2;
	}
	public Integer getGsize() {
		return gsize;
	}
	public void setGsize(Integer gsize) {
		this.gsize = gsize;
	}
	public Integer getGmoney() {
		return gmoney;
	}
	public void setGmoney(Integer gmoney) {
		this.gmoney = gmoney;
	}
	public Integer getGcount() {
		return gcount;
	}
	public void setGcount(Integer gcount) {
		this.gcount = gcount;
	}
	public String getGbq() {
		return gbq;
	}
	public void setGbq(String gbq) {
		this.gbq = gbq;
	}
	public String getGpic() {
		return gpic;
	}
	public void setGpic(String gpic) {
		this.gpic = gpic;
	}
	public Goods(Integer gid, String gname, String gname2, Integer gsize, Integer gmoney, Integer gcount, String gbq,
			String gpic) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gname2 = gname2;
		this.gsize = gsize;
		this.gmoney = gmoney;
		this.gcount = gcount;
		this.gbq = gbq;
		this.gpic = gpic;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gname2=" + gname2 + ", gsize=" + gsize + ", gmoney="
				+ gmoney + ", gcount=" + gcount + ", gbq=" + gbq + ", gpic=" + gpic + "]";
	}
	
}
