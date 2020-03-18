package dao;

import java.util.List;

import entity.AllievoQuiz;

public interface AllievoQuizDAO {
 public AllievoQuiz select(int id) throws Exception;
 public List<AllievoQuiz> selectAll() throws Exception;
 public List<AllievoQuiz> selectAllbyAllievo(int id) throws Exception;
 public void Insert(AllievoQuiz aq) throws Exception;
 public void update(AllievoQuiz aq) throws Exception;
 public void delete(AllievoQuiz aq) throws Exception;
 
}
