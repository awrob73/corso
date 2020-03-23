package dao;

import java.sql.Connection;
import java.util.List;

import entity.Allievo;
import entity.AllievoQuiz;
import entity.Domanda;
import entity.Report;

public interface ReportDAO {
	public Report select(Connection conn, int id) throws Exception;
	public List<Report> selectAll(Connection conn, AllievoQuiz aq) throws Exception;
	public List<Report> selectAll(Connection conn) throws Exception;
	public void insert(Connection conn, Report r) throws Exception;
	public void delete(Connection conn, Report r) throws Exception;
	public void update(Connection conn, Report r) throws Exception;
}
