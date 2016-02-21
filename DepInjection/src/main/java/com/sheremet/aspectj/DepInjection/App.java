package com.sheremet.aspectj.DepInjection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int COUNT = 5;

	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Corporation apple = (Corporation) context.getBean("Apple");
		Corporation microsoft = (Corporation) context.getBean("Microsoft");
		Worker w1 = (Worker) context.getBean("worker1");
		Worker w2 = (Worker) context.getBean("worker2");
		apple.setWorker(w1);
		microsoft.setWorker(w2);
		List<Production> iphones = new LinkedList<Production>();
		apple.setProductionModel("4");
		iphones.add(apple.product());
		apple.setProductionModel("4s");
		iphones.add(apple.product());
		apple.setProductionModel("5");
		iphones.add(apple.product());
		apple.setProductionModel("5s");
		iphones.add(apple.product());
		apple.setProductionModel("6");
		List<Production> winhones = new LinkedList<Production>();
		microsoft.setProductionModel("8.0");
		winhones.add(microsoft.product());
		microsoft.setProductionModel("8.1");
		winhones.add(microsoft.product());
		microsoft.setProductionModel("8.1 pro");
		winhones.add(microsoft.product());
		microsoft.setProductionModel("10");
		winhones.add(microsoft.product());
		System.out.println("testing winphones:");
		testing(winhones);
		System.out.println("testing iphones:");
		testing(iphones);
		
	}
	private static void testing(Collection<Production> production) {
		for(int i=0;i<COUNT; i++){
			System.out.println();
			System.out.println("testing #"+i);
			int j=0;
			for(Production p: production){
				System.out.println("example #"+j);
				try{
					p.work();
				}catch(Exception e){
					System.err.println(e.getClass().getName()+": "+e.getMessage());
				}
				j++;
			}
		}
	}
}
