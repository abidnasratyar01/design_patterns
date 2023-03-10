package momento_pattern;

public class Main {
    public static void main(String args[]) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("I");
        history.push(editor.createState());

        editor.setContent("D");
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
