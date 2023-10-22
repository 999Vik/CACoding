package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    private SignupViewModel signupViewModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, SignupViewModel signupViewModel,
                          ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData user) {
        clearViewModel.getState().setUsers(user.getUsers());

        clearViewModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        clearViewModel.firePropertyChanged();
    }
}
