package Interview_Practise;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class GetLatestFile {

	public static void main(String[] args) throws IOException {
		
		//Path currDirectory = Paths.get(System.getProperty("user.dir")) ;
		Path currDirectory = Paths.get("C:\\Users\\ramya\\Downloads") ;
		
		System.out.println(currDirectory);
		
		DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(currDirectory) ;
		long newest = 0L;
	
		
		for (Path path : newDirectoryStream) 
		{
			//System.out.println(path);
			BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class) ;
			//System.out.println( " readAttributes -- " +readAttributes);
			long createTime = readAttributes.creationTime().toMillis() ;
			
			
			if( createTime > newest) {newest = createTime ; } 
			
		}
		
		Date date = new Date( newest ) ;
		System.out.println("the newest file is  -- "  + date.toString() );

	}

}
