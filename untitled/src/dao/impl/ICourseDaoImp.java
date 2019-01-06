package dao.impl;

import dao.BaseDAO;
import dao.ICourseDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ICourseDaoImp extends BaseDAO implements ICourseDao {

    public List findAllCourse(String Uno) {
        Query query;
        Session session=getSession();
        Transaction ts=session.beginTransaction();
        String hql = "select c.cno,c.cname from Course c,Couchoose ch where c.cno=ch.cno and ch.uno= '" + Uno + "'";
        query = session.createQuery(hql);
        List list = query.list();
        return list;
    }
}
