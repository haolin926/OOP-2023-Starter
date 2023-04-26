package ie.tudublin;
import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }
    public void addFollow(Follow f)
    {
        follows.add(f);
    }
    public void addFollowCount(Follow f)
    {
        f.setCount(f.getCount()+1);
    }

    public int findFollow(String word)
    {
        for(Follow f:follows)
        {
            if(f.getWord().equals(word))
            {
                return follows.indexOf(f);
            }
        }
        return -1;
    }


    public Word(String word) {
        this.word = word;
        follows = new ArrayList<Follow>();
    }
    
    public String toString()
    {
        String result = "";
        result += word + ":";
        for(Follow f:follows)
        {
            result += " " + f.toString();
        }
        return result;
    }
}
