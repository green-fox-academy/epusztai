public class PostItMain {
    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome", "black");
        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");

        System.out.println(postIt1.getBackgroundColor() + ", " + postIt1.getTextColor() + (", ") + postIt1.getText());
        System.out.println(postIt2.getBackgroundColor() + ", " + postIt2.getTextColor() + (", ") + postIt2.getText());
        System.out.println(postIt3.getBackgroundColor() + ", " + postIt3.getTextColor() + (", ") + postIt3.getText());
    }
}
