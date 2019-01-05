package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDAO {
	@Qualifier("sessionFactory")
    @Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}

	public Session getSession(){
		Session session=sessionFactory.openSession();
		return session;
	}
}
