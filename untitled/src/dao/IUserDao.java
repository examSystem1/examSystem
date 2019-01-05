package dao;

import dao.BaseDAO;
import model.User;

public interface IUserDao {
    public User validate(String username, String password);
    public boolean saveUser(User user);
}
