package Assignment2.Bridge;

public class SimpleDocumentRenderer extends DocumentRenderer {

    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {

    }

    @Override
    public void renderDocument(String content) {
        // Call the render method of the RenderEngine (which can be SimpleRenderEngine or HighlightRenderEngine)
        engine.render(content);
    }
}