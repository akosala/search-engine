package searchengine.dao;

import searchengine.domain.User;

import java.util.List;

public interface UsersRepositoryDao {
   public User addUser(User user);
   public User getUserById(int id);
   public User getUserByLogin(String login);
   public List<User> getUsersList();
}
