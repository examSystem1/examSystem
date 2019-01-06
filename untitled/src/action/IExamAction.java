package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ICourseDao;
import dao.IExamDao;
import model.Course;
import model.Exam;
import model.User;

import java.util.List;
import java.util.Map;

public class IExamAction extends ActionSupport {
    private Course course;
    private ICourseDao iCourseDao;
    private List list1;
    private Exam exam;
    private String cno;
    private IExamDao iExamDao;
    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public IExamDao getiExamDao() {
        return iExamDao;
    }

    public void setiExamDao(IExamDao iExamDao) {
        this.iExamDao = iExamDao;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List getList1() {
        return list1;
    }

    public void setList1(List list1) {
        this.list1 = list1;
    }

    public ICourseDao getiCourseDao() {
        return iCourseDao;
    }

    public void setiCourseDao(ICourseDao iCourseDao) {
        this.iCourseDao = iCourseDao;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public String showExam() throws Exception {
        Map session= ActionContext.getContext().getSession();
        User user = (User)session.get("user");
        list1 = iCourseDao.findAllCourse(user.getUno());
        //list1.get(0);
        return SUCCESS;
    }
    public String addExam() throws Exception {
        Map session= ActionContext.getContext().getSession();
        User user = (User)session.get("user");
        exam.setUno(user.getUno());
        exam.setCno(cno);
       // System.out.println("saveExam:" + cno);
        if(iExamDao.addExam(exam)) {
            return SUCCESS;
        }
        return ERROR;
    }
}
