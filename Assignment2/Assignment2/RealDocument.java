package Assignment2;

public  class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document: " + title);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + title);
    }

    @Override
    public void open() {

    }
}