package Sem8.MVPVM.pesenter;

import Sem8.MVPVM.model.Task;
import Sem8.MVPVM.view.TaskView;
import Sem8.MVPVM.viewModel.TaskViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskPresenter {
    private List<Task> tasks = new ArrayList<>();
    private TaskView view;

    public TaskPresenter(TaskView view) {
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void displayTasks() {
        List<TaskViewModel> taskViewModels = tasks.stream()
                .map(TaskViewModel::new)
                .collect(Collectors.toList());
        view.showTasks(taskViewModels);
    }

    public void completeTask(int index) {
        tasks.get(index).complete();
        displayTasks();
    }
}
