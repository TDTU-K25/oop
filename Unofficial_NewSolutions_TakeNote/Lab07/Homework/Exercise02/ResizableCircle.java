public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }

    @Override
    public void resize(int percent) {
        this.radius *= (percent / 100.0);
    }
}
