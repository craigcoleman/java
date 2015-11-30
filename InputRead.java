import java.io.*; 
// name file "InputStream.java"
class InputRead {
	public static void main(String[] args) throws IOException {
    	     char clist[] = new char[1000];
    	     char copylist[] = new char[1000];
    	     char z;
    	     int nc;  //new character
    	     int i, c,count;
    	     count = 0;
    	     // *****************************  this code was obtained from Oracle
    	     FileReader inputStream = null;
    	     try { inputStream = new FileReader("words.txt");
    	          while ((c = inputStream.read()) != -1) {
    	          	  clist[count] = (char)c;
    	          	  count++;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }//end of finally and try
       // ***************************** 
        int val;
        char ncar;
           for (i = 0; i < count ; i ++){
            	System.out.print (clist[i]);
            	val = (int)clist[i];
            	nc = val+7;
            	copylist[i] = (char)nc;
            }
        
            for (i = 0; i < count ; i ++){
            	System.out.print (copylist[i]);
            }
            
    }
}
