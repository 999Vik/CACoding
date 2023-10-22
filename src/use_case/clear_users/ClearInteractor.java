package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }


    @Override
    public void execute(ClearInputData inputData) {
        List<String> users = userDataAccessObject.clear();

        ClearOutputData outputData = new ClearOutputData(users);
        userPresenter.prepareSuccessView(outputData);
    }
}
