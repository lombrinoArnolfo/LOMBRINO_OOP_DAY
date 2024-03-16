
package lombrinolabactivity2.pkg3;


public class TextEditor {
    
    
       private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String newText) {
        text += newText;
    }

    public void delete(int n) {
        if (n >= 0 && n <= text.length()) {
            this.text = this.text.substring(0, text.length() - n);
        }
    }
}
