package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ITopicDao;
import model.Topic;

public class ITopicAction extends ActionSupport {
    private ITopicDao iTopicDao;
    private Topic topic;
    private String cno;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public ITopicDao getiTopicDao() {
        return iTopicDao;
    }

    public void setiTopicDao(ITopicDao iTopicDao) {
        this.iTopicDao = iTopicDao;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String addTopic() {
        topic.setCno("1");
        // System.out.println("saveExam:" + cno);
        if(iTopicDao.addTopic(topic)) {
            return SUCCESS;
        }
        return ERROR;
    }

}
