package Sem7.MVI.view;

public class ConsoleView implements BaseView{
    @Override
    public void  render(ViewState state) {
        if (state instanceof TasksViewState) {
            TasksViewState tasksState = (TasksViewState) state;
            System.out.println(tasksState);
        } else {
            System.out.println("Неизвестное состояние.");
        }
    }
}
