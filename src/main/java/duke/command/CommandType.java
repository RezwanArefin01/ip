package duke.command;

/**
 * Supported commands along with their argument counts.
 */
public enum CommandType {
    LIST(1),
    CHECK(2),
    UNCHECK(2),
    TODO(2),
    DEADLINE(3),
    EVENT(3),
    FIND(2),
    DELETE(2),
    EXIT(1);

    private final int argsCount;

    CommandType(int argsCount) {
        this.argsCount = argsCount;
    }

    /**
     * Checks if the provided arguments are compatible with the command.
     *
     * @param args The arguments to check.
     * @return {@code true} if the arguments are compatible with the command, {@code false} otherwise.
     */
    public boolean isCompatible(String... args) {
        return this.argsCount == args.length;
    }
}
