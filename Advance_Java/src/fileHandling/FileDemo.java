package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("G:\\Capgemini\\JAVA\\Workspace\\Advance_Java\\src\\fileHandling\\test.txt");
		
//		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
		
		FileInputStream fls = new FileInputStream(f);
		System.out.println(fls.read());
		
		int count;
		while((count = fls.read())!=-1) {
			System.out.print((char)count);
		}
		System.out.println("\n\nusing scanner\n");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext()) {
			System.out.print(sc.nextLine());
		}
		
		System.out.println();
		
		
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();  // Always close
        
        FileInputStream fis = new FileInputStream(f);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(fis));
        
        String temp = "", line1 = "";
        while((line1 = br1.readLine()) != null) {
            temp+=line1;
        }
        System.out.println(temp);
        br1.close();
		
	}

}
