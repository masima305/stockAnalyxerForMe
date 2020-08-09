package com.myfinance.sprapp.stoka.crawlSetting.vo;

// 주식 기본정보 VO
public class StockInfoVO {
	private String stokId		;		/*	주식 고유번호		*/
	private String stokNm		;		/*	주식 이름			*/
	private String stokRegdDt	;		/*	주식 입력일자		*/
	private String stokUpdt		;		/*	주식정보 업데이트 일자	*/
	public String getStokId() {
		return stokId;
	}
	public void setStokId(String stokId) {
		this.stokId = stokId;
	}
	public String getStokNm() {
		return stokNm;
	}
	public void setStokNm(String stokNm) {
		this.stokNm = stokNm;
	}
	public String getStokRegdDt() {
		return stokRegdDt;
	}
	public void setStokRegdDt(String stokRegdDt) {
		this.stokRegdDt = stokRegdDt;
	}
	public String getStokUpdt() {
		return stokUpdt;
	}
	public void setStokUpdt(String stokUpdt) {
		this.stokUpdt = stokUpdt;
	}


	@Override
	public String toString() {
		return "StockInfoVO [stokId=" + stokId + ", stokNm=" + stokNm + ", stokRegdDt=" + stokRegdDt + ", stokUpdt="
				+ stokUpdt + "]";
	}




}
