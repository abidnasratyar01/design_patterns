package strategy_pattern;

public class Main {

	public static void main(String[] args) {
		ImageStorage imageStorageJpeg = new ImageStorage(new JpegCompressor());
		imageStorageJpeg.store("OfAhmadJPEG");
		
		ImageStorage imageStoragePng = new ImageStorage(new PngCompressor());
		imageStoragePng.store("OfAhmadPNG");
	}

}
