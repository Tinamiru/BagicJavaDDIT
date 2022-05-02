package bagicjavachapter06.GetterAndSetter;

public class DataVO { // ddit 커리큘럼 중, Oracle DB수업 중 실습DB 에서 가져온 LPROD 테이블을 기준으로 작성하였다.
	private int lprodId;
	private String lprodGu;
	private String lprodNM;
// Alt + shift + S = src -> Generate getter and setter
	public int getLprodId() {
		return lprodId;
	}

	public void setLprodId(int lprodId) {
		this.lprodId = lprodId;
	}

	public String getLprodGu() {
		return lprodGu;
	}

	public void setLprodGu(String lprodGu) {
		this.lprodGu = lprodGu;
	}

	public String getLprodNM() {
		return lprodNM;
	}

	public void setLprodNM(String lprodNM) {
		this.lprodNM = lprodNM;
	}

}
