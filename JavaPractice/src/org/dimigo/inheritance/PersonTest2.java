/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : 송혜민
 * @version : 1.0
 */
public class PersonTest2 {
	private static void greeting(Person p){
		p.sayHello();
		p.sayBye();
		}
	
	public static void main(String[] args) {
		Person[] person = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};

		for(Person p : person){
		System.out.println(p);
		greeting(p);
		System.out.println();
		}
			
}}
