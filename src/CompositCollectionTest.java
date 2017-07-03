import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/3.
 */
public class CompositCollectionTest {

    public static void main(String[] args){
        Article article1 = new Article("lee","lee1");
        Article article2 = new Article("lee","lee2");
        Article article3 = new Article("lee","lee3");
        Article article4 = new Article("tian","tian1");
        Article article5 = new Article("tian","tian2");
        Article article6 = new Article("zhou","zhou1");
        Article article7 = new Article("zhou","zhou2");
        Article article8 = new Article("wang","wang1");
        List<Article> articleList = new ArrayList<>();
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);
        articleList.add(article6);
        articleList.add(article7);
        articleList.add(article8);
        Map<String, List<Article>> map = new HashMap<>();
        for (Article a:articleList){
//            if (map.get(a.getAuthor())==null)
            List<Article> newList = map.get(a.getAuthor());
            if (newList==null){
                newList = new ArrayList<>();
            }
            newList.add(a);

            map.put(a.getAuthor(),newList);
        }
        List<Article> found = map.get("zhou");
        for (Article a:found){
            System.out.println(a.getAuthor());
            System.out.println(a.getTitle());
        }

//        map.put("lee",articleList);
//        map.put("tian",articleList);
//        map.put("zhou",articleList);
//        map.put("wang",articleList);
    }
}
