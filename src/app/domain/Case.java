package app.domain;

import app.util.NumberUtil;

public class Case 
{
	private double id;
	private double age;
	private double bp;
    private double sg;
    private double al;
    private double su;
    private double rbc;
    private double pc;
    private double pcc;
    private double ba;
    private double bgr;
    private double bu;
    private double sc;
    private double sod;
    private double pot;
    private double hemo;
    private double pcv;
    private double wc;
    private double rc;
    private double htm;
    private double dm;
    private double cad;
    private double appet;
    private double pe;
    private double ane;
    private double classification;
    
	public Case() {}
    
    public Case (double id, double age, double bp, double sg, double al, double su, 
    		double rbc, double pc, double pcc, double ba, double bgr, double bu,
		double sc, double sod, double pot, double hemo, double pcv, 
		double wc, double rc, double htm, double dm, double cad,
		double appet, double pe, double ane, double classification) {
		super();
		this.id = id;
		this.age = age;
		this.bp = bp;
		this.sg = sg;
		this.al = al;
		this.su = su;
		this.rbc = rbc;
		this.pc = pc;
		this.pcc = pcc;
		this.ba = ba;
		this.bgr = bgr;
		this.bu = bu;
		this.sc = sc;
		this.sod = sod;
		this.pot = pot;
		this.hemo = hemo;
		this.pcv = pcv;
		this.wc = wc;
		this.rc = rc;
		this.htm = htm;
		this.dm = dm;
		this.cad = cad;
		this.appet = appet;
		this.pe = pe;
		this.ane = ane;
		this.classification = classification;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}




	public double getBp() {
		return bp;
	}




	public void setBp(double bp) {
		this.bp = bp;
	}




	public double getSg() {
		return sg;
	}




	public void setSg(double sg) {
		this.sg = sg;
	}




	public double getAl() {
		return al;
	}




	public void setAl(double al) {
		this.al = al;
	}




	public double getSu() {
		return su;
	}




	public void setSu(double su) {
		this.su = su;
	}




	public double getRbc() {
		return rbc;
	}




	public void setRbc(double rbc) {
		this.rbc = rbc;
	}




	public double getPc() {
		return pc;
	}




	public void setPc(double pc) {
		this.pc = pc;
	}




	public double getPcc() {
		return pcc;
	}




	public void setPcc(double pcc) {
		this.pcc = pcc;
	}




	public double getBa() {
		return ba;
	}




	public void setBa(double ba) {
		this.ba = ba;
	}




	public double getBgr() {
		return bgr;
	}




	public void setBgr(double bgr) {
		this.bgr = bgr;
	}




	public double getBu() {
		return bu;
	}




	public void setBu(double bu) {
		this.bu = bu;
	}




	public double getSc() {
		return sc;
	}




	public void setSc(double sc) {
		this.sc = sc;
	}




	public double getSod() {
		return sod;
	}




	public void setSod(double sod) {
		this.sod = sod;
	}




	public double getPot() {
		return pot;
	}




	public void setPot(double pot) {
		this.pot = pot;
	}




	public double getHemo() {
		return hemo;
	}




	public void setHemo(double hemo) {
		this.hemo = hemo;
	}




	public double getPcv() {
		return pcv;
	}




	public void setPcv(double pcv) {
		this.pcv = pcv;
	}




	public double getWc() {
		return wc;
	}




	public void setWc(double wc) {
		this.wc = wc;
	}




	public double getRc() {
		return rc;
	}




	public void setRc(double rc) {
		this.rc = rc;
	}




	public double getHtm() {
		return htm;
	}




	public void setHtm(double htm) {
		this.htm = htm;
	}




	public double getDm() {
		return dm;
	}




	public void setDm(double dm) {
		this.dm = dm;
	}




	public double getCad() {
		return cad;
	}




	public void setCad(double cad) {
		this.cad = cad;
	}




	public double getAppet() {
		return appet;
	}




	public void setAppet(double appet) {
		this.appet = appet;
	}




	public double getPe() {
		return pe;
	}




	public void setPe(double pe) {
		this.pe = pe;
	}




	public double getAne() {
		return ane;
	}




	public void setAne(double ane) {
		this.ane = ane;
	}




	public double getClassification() {
		return classification;
	}




	public void setClassification(double classification) {
		this.classification = classification;
	}


	@Override
	public String toString() {
		return "Case [id=" + id + ", age=" + age + ", bp=" + bp + ", sg=" + sg + ", al=" + al + ", su=" + su + ", rbc="
				+ rbc + ", pc=" + pc + ", pcc=" + pcc + ", ba=" + ba + ", bgr=" + bgr + ", bu=" + bu + ", sc=" + sc
				+ ", sod=" + sod + ", pot=" + pot + ", hemo=" + hemo + ", pcv=" + pcv + ", wc=" + wc + ", rc=" + rc
				+ ", htm=" + htm + ", dm=" + dm + ", cad=" + cad + ", appet=" + appet + ", pe=" + pe + ", ane=" + ane
				+ ", classification=" + classification + "]";
	}
    
}