public class TestImageLoader {
    public static void main(String[] args) {
        ImageLoader imageLoader = ImageLoader.getInstance();
        System.out.println(imageLoader.loadImage());
    }
}
