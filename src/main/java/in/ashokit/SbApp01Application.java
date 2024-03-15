package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApp01Application {
 // AA-101

    public void data(){
     int a =20;
     int b = 30;
    String s = "manish";
}

	public static void main(String[] args) {
		SpringApplication.run(SbApp01Application.class, args);
   int i = 15;
   int j = 20;
   int age = 60;			
   int k = 50;
	}
    public String createData(){
       String msg = "Data has created";
           return msg;
}
}
