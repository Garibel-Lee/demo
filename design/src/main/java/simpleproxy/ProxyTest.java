package simpleproxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		RealMovie realmovie = new RealMovie();
		
		Movie movie = new CinemaProxy(realmovie);
		
		movie.play();

	}

}