package dao;

import java.util.List;

import entity.Allievo;
import entity.Report;

public interface ReportDAO {
	public Report select(int id) throws Exception;
	public List<Report> selectAll(Allievo a) throws Exception;
	public List<Report> selectAll() throws Exception;
	public void insert(Report r) throws Exception;

}
