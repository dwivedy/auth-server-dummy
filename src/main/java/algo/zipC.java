package algo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
public class zipC {
	
	 @RequestMapping(value = "/urservice", method = RequestMethod.POST)
	    public void uploadFile(MultipartHttpServletRequest request) throws IOException {

	    Iterator<String> itr = request.getFileNames();

	    // directory to save file
//	    String tempDir = System.getProperty("jboss.server.temp.dir");

	      MultipartFile file = request.getFile(itr.next());
	      String fileType = request.getParameter("fileType");
	      String fileName = file.getOriginalFilename();
	      System.out.println(file);
	      System.out.println(fileType);
	      System.out.println(fileName);

//	      File dir = new File(tempDir);
//	      File fileToImport = null;
//	      if (dir.isDirectory()) {
//
//	        try {
//	            fileToImport = new File(dir + File.separator + fileName);
//	            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileToImport));
//	            stream.write(file.getBytes());
//	            stream.close();
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//
//	}

}
	 }
