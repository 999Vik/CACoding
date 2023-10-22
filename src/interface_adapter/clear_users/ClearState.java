package interface_adapter.clear_users;

import java.util.List;

public class ClearState {
    private List<String> users;
    public ClearState(ClearState copy) {
    }
    public ClearState() {

    }
    public List<String> getUsers() {
        return users;
    }
    public void setUsers(List<String> users) {
        this.users = users;
    }
}
