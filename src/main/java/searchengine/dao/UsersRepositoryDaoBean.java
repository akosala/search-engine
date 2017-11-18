package searchengine.dao;

import searchengine.domain.User;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {


    @Override
    public User addUser(User user) {
        UsersRepository.getRepository().add(user);
        return null;
    }

    @Override
    public User getUserById(int id) {
        List<User> userList = UsersRepository.getRepository();
        for(User user: userList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByLogin(String login) {

        List<User> userList = UsersRepository.getRepository();
        for(User user: userList){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsersList() {
        return UsersRepository.getRepository();
    }
}
