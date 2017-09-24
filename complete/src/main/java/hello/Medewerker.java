package hello;

import org.springframework.data.annotation.Id;

public class Medewerker {

	@Id private String id;

	private String bsn;
	private String aanHef;
	private String voorLetters;
	private String tusSenVoegSel;
	private String voorNaam;
	private String achterNaam;
	private String geboorteDatum;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBsn() {
		return bsn;
	}

	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

	public String getAanHef() {
		return aanHef;
	}

	public void setAanHef(String aanHef) {
		this.aanHef = aanHef;
	}

	public String getVoorLetters() {
		return voorLetters;
	}

	public void setVoorLetters(String voorLetters) {
		this.voorLetters = voorLetters;
	}

	public String getTusSenVoegSel() {
		return tusSenVoegSel;
	}

	public void setTusSenVoegSel(String tusSenVoegSel) {
		this.tusSenVoegSel = tusSenVoegSel;
	}

	public String getVoorNaam() {
		return voorNaam;
	}

	public void setVoorNaam(String voorNaam) {
		this.voorNaam = voorNaam;
	}

	public String getAchterNaam() {
		return achterNaam;
	}

	public void setAchterNaam(String achterNaam) {
		this.achterNaam = achterNaam;
	}

	public String getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboorteDatum(String geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
}
