package duke.task;

import duke.command.CommandType;

public abstract class Task {
    private final String description;
    private final char symbol;
    private boolean isDone;

    protected Task(String description, char symbol) {
        this.description = description;
        this.symbol = symbol;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return String.format("[%c][%s] %s", this.symbol, this.isDone ? "✔" : " ", this.description);
    }

    public String toSaveString() {
        return String.format("%c | %d | %s", this.symbol, this.isDone ? 1 : 0, this.description);
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public static Task of(CommandType command, String[] args) {
        switch (command) {
        case TODO:
            return new TodoTask(args);
        case DEADLINE:
            return new DeadlineTask(args);
        case EVENT:
            return new EventTask(args);
        default:
            return null;
        }
    }
}
