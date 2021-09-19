package drugi;

public class Plasman {

	private int godina, redniBrojUtrke, plasman;
	private String vozac;
	public Plasman(int godina, int rBrojUtrke, String vozac, int plasman) {
		this.setGodina(godina);
		this.setRedniBrojUtrke(rBrojUtrke);
		this.setVozac(vozac);
		this.setPlasman(plasman);
	}
	
	public int getGodina() {
		return godina;
	}
	
	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	public int getRedniBrojUtrke() {
		return redniBrojUtrke;
	}
	public void setRedniBrojUtrke(int rbu) {
		this.redniBrojUtrke = rbu;
	}
	public String getVozac() {
		return this.vozac;
	}
	public void setVozac(String v) {
		this.vozac = v;
	}
	public int getPlasman() {
		return plasman;
	}
	public void setPlasman(int p) {
		this.plasman = p;
	}
}
