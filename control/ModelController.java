package TrabalhoBanco.control;

//import java.math.BigInteger;
//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
//import org.model.TotalConsultaPorPaciente;

public class ModelController implements IController {

	private Session session;

	public ModelController() {
		this.session = GeneralController.getSession();
	}
	
	public Session getSession() {
		return session;
	}

	public void insert(Object object) {		
		this.session.beginTransaction();
		this.session.persist(object);
		this.session.getTransaction().commit();
	}

	public void update(Object object) {
		this.session.beginTransaction();
		this.session.merge(object);
		this.session.getTransaction().commit();
	}

	public void delete(Object object) {
		this.session.beginTransaction();
		this.session.delete(object);
		this.session.getTransaction().commit();
	}
	
	public List<?> list(Class<?> iClass) {
		return (List<?>) this.session.createCriteria(iClass).list();
	}

	public Object getByCode(Class<?> iClass, Integer id) {
		return this.session.get(iClass, id);
	}
	
	public void deleteAll() {
		this.session.beginTransaction();
		this.session.createSQLQuery("delete from aluno").executeUpdate();
		this.session.createSQLQuery("delete from autor").executeUpdate();
		this.session.createSQLQuery("delete from autoria").executeUpdate();
		this.session.createSQLQuery("delete from biblioteca").executeUpdate();
		this.session.createSQLQuery("delete from curso").executeUpdate();
		this.session.createSQLQuery("delete from editora").executeUpdate();
		this.session.createSQLQuery("delete from emprestimo").executeUpdate();
		this.session.createSQLQuery("delete from exemplar").executeUpdate();
		this.session.createSQLQuery("delete from historico").executeUpdate();
		this.session.createSQLQuery("delete from livros").executeUpdate();
		this.session.createSQLQuery("delete from materia").executeUpdate();
		this.session.createSQLQuery("delete from universidade").executeUpdate();
		
		this.session.getTransaction().commit();
	}
	
	public void close() {
		this.session.close();
	}
	
	public List<?> query(String sql, Map<String,Integer> parameters,  Class<?> iClass) {
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(iClass);
		Integer value;
		for (String key : parameters.keySet()) {
			value = parameters.get(key);
			query.setParameter(key, value);
		}
		List<?> resultSet = query.list();
		return resultSet;
	}


}