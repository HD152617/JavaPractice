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
public class PersonTest {

	public static void main(String[] args) {
		Person a = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		System.out.println(a.toString());
		System.out.println(k.toString());
		System.out.println(j.toString());
		System.out.println(c.toString());
		System.out.println();
		a.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		a.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();


}
}
