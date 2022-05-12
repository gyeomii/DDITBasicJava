package chapter11;

import java.util.Objects;

// Value Object: VO
// Data Transfer Object: DTO 
// Lombok: 롬복 - Annotation으로 모든 코드를 자동으로 만들어줌
public class Lprod {
	private int lprodId;
	private String lprodGu;
	private String lprodNm;
	public Lprod(int lprodId, String lprodGu, String lprodNm) {
		this.lprodId = lprodId;
		this.lprodGu = lprodGu;
		this.lprodNm = lprodNm;
	}
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
	public String getLprodNm() {
		return lprodNm;
	}
	public void setLprodNm(String lprodNm) {
		this.lprodNm = lprodNm;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lprodGu, lprodId, lprodNm);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Lprod)) {
			return false;
		}
		Lprod other = (Lprod) obj;
		return Objects.equals(lprodGu, other.lprodGu) && lprodId == other.lprodId
				&& Objects.equals(lprodNm, other.lprodNm);
	}
	@Override
	public String toString() {
		return "Lprod [lprodId=" + lprodId + ", lprodGu=" + lprodGu + ", lprodNm=" + lprodNm + "]";
	}
	
}
