package day17.inter.basic3;

public class Dog extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("도도는 사료를 먹어요.");
	}

	@Override
	public void play() {
		System.out.println("도도는 방에서 놀아요.");
	}

}
