package day17.inter.basic3;

public class PetHouse {

	//1.IPet타입을 매개변수로 받아서 기능을 출력하는 메서드
	static void print(IPet i) {
		i.play();
	};
	
	
	//2. IPet[] 타입을 매개변수로 받아서 기능을 전부 출력하는 메서드
	static void print2(IPet[] i) {
		for(IPet p : i) {
			p.play();
		}
		
	}
	
}
