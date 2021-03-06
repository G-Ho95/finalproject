package com.jhta.finalproject.jm.vo;

import java.util.Date;

public class OldAllListVo {
	private int obnum; //중고책번호
	private int snum;  //판매자번호
	private String selleraddr; //출고주소
	private String obname; //책이름
	private String obwriter; //저자
	private String obpublisher; //출판사
	private Date obpdate; //출간일
	private int obstatus; //품질
	private int oborgprice; //정가
	private int obsaleprice;  //판매가
	private String obdetail; //상품설명
	private int obdelfee; //배송료
	private int obsalestatus; //판매상태
	private int obhit; //조회수
	private int scatenum; //작은카테고리번호
	private Date obregdate;//등록일
	private String imgorgfilename;
	private int imgnum;
	private String imgsavefilename;
	private int thumbnail;
	private int btype;
	private int bnum;
	
	public OldAllListVo() {}

	public OldAllListVo(int obnum, int snum, String selleraddr, String obname, String obwriter, String obpublisher,
			Date obpdate, int obstatus, int oborgprice, int obsaleprice, String obdetail, int obdelfee,
			int obsalestatus, int obhit, int scatenum, Date obregdate, String imgorgfilename, int imgnum,
			String imgsavefilename, int thumbnail, int btype, int bnum) {
		super();
		this.obnum = obnum;
		this.snum = snum;
		this.selleraddr = selleraddr;
		this.obname = obname;
		this.obwriter = obwriter;
		this.obpublisher = obpublisher;
		this.obpdate = obpdate;
		this.obstatus = obstatus;
		this.oborgprice = oborgprice;
		this.obsaleprice = obsaleprice;
		this.obdetail = obdetail;
		this.obdelfee = obdelfee;
		this.obsalestatus = obsalestatus;
		this.obhit = obhit;
		this.scatenum = scatenum;
		this.obregdate = obregdate;
		this.imgorgfilename = imgorgfilename;
		this.imgnum = imgnum;
		this.imgsavefilename = imgsavefilename;
		this.thumbnail = thumbnail;
		this.btype = btype;
		this.bnum = bnum;
	}

	public int getObnum() {
		return obnum;
	}

	public void setObnum(int obnum) {
		this.obnum = obnum;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getSelleraddr() {
		return selleraddr;
	}

	public void setSelleraddr(String selleraddr) {
		this.selleraddr = selleraddr;
	}

	public String getObname() {
		return obname;
	}

	public void setObname(String obname) {
		this.obname = obname;
	}

	public String getObwriter() {
		return obwriter;
	}

	public void setObwriter(String obwriter) {
		this.obwriter = obwriter;
	}

	public String getObpublisher() {
		return obpublisher;
	}

	public void setObpublisher(String obpublisher) {
		this.obpublisher = obpublisher;
	}

	public Date getObpdate() {
		return obpdate;
	}

	public void setObpdate(Date obpdate) {
		this.obpdate = obpdate;
	}

	public int getObstatus() {
		return obstatus;
	}

	public void setObstatus(int obstatus) {
		this.obstatus = obstatus;
	}

	public int getOborgprice() {
		return oborgprice;
	}

	public void setOborgprice(int oborgprice) {
		this.oborgprice = oborgprice;
	}

	public int getObsaleprice() {
		return obsaleprice;
	}

	public void setObsaleprice(int obsaleprice) {
		this.obsaleprice = obsaleprice;
	}

	public String getObdetail() {
		return obdetail;
	}

	public void setObdetail(String obdetail) {
		this.obdetail = obdetail;
	}

	public int getObdelfee() {
		return obdelfee;
	}

	public void setObdelfee(int obdelfee) {
		this.obdelfee = obdelfee;
	}

	public int getObsalestatus() {
		return obsalestatus;
	}

	public void setObsalestatus(int obsalestatus) {
		this.obsalestatus = obsalestatus;
	}

	public int getObhit() {
		return obhit;
	}

	public void setObhit(int obhit) {
		this.obhit = obhit;
	}

	public int getScatenum() {
		return scatenum;
	}

	public void setScatenum(int scatenum) {
		this.scatenum = scatenum;
	}

	public Date getObregdate() {
		return obregdate;
	}

	public void setObregdate(Date obregdate) {
		this.obregdate = obregdate;
	}

	public String getImgorgfilename() {
		return imgorgfilename;
	}

	public void setImgorgfilename(String imgorgfilename) {
		this.imgorgfilename = imgorgfilename;
	}

	public int getImgnum() {
		return imgnum;
	}

	public void setImgnum(int imgnum) {
		this.imgnum = imgnum;
	}

	public String getImgsavefilename() {
		return imgsavefilename;
	}

	public void setImgsavefilename(String imgsavefilename) {
		this.imgsavefilename = imgsavefilename;
	}

	public int getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(int thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getBtype() {
		return btype;
	}

	public void setBtype(int btype) {
		this.btype = btype;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
}
