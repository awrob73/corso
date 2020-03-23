package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AllievoQuiz {
	
    private int id;
    
	private Allievo a;
	
	private Quiz q;
	
	private Date dataReport;
	
	

	public AllievoQuiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public AllievoQuiz(int id, Allievo a, Quiz q, Date dataReport) {
		super();
		this.id = id;
		this.a = a;
		this.q = q;
		this.dataReport = dataReport;
	}


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
	
	private String formattaDataReport() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataReport);
	}

	public void setDataReport(Date dataReport) {
		this.dataReport = dataReport;
	}

	@Override
	public String toString() {
		return "AllievoQuiz [id=" + id + ", a=" + a + ", q=" + q + ", dataReport=" + formattaDataReport() + "]";
	}
	
}
