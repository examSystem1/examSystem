package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.IUserDao;
import model.User;

import java.util.Map;

public class LoginAction extends ActionSupport {
    ActionContext context;
    private User user;
    private IUserDao iUserDao;

    public IUserDao getiUserDao() {
        return iUserDao;
    }

    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    public String execute() throws Exception{
        String uno=user.getUno();
        String pwd=user.getPassword();
        boolean validated=false;
        //ApplicationContext sp_context=new FileSystemXmlApplicationContext("file:E:/study/Java EE/webtrst/ssh1/untitled/src/applicationContext.xml");//改
        context=ActionContext.getContext();
        Map session=context.getSession();
        User user1=null;
        user1=(User)session.get("user");
        if(user1==null){
            user1 = iUserDao.validate(uno,pwd);
            if(user1!=null){
                session.put("user", user1);
                validated=true;
            }
        }
        else{
            validated=true;
        }
        if(validated)
        {
            //验证成功返回字符串"success"
            return "success";
        }
        else{
            //验证失败返回字符串"error"
            return "error";
        }

    }
    public String register() {
//        User u = new User(user.getUno(), user.getName(), user.getPassword(), user.getRole());
//        User user1 = null;
//        user1 = IUserDao.saveUser(u);
//        if(user1 != null) {
//            context=ActionContext.getContext();
//            Map session = context.getSession();
//            session.clear();
//            session.put("user",user1);
//            return SUCCESS;
//        }
        return ERROR;
    }


    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }

}
