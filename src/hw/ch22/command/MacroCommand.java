package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    private Deque<Command> commands = new ArrayDeque<>();

    // Step 1: MacroCommand 에 commandsForRedo 속성 추가 
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // Step 4: MacroCommand.execute() 수정 
    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // Step 2: MacroCommand.undo() 수정 
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    // Step 3: MacroCommand.redo() 메서드 추가
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    // Step 5: MacroCommand.clear() 수정
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
