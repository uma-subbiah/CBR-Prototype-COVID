package app.domain;

import app.util.NumberUtil;

public class CaseAttributeWeight 
{

	private int id;
	private int age;
	private int bp;
    private double sg;
    private int al;
    private int su;
    private int rbc;
    private int pc;
    private int pcc;
    private int ba;
    private int bgr;
    private int bu;
    private double sc;
    private int sod;
    private double pot;
    private double hemo;
    private int pcv;
    private int wc;
    private double rc;
    private int htm;
    private int dm;
    private int cad;
    private int appet;
    private int pe;
    private int ane;
    private int classification;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBp() {
		return bp;
	}

	public void setBp(int bp) {
		this.bp = bp;
	}

	public double getSg() {
		return sg;
	}

	public void setSg(double sg) {
		this.sg = sg;
	}

	public int getAl() {
		return al;
	}

	public void setAl(int al) {
		this.al = al;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getRbc() {
		return rbc;
	}

	public void setRbc(int rbc) {
		this.rbc = rbc;
	}

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public int getPcc() {
		return pcc;
	}

	public void setPcc(int pcc) {
		this.pcc = pcc;
	}

	public int getBa() {
		return ba;
	}

	public void setBa(int ba) {
		this.ba = ba;
	}

	public int getBgr() {
		return bgr;
	}

	public void setBgr(int bgr) {
		this.bgr = bgr;
	}

	public int getBu() {
		return bu;
	}

	public void setBu(int bu) {
		this.bu = bu;
	}

	public double getSc() {
		return sc;
	}

	public void setSc(double sc) {
		this.sc = sc;
	}

	public int getSod() {
		return sod;
	}

	public void setSod(int sod) {
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

	public int getPcv() {
		return pcv;
	}

	public void setPcv(int pcv) {
		this.pcv = pcv;
	}

	public int getWc() {
		return wc;
	}

	public void setWc(int wc) {
		this.wc = wc;
	}

	public double getRc() {
		return rc;
	}

	public void setRc(double rc) {
		this.rc = rc;
	}

	public int getHtm() {
		return htm;
	}

	public void setHtm(int htm) {
		this.htm = htm;
	}

	public int getDm() {
		return dm;
	}

	public void setDm(int dm) {
		this.dm = dm;
	}

	public int getCad() {
		return cad;
	}

	public void setCad(int cad) {
		this.cad = cad;
	}

	public int getAppet() {
		return appet;
	}

	public void setAppet(int appet) {
		this.appet = appet;
	}

	public int getPe() {
		return pe;
	}

	public void setPe(int pe) {
		this.pe = pe;
	}

	public int getAne() {
		return ane;
	}

	public void setAne(int ane) {
		this.ane = ane;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public double getTotal()
    {
        return 
        		getHemo()+
        		getAge()+
        		getAl()+
        		getAne()+
        		getAppet()+
        		getBa()+
        		getBgr()+
        		getBp()+
        		getBu()+
        		getCad()+
        		getDm()
        + getHtm()+
        getId()+
        getPc()+
        getPcc()+
        getPcv()+
        getPe()+
        getPot()+
        getRbc()+
        getRc()+
        getSc()+
        getSg()+
        getSod()
        + getSu()+
        getWc();
    }

	@Override
	public String toString() {
		return "CaseAttributeWeight [id=" + id + ", age=" + age + ", bp=" + bp + ", sg=" + sg + ", al=" + al + ", su="
				+ su + ", rbc=" + rbc + ", pc=" + pc + ", pcc=" + pcc + ", ba=" + ba + ", bgr=" + bgr + ", bu=" + bu
				+ ", sc=" + sc + ", sod=" + sod + ", pot=" + pot + ", hemo=" + hemo + ", pcv=" + pcv + ", wc=" + wc
				+ ", rc=" + rc + ", htm=" + htm + ", dm=" + dm + ", cad=" + cad + ", appet=" + appet + ", pe=" + pe
				+ ", ane=" + ane + ", classification=" + classification + "]";
	}

    
    
}
