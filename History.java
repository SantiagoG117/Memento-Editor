/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.Editor.Editor
 * @see memento.Editor.EditorState
 * Caretaker class: Responsible for the state management of the editor. It tracks the changes of the Editor.
 */
package memento.Editor;

import java.util.Stack;

public class History {
    //Attributes
    private Stack<EditorState> states = new Stack<>();

    //Public methods

    /**
     *
     * @param state Takes the current state of the editor and stores it in the stack
     */
    public void push(EditorState state){
        states.push(state);
    }

    /**
     * Removes the current state of the Editor from the history
     * If the history is already empty returns an EditorState object with an empty content.
     * If the history only have one state left, removes the current state and returns an EditorState object with an empty content.
     *
     * @return the previous state of the Editor.
     */
    public EditorState pop(){
        if (states.isEmpty())
            return new EditorState("");
        else if (states.size() == 1){
            states.pop();
            return new EditorState("");
        }
        states.pop();
        return states.peek();
    }

    //Getter
    public Stack<EditorState> getStates() {
        return states;
    }
}
