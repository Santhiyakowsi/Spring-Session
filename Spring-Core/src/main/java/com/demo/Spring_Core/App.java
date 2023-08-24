package com.demo.Spring_Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); //GOing to the instructions to your Spring FrameWork
        //Customer customer=new Customer();
        //customer.detail();    //Normal object Creation  
    	
    	//Customer customer=context.getBean(Customer.class);
    	//customer.detail();  //Bean Creation 
    	
    	//order order1=context.getBean(order.class);
    	//order1.detail(); //anthoer Bean Creation 
    	
    	order ec= context.getBean(order.class);
    	ec.detail(); // With the help of Interface 
    	System.out.println(ec.getPayment());
    	//System.out.println(ec.getId());
    	//System.out.println(ec.getP_detail());
    	//ec.getCustomer().detail();
    	ec.PrintCustomer();
    	
    	//System.out.println();
    	
}
}