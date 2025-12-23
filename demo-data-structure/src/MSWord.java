import java.util.Deque;
import java.util.LinkedList;

public class MSWord {
  private StringBuilder text;
  private Deque<Character> undoQueue;
  private Deque<Character> redoQueue;

  public MSWord() {
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> ab (redo, undoQ=b) -> abc (redo)
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> ab (redo, undoQ=b) -> a (undo) -> ab (redo) -> abc (redo)
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> a! (action) -> No redo anymore
    this.text = new StringBuilder();
    this.undoQueue = new LinkedList<>();
    this.redoQueue = new LinkedList<>();
  }

  // ! ONLY Action (assumption)
  // addChar action -> prepare for undo action
  public void addChar(char ch) {
    this.text.append(ch);
    this.undoQueue.addLast(ch);
    this.redoQueue.clear();
  }

  // undo -> prepare for redo action
  public void undo() {
    if (!this.undoQueue.isEmpty()) {
      char lastChar = this.undoQueue.pollLast();
      this.redoQueue.addLast(lastChar);
      // this.undoQueue.pollLast();
      if (this.text.length() >= 1)
        this.text.deleteCharAt(this.text.length() - 1); // abc -> ab
    }
  }

  // redo -> StringBuilder append -> prepare for undo action
  public void redo() {
    if (!this.redoQueue.isEmpty()) {
      char lastChar = this.redoQueue.pollLast();
      this.text.append(lastChar);
      this.undoQueue.add(lastChar);
    }
  }

  public String getText() {
    return this.text.toString();
  }

  public static void main(String[] args) {
    MSWord ms = new MSWord();
    ms.addChar('a');
    ms.addChar('b');
    ms.addChar('c');
    ms.undo(); // ab
    ms.undo(); // a
    ms.addChar('!');
    System.out.println(ms.getText()); // a!
    ms.undo(); // a
    ms.undo(); // !
    ms.undo(); // !
    ms.undo(); // !
    ms.undo(); // !
    ms.undo(); // !
    ms.undo(); // !
    System.out.println(ms.getText());
  }

}


// import java.util.Deque;
// import java.util.LinkedList;

// public class MSWord {

// private Deque<Character> word = new LinkedList<>();
// private Deque<Character> delChar = new LinkedList<>();

// // ! ONLY Action (assumption)
// public void addChar(char ch) {
// word.add(ch);
// System.out.println(word);
// }

// public void undo() {
// char ch = word.pollLast();
// delChar.add(ch);
// System.out.println(word);
// }

// public void redo() {
// char ch = delChar.pollLast();
// word.add(ch);
// System.out.println(word);
// }

// public static void main(String[] args) {
// MSWord msw = new MSWord();
// msw.addChar('a');
// msw.addChar('b');
// msw.addChar('c');
// msw.addChar('d');
// msw.undo();
// msw.undo();
// msw.redo();
// }

// }
