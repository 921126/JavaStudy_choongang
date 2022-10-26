package day17.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
//		//기존 객체생성
//		Dog d = new Dog();			//dog에 선언된 기능 전부 사용 가능
//		
//		//부모 객체에 생성
//		Animal d1 = new Dog();		//Animal에 선언된 기능만 사용 가능
//		
//		//인터페이스에 생성
//		IPet d2 = new Dog();		//IPet에 선언된 기능만 사용가능
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1. animal 배열에 저장
		Animal[] arr = {baduk, nabi, hodol};
		for(Animal a : arr) {
			a.eat();
		}
		
		//2. 바둑이는 animal 이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 된다.
		// animal형에서 interface로 변경 가능 
		
		IPet i1 = (IPet)arr[0];
		IPet i2 = (IPet)nabi;
		IPet i3 = new GoldFish();
		
		IPet[] arr2 = {i1, i2, i3};
		
		
		for(IPet i : arr2) {
			i.play();
		}
		
		System.out.println("////////펫하우스////////");
		
		//실습
		PetHouse.print(i1);
		PetHouse.print(i2);
		PetHouse.print(i3);
		
		PetHouse.print2(arr2);
		
	}

}
