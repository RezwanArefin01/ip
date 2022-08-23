package duke.task;

import java.time.LocalDateTime;

import static duke.util.Parser.DATE_TIME_INPUT_FORMAT;
import static duke.util.Parser.DATE_TIME_OUTPUT_FORMAT;

/**
 * Encapsulates an event.
 */
public class EventTask extends Task {
    private final LocalDateTime time;

    /**
     * Constructs a new {@code EventTask} with given description and time.
     *
     * @param description The description of the event.
     * @param time The time of the event.
     */
    public EventTask(String description, LocalDateTime time) {
        super(TaskSymbolType.E, description);
        this.time = time;
    }

    /**
     * Returns the string representation of this {@code EventTask} for display.
     *
     * @return The string representation of this {@code EventTask} for display.
     */
    @Override
    public String toString() {
        return super.toString() + " (at: " + this.time.format(DATE_TIME_OUTPUT_FORMAT) + ")";
    }

    /**
     * Returns the string representation of the event task for storage.
     *
     * @return The string representation of the event task for storage.
     */
    @Override
    public String toSaveString() {
        return super.toSaveString() + " | " + this.time.format(DATE_TIME_INPUT_FORMAT);
    }

    /**
     * Checks if an {@code Object} is same as this {@code EventTask}.
     *
     * @param o The {@code Object} to check.
     * @return {@code true} if the {@code Object} is same as this {@code EventTask}, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        EventTask that = (EventTask) o;
        return time.equals(that.time);
    }
}
