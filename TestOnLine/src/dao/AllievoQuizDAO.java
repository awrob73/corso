package dao;

import java.sql.Connection;
import java.util.List;

import entity.AllievoQuiz;

public interface AllievoQuizDAO {
 public AllievoQuiz select(Connection conn,int id) throws Exception;
 public List<AllievoQuiz> select(Connection conn,String username) throws Exception;
 public List<AllievoQuiz> selectAll(Connection conn) throws Exception;
 public List<AllievoQuiz> selectAllbyAllievo(Connection conn, int id) throws Exception;
 public void Insert(Connection conn, AllievoQuiz aq) throws Exception;
 public void update(Connection conn, AllievoQuiz aq) throws Exception;
 public void delete(Connection conn, AllievoQuiz aq) throws Exception;
 public void delete(Connection conn, String username) throws Exception;

 
 
}
