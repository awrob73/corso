package service;

import java.util.List;

import entity.Allievo;
import entity.AllievoQuiz;
import entity.Report;

public interface ReportServiceInterface {

	public void createReport(Report r) throws Exception;
	
	public List<Report> readReport(Allievo a) throws Exception;
	
	public List<Report> readReport(AllievoQuiz aq) throws Exception;
	
	public List<Report> readAllReport() throws Exception;
	
	public Report readReport(int id) throws Exception;
	
	
}
