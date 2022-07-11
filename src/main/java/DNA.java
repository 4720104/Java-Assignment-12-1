
/**
 * 課題12-1
 * 
 * @author (4720104 伊藤和真)
 * @version (2022/7/11)
 */
public class DNA {
    public String str = "";

    public void str (String A){
        this.str = A;
    }
    
    public String getPair(){
        
        this.str = str.replace('A','X');
        this.str = str.replace('T','Y');
        this.str = str.replace('X','T');
        this.str = str.replace('Y','A');
        this.str = str.replace('C','X');
        this.str = str.replace('G','Y');
        this.str = str.replace('X','G');
        this.str = str.replace('Y','C');
        
        return this.str;
    }
}
