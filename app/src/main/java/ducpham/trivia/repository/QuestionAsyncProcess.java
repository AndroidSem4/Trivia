package ducpham.trivia.repository;

import java.util.List;

import ducpham.trivia.model.Question;

public interface QuestionAsyncProcess {
    void onFinished(List<Question> questions);
}
