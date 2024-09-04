package LeThiThuyAn_23682411;

public class HinhChuNhat {
	// Khai bao cac thuoc tinh:
	private double chieuDai;
	private double chieuRong;
	
	// Dong goi:
	public double getChieuDai() {
		return chieuDai;
	}
	
	//	rang buoc
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi d");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieuRong = r;
		}
	}
	// constructor
	public HinhChuNhat() {}
	public HinhChuNhat (double d, double r) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi d");
		}
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieuRong = r;
		}
	}
	
	
	// phuong thuc
	public double getCV() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDT() {
		return getChieuDai()*getChieuRong();
	}
	// tao mau toString
	@Override
	public String toString() {
		String s="";
		s=s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieuRong(), getCV(), getDT());
		
		return s;
	}
}

	
	


