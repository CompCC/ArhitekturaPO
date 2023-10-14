package Sem8.MVPVM.viewModel;

import Sem8.MVPVM.model.Task;

public class TaskViewModel {
    private String displayName;

    public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
    }

    public String getDisplayName() {
        return displayName;
    }
}
