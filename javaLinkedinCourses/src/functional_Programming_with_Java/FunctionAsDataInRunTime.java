package functional_Programming_with_Java;

public class FunctionAsDataInRunTime {
	
	protected static class  Person{
		private String name;
		private Integer age;
		
		Person(String n ,  Integer age){
			this.name = n;
			this.age = age;
		}
	}
		
	 final static class DataLoader{
		
		public final NoArgFunction <Person> loadPerson;
		
		public DataLoader (Boolean isDevelopment) {
			this.loadPerson = isDevelopment 
					? this::loadPersonFake
					: this::loadPersonReal;						
		}
		
		private Person loadPersonReal() {
			System.out.println("loading person");
			return new Person("ryan", 3);			
		}
		
		private Person loadPersonFake() {
			System.out.println("returning fake person object");
			return new Person("fake person" , 100);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Boolean IS_DEVELOPMENT = true;
		DataLoader dataloader = new DataLoader(IS_DEVELOPMENT);
		Person rand = dataloader.loadPerson.apply();
		System.out.println(rand.name + " " + rand.age);
		

	}

}