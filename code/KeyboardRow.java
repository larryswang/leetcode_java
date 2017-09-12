import java.lang.*;
public class KeyboardRow{
    public String[] findWords(String[] words){
        String[] result;
        int j=0;
        for(String word:words){
            switch(charAt(0)){
                case 'q':case'w':case'e':case'r':case't':case'y':case'u':case'i':case'o':case'p':
                    for(int i=1;i<word.length();i++){
                    if(charAt(i)== 'q'||charAt(i)== 'w'||charAt(i)== 'e'||charAt(i)== 'r'||charAt(i)== 't'||charAt(i)== 'y'||charAt(i)== 'u'||charAt(i)== 'i'||charAt(i)== 'o'||charAt(i)== 'p'){
                        String[j]=word;
                        j++;
                    }
                }
                    break;
                case 'a':case's':case'd':case'f':case'g':case'h':case'j':case'k':case'l':
                     for(int i=1;i<word.length();i++){
                    if(charAt(i)== 'a'||charAt(i)== 's'||charAt(i)== 'd'||charAt(i)== 'f'||charAt(i)== 'g'||charAt(i)== 'h'||charAt(i)== 'j'||charAt(i)== 'k'||charAt(i)== 'l'){
                        String[j]=word;
                        j++;
                    }
                }
                case 'z':case'x':case'c':case'v':case'b':case'n':case'm':
                     for(int i=1;i<word.length();i++){
                    if(charAt(i)== 'z'||charAt(i)== 'x'||charAt(i)== 'c'||charAt(i)== 'v'||charAt(i)== 'b'||charAt(i)== 'n'||charAt(i)== 'm'){
                        String[j]=word;
                        j++;
                    }
                }
                }
            }
      return result;
      }
}
