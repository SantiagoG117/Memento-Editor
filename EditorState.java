/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.Editor.Editor
 * @see memento.Editor.History
 * Memento class: Responsible for storing the state of the Editor at a given time. We can store all the future fields of
 * the Editor (like title and subtitle) in this class.
 */

package memento.Editor;

public class EditorState {
    /*
    By setting the attributes as final, we make sure that their values won't be accidentally changed in out program.
     */
    private final String content;

    //Constructor
    public EditorState(String content) {
        this.content = content;
    }

    //Public methods
    @Override
    public String toString() {
        return "EditorStateMosh{" +
                "content='" + content + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }
}
