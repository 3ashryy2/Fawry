package software.fawry_services.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class UserController {

    ArrayList<User> users;

    public UserController() {
        this.users=new ArrayList<>();
    }
    public User searchUser(String username,String password)
    {


        for(User tmp:users)
        {
            if(tmp.getUsername() == username&&tmp.getPassword()==password)
                return tmp;
        }
        return null;
    }
    public User searchUser(String username)
    {
        for(User tmp:users)
        {
            if(tmp.getUsername() == username)
                return tmp;
        }
        return null;
    }
    public int searchUserindex(String username)
    {
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).getUsername() == username)
                return i;
        }
        return -1;
    }
    public User Login(String username,String password)
    {
        return searchUser(username,password);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public boolean addUser(String email,String username,String password){
        if (searchUserindex(username)==-1)
        {
            User tmp=new User(email,username,password);
            users.add(tmp);
            return true;
        }
        else return false;

    }
}
