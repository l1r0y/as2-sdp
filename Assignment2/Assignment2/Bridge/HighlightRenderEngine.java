package Assignment2.Bridge;

public class HighlightRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {

        System.out.println("Rendering document with highlighted text: " + content);
    }
}