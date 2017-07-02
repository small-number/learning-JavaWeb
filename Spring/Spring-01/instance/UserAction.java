package cn.itcast.instance;

public class UserAction {

    private UserService userService;
    
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute() {
        // TODO Auto-generated method stub
        userService.save();
        return null;
    }
}
