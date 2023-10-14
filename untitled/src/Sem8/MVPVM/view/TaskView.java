package Sem8.MVPVM.view;

import Sem8.MVPVM.viewModel.TaskViewModel;
import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
