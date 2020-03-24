package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Domanda;
import entity.Risposta;

public class RispostaDAOImpl implements RispostaDAO {

	private static RispostaDAOImpl instance;

	public static RispostaDAOImpl getInstance() throws Exception {
		if (instance == null)
			instance = new RispostaDAOImpl();
		return instance;
	}

	private RispostaDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Risposta> select(Connection conn, Domanda d) throws Exception {
		String sql = "select risposta.* from risposta join domanda on risposta.id_domanda=domanda.id where domanda.id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, d.getId());

		ResultSet rs = ps.executeQuery();

		List<Risposta> lista = new ArrayList<>();

		while (rs.next()) {

			Risposta r = new Risposta();

			int id = rs.getInt("id");
			// Argomento arg = new Argomento(rs.getInt("id"),rs.getString("descrizione"));
			// Quiz q = new Quiz(rs.getInt("id"), arg, rs.getString("difficolta"));
			// d = new Domanda(rs.getInt("id"),rs.getString("descrizione"),
			// rs.getString("quesito"), rs.getInt("numero_domanda"));
			String descrizione = rs.getString("descrizione");
			int valutazione = rs.getInt("valutazione");

			r.setId(id);
			r.setDomanda(d);
			r.setDescrizione(descrizione);
			r.setValutazione(valutazione);

			lista.add(r);
		}

		return lista;

	}

	@Override
	public Risposta select(Connection conn, int id) throws Exception {
		String sql = "select * from risposta where id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		Risposta r = new Risposta();

		if (rs.next()) {

			id = rs.getInt("id");
			// Argomento arg = new Argomento(rs.getInt("id"),rs.getString("descrizione"));
			// Quiz q = new Quiz(rs.getInt("id"), arg, rs.getString("difficolta"));
			// d = new Domanda(rs.getInt("id"),rs.getString("descrizione"),
			// rs.getString("quesito"), rs.getInt("numero_domanda"));
			String descrizione = rs.getString("descrizione");
			int valutazione = rs.getInt("valutazione");

			r.setId(id);
			r.setDescrizione(descrizione);
			r.setValutazione(valutazione);
		}

		return r;
	}

	@Override
	public void insert(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub

	}

}
