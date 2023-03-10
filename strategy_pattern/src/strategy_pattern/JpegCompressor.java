package strategy_pattern;

public class JpegCompressor implements Compressor {

	@Override
	public void compress(String fileName) {
		System.out.println("Compressing using JpegCompressor");
		
	}

}
