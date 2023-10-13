package Sem7.MVI.model;

import Sem7.MVI.model.Intent;

/**
 * TaskCompletedIntent - намерение отметить задачу как завершенную.
 */
public class TaskCompletedIntent implements Intent {
    int taskId;

    public TaskCompletedIntent(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }
}
