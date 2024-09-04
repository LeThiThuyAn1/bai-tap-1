package LeThiThuyAn_23682411;

public class HinhTron {
	private double banKinh;
	private Tam t;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) {
		if (t!=null) {
			this.t = t;
		}
		throw new Exception("Loi");
	}
	//Hang thuc
	public static final double 	PI=3.1416;
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception{
		if (bk>0) {
			this.banKinh = bk;
		}else {
			throw new Exception("Loi");
		}
	}
	//Tao ham
	
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		this.banKinh = banKinh;
		this.t = t;
	}
	//Tinh dien tich va chu vi 
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	//Mau in
	@Override
	public String toString() {
		String m="";
		m+=m.format("%-3s, %10s, %10s", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
	


}
