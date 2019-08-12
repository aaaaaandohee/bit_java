package day14_interface_clone;

public interface Command {
		public void exec();
		default public void check() {//인터페이스에 추상메소드 이외에 디폴트메소드 추가가능. 디폴드메소드는 abstract메소드도 instance메소드도 아님.
			System.out.println("Command check() 함수");
		} 
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Delete 작업 수행");
	}
	public void check() {//오버라이딩
		System.out.println("DeleteCommand check() 함수");
	} 
}

class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Insert 작업 수행");
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Update 작업 수행");
	}
}

class ListCommand implements Command{
	@Override
	public void exec() {
		System.out.println("List 작업 수행");
	}
}
