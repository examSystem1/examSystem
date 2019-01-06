package dao.impl;

import dao.BaseDAO;
import dao.ITopicDao;
import model.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ITopicDaoImp extends BaseDAO implements ITopicDao {
    public boolean addTopic(Topic topic) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.saveOrUpdate(topic);
            ts.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
