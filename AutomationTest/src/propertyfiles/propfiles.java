package propertyfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propfiles {
public static void main(String[] args)
throws FileNotFoundException,IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./data.properties"));
	String url=p.getProperty("baseurl");
	System.out.println(url);
}
}
////genric
////public static void getData(String path,String key)
////throws FileNotFoundException,IOException
//{
//	Properties p=new Properties();
//	p.load(new FileInputStream(path));
//	String url=p.getProperty(key);
//	
//}

