package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class Global_values_drive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//To read data from file properties we used the FileInputStream
		FileInputStream fis=new FileInputStream("D:\\pavanmulejava\\TestNgTutorilaUdemy\\src\\test\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		//To write back to the fileproperties we used FileOutputStream
		FileOutputStream fos=new FileOutputStream("D:\\pavanmulejava\\TestNgTutorilaUdemy\\src\\test\\data.properties");
		prop.store(fos, null);
	}

}
