/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.Editor.EditorState
 * @see memento.Editor.History
 * Originator class: Provides the necessary features we need from an editor
 */

package memento.Editor;
public class Editor {
    private String content;

    //Public methods

    /**
     * Saves the current state of the Editor in an EditorState object
     * Dependency relationship with the EditorState class
     * @return an object of the EditorState class
     */
    public EditorState createState(){
        return new EditorState(content);
    }

    /**
     *
     * @param state takes the previous state of the Editor and sets it as the current state.
     */
    public void restore(EditorState state){
        content = state.getContent();
    }

    //Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
