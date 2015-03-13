public class BoxVolumeApp {

	public static void main(String[] args) {
		BoxVolume b1 = new BoxVolume();
		BoxVolume b2 = new BoxVolume();
		int v1 = b1.volume(3, 3, 3);
		int v2 = b2.volume(3,4,5);
		System.out.println(v1);
		System.out.println(v2);
	}

}
