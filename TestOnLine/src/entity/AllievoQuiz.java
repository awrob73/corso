package entity;

import java.util.Date;

public class AllievoQuiz {
	
    private int id;
    
	private Allievo a;
	
	private Quiz q;
	
	private Date dataReport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Allievo getA() {
		return a;
	}

	public void setA(Allievo a) {
		this.a = a;
	}

	public Quiz getQ() {
		return q;
	}

	public void setQ(Quiz q) {
		this.q = q;
	}

	public Date getDataReport() {
		return dataReport;
	}

	public void setDataReport(Date dataReport) {
		this.dataReport = dataReport;
	}

	@Override
	public String toString() {
		return "AllievoQuiz [id=" + id + ", a=" + a + ", q=" + q + ", dataReport=" + dataReport + "]";
	}
	
}
