public class Main {
    public static void main(String[] args) {

                TextStack h = new TextStack();

                h.addText("hamda");
                h.addText("juu");
                h.addText("lii");

                h.showAll();

                System.out.println("Top Element: " + h.viewTop());

                h.removeTop();
                h.showAll();
            }
        }