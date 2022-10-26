package day17.inter.basic3;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("하준이는 생선을 먹어요.");
	}

	@Override
	public void play() {
		System.out.println("하준이는 캣타워에서 놀아요.");
	}

}
