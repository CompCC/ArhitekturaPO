package Sem7.MVPVM.viewModel;

import Sem7.MVPVM.model.Task;

public class TaskViewModel {
    private String displayName;

    public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
    }

    public String getDisplayName() {
        return displayName;
    }
}
