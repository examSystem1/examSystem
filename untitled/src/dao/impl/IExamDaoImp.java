package dao.impl;

import dao.BaseDAO;
import dao.IExamDao;
import model.Exam;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class IExamDaoImp extends BaseDAO implements IExamDao {
    public boolean addExam(Exam exam) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.saveOrUpdate(exam);
            ts.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
