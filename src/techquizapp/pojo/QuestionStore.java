package techquizapp.pojo;
import java.util.ArrayList;
public class QuestionStore {
    ArrayList<QuestionPojo> questionList;

    public QuestionStore() {
    questionList=new ArrayList<>();
    }

    public void addQuestion(QuestionPojo q)
    {
    questionList.add(q);
    } 
    
    public ArrayList<QuestionPojo> getAllQuestions()
    { return questionList;
    }
    
    public QuestionPojo getQuestion(int pos)
    {
    return questionList.get(pos);
    }
    
    public void removeQuestion(int pos)
    {
    questionList.remove(pos);
    }
    
    public void setQuestionAt(int pos,QuestionPojo q)
    {
    questionList.add(pos,q);
    }
    public int getCount(){return questionList.size();}
    
}
