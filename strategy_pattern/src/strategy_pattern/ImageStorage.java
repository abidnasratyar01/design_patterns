package strategy_pattern;

public class ImageStorage {
	private Compressor compressor; 
	
	public ImageStorage(Compressor compressor) {
		this.compressor = compressor;
	}
	
	public void store(String fileName) {
		compressor.compress(fileName);
	}
	
	

}
