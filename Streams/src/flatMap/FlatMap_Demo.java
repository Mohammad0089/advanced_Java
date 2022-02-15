package flatMap;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.function.Function;

class Student { // 	I use this class at line 80
	String name;
	int id;
	char grade;
	
	Student(String n, char g, int id){
		this.grade =g;
		this.id=id;
		this.name=n;
	}
}

public class FlatMap_Demo {
	
	public static void main(String[] args) {
		
		// this simple map()
		
		List <Integer> num1 = Arrays.asList(1,2,3,5,4,8,9);
		
		List <Integer> num2 = new ArrayList<Integer>();
		
		num2 = num1.stream().map(n->n+2).collect(Collectors.toList());
		//System.out.println(num2);
		
		// flatMap()
		
		List <Integer> n1 = Arrays.asList(1,2);
		List <Integer> n2 = Arrays.asList(3,4);
		List <Integer> n3 = Arrays.asList(4,5);
		
		List<List<Integer>> n4 = Arrays.asList(n1,n2,n3); System.out.println(n4); // [[1, 2], [3, 4], [4, 5]]
		
		
		n4.stream().filter(n->n.size()>1).forEach(n->System.out.print(n)); //[1, 2][3, 4][4, 5]
		
		n4.stream().flatMap(n->n.stream()).forEach(n->System.err.print(n+" "));  // 1 2 3 4 4 5
		
		n4.stream().flatMap(n->n.stream()).map(n->n+15).forEach(n->System.out.print(n+" ")); //16 17 18 19 19 20 
		
		List<String> teamA = Arrays.asList("Scott","David","John");
		List<String> teamB =Arrays.asList("Mary","Luna","Tom");
		List<String> teamC = Arrays.asList("Ken","Joony","Kitty");
		
		
		List<List<String>> allTeams = new ArrayList<List<String>>();  // creating a 2d ArrayList type String
		allTeams.add(teamA);  // we adding the List collection to the allTeams
		allTeams.add(teamC);  // All teams is 2d List
		allTeams.add(teamB);

		System.out.println("\n"+allTeams); //[[Scott, David, John], [Ken, Joony, Kitty], [Mary, Luna, Tom]]
		
		//Using old way to print 2d content of allTeams to the screen
		for(List<String> val:allTeams) {
			for(String value:val) {
				System.err.println("Player in the team: "+value);		// here we output each player as individually		
			}
		}
		for(List<String> val:allTeams) {     // here we out put each team as group
			System.out.println(val);         				//[Scott, David, John]
															//[Ken, Joony, Kitty]
															//[Mary, Luna, Tom]
		}
		
		// USing streams
		List <String> allPlayers  = allTeams.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		
		System.err.println(allPlayers); //[Scott, David, John, Ken, Joony, Kitty, Mary, Luna, Tom]
		
		
		
		
		
		// using student class
		List<Student> s1= new ArrayList<Student>();
		s1.add(new Student("aziz",'F',103));
		s1.add(new Student("mohammad",'A',101));
		s1.add(new Student("Ryan",'c',102));
		
		List<Student> s2= new ArrayList<Student>();	
		s2.add(new Student("mary",'F',108));
		s2.add(new Student("sarah",'A',107));
		s2.add(new Student("rony",'c',105));
		
		List<List<Student>> s3= new ArrayList<List<Student>>();
		
		s3.add(s1);
		s3.add(s2);
;                // printig student name from 2d List using stream 
		
		s3.stream()
		.flatMap(n->n.stream())
		.map(n->n.name)
		.forEach(n->System.out.print(n+" "));  //aziz mohammad Ryan mary sarah rony
		
		IntStream.range(1, 10).filter(n->n%2 == 0).forEach(System.err::print); //2468
		
		System.out.println("\nthis is used to count ferquency for more info refer java prof not chapter 57.3");
		
		//*************************************************************************//
		Stream.of(1,1,1,2,3,5,77,8,99,99,88,88,8,4)     // it was Amazon SDE OA
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().forEach(System.out::print);
		//************************************************************************//
		
		//distinct() non terminal    //limit non terminal   //count() terminal min() terminal   max() terminal reduce() terminal toArray()
		
		
		List <String> vehicles = Arrays.asList("bus","train","bus","car","bicycle","plan","bus","plan");
		
		vehicles.stream().distinct().forEach(n->System.out.print(n +" ")); // bus train car bicycle plan
		
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		
		System.err.println(distinctVehicles); //[bus, train, car, bicycle, plan] 
		
		Long count = vehicles.stream().distinct().count();
		System.out.println("number of uniqe elements: "+count); //number of uniqe elements: 5
		
		vehicles.stream().limit(3).forEach(n->System.err.print(n +" ")); //bus train bus 
		
		// Find the even numbers in the collection min and max
		List<Integer> num = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11);		
		Long evenCount = num.stream().filter(n->n%2==0).count();
		System.out.println(evenCount); //6
		
		Optional<Integer> f =num.stream().min((val1,val2) ->{return val1.compareTo(val2);});		
		System.out.println(f.get()); //0
		
		
		Optional<Integer> max= num.stream().max((v1,v2)->{return v1.compareTo(v2);});
		System.out.println(max.get()); //11
		
		
		List<String> stringList = Arrays.asList("a","B","1","C","8");
		
		Optional <String> reduced = stringList.stream().reduce((value, combinedValue)->{return value+combinedValue;});
		
		System.out.println(reduced.get());// aB1C8
		
		
		Object [] arr=stringList.stream().toArray();  // creating a array of object from stream
		for(Object val:arr) {
			System.err.print(val +" ");
		}
		
		System.out.println(stringList);
		System.err.println(arr);
		
		char [] ch = {'a','b','v'};
		System.out.println(ch);
		
		// sorted() anyMatch() //noneMatch() findAny() findFirst() and Concatenating streams
		
		
		num2.stream().sorted().forEach(n->System.out.print(n + " ")); //3 4 5 6 7 10 11 
		num2.stream().sorted(Comparator.reverseOrder()).forEach(n->System.err.print(n + " ")); //11 10 7 6 5 4 3
		
		System.out.println(allPlayers);//[Scott, David, John, Ken, Joony, Kitty, Mary, Luna, Tom]
		
		Set <String> players = allPlayers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet()); 
	
		System.out.println(players); //[Tom, Joony, Ken, Luna, John, David, Kitty, Scott, Mary]
		
		//anyMatch
		boolean find = players.stream().anyMatch(n->{return n.startsWith("T");});
		System.out.println(find); //true
		
		// allMatch
		find = players.stream().allMatch(n->{return n.startsWith("T");});
		System.out.println(find); //false
		
		find = players.stream().noneMatch(n->{return n.startsWith("T");});
		System.out.println(find); //false
		
		//findAny
		Optional <String> str = players.stream().findAny();
		System.out.println(str.get()); //Optional[Tom]
		
		str = players.stream().findFirst();
		System.out.println(str.get());//Tom
		
		
		//Concatinate to streams
		
		List<String> animalList = Arrays.asList("Dog","cat","Elephant");
		List<String> birdsList = Arrays.asList("parrot","Crow","Peackook");
		
		Stream <String> stream1 = animalList.stream();
		Stream <String> stream2 = birdsList.stream();
		
		List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalList); //[Dog, cat, Elephant, parrot, Crow, Peackook]
		
		
		
		
		
         
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	
	} 
		
}
