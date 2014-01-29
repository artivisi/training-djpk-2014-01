package id.go.kemenkeu.djpk.usermanagement.service;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DaoTes1 {
	@Autowired
	private SessionFactory sessionFactory;
	private DataSource dataSource;

	public List getHoo() {
		return sessionFactory.getCurrentSession().createQuery("from Pemda").list();
	}
	public List getPakeSpring(){
		JdbcTemplate jP = new JdbcTemplate(dataSource);
		String tsql = "SELECT * from tpemda";
		List<Map<String, Object>> l = jP.queryForList(tsql);
		return l;
	}
}
