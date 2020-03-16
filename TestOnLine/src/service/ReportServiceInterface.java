package service;

import java.util.List;

import entity.Report;

public interface ReportServiceInterface {

	public void createReport(Report r) throws Exception;
	
	public List<Report> readReport(String username) throws Exception;
	
	public List<Report> readAllReport() throws Exception;
	
	public Report readReport(int id) throws Exception;
	
	
}
