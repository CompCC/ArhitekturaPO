package Sem7.MVPVM.view;

import Sem7.MVPVM.viewModel.TaskViewModel;
import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
