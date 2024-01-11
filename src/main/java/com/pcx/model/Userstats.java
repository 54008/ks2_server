package com.pcx.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author pcx
*/
public class Userstats implements Serializable {

    private static final long serialVersionUID = 1704800083826L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String id;

    /**
    * 
    * isNullAble:1
    */
    private Integer score;

    /**
    * 
    * isNullAble:1
    */
    private String user_rank;

    /**
    * 
    * isNullAble:1
    */
    private Integer victories;

    /**
    * 
    * isNullAble:1
    */
    private Integer defeats;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal win_rate;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setScore(Integer score){this.score = score;}

    public Integer getScore(){return this.score;}

    public void setUser_rank(String user_rank){this.user_rank = user_rank;}

    public String getUser_rank(){return this.user_rank;}

    public void setVictories(Integer victories){this.victories = victories;}

    public Integer getVictories(){return this.victories;}

    public void setDefeats(Integer defeats){this.defeats = defeats;}

    public Integer getDefeats(){return this.defeats;}

    public void setWin_rate(java.math.BigDecimal win_rate){this.win_rate = win_rate;}

    public java.math.BigDecimal getWin_rate(){return this.win_rate;}
    @Override
    public String toString() {
        return "Userstats{" +
                "id='" + id + '\'' +
                "score='" + score + '\'' +
                "user_rank='" + user_rank + '\'' +
                "victories='" + victories + '\'' +
                "defeats='" + defeats + '\'' +
                "win_rate='" + win_rate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Userstats set;

        private ConditionBuilder where;

        public UpdateBuilder set(Userstats set){
            this.set = set;
            return this;
        }

        public Userstats getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Userstats{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<Integer> scoreList;

        public List<Integer> getScoreList(){return this.scoreList;}

        private Integer scoreSt;

        private Integer scoreEd;

        public Integer getScoreSt(){return this.scoreSt;}

        public Integer getScoreEd(){return this.scoreEd;}

        private List<String> user_rankList;

        public List<String> getUser_rankList(){return this.user_rankList;}


        private List<String> fuzzyUser_rank;

        public List<String> getFuzzyUser_rank(){return this.fuzzyUser_rank;}

        private List<String> rightFuzzyUser_rank;

        public List<String> getRightFuzzyUser_rank(){return this.rightFuzzyUser_rank;}
        private List<Integer> victoriesList;

        public List<Integer> getVictoriesList(){return this.victoriesList;}

        private Integer victoriesSt;

        private Integer victoriesEd;

        public Integer getVictoriesSt(){return this.victoriesSt;}

        public Integer getVictoriesEd(){return this.victoriesEd;}

        private List<Integer> defeatsList;

        public List<Integer> getDefeatsList(){return this.defeatsList;}

        private Integer defeatsSt;

        private Integer defeatsEd;

        public Integer getDefeatsSt(){return this.defeatsSt;}

        public Integer getDefeatsEd(){return this.defeatsEd;}

        private List<java.math.BigDecimal> win_rateList;

        public List<java.math.BigDecimal> getWin_rateList(){return this.win_rateList;}

        private java.math.BigDecimal win_rateSt;

        private java.math.BigDecimal win_rateEd;

        public java.math.BigDecimal getWin_rateSt(){return this.win_rateSt;}

        public java.math.BigDecimal getWin_rateEd(){return this.win_rateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public QueryBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public QueryBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public QueryBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public QueryBuilder id(String id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder scoreBetWeen(Integer scoreSt,Integer scoreEd){
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public QueryBuilder scoreGreaterEqThan(Integer scoreSt){
            this.scoreSt = scoreSt;
            return this;
        }
        public QueryBuilder scoreLessEqThan(Integer scoreEd){
            this.scoreEd = scoreEd;
            return this;
        }


        public QueryBuilder score(Integer score){
            setScore(score);
            return this;
        }

        public QueryBuilder scoreList(Integer ... score){
            this.scoreList = solveNullList(score);
            return this;
        }

        public QueryBuilder scoreList(List<Integer> score){
            this.scoreList = score;
            return this;
        }

        public QueryBuilder fetchScore(){
            setFetchFields("fetchFields","score");
            return this;
        }

        public QueryBuilder excludeScore(){
            setFetchFields("excludeFields","score");
            return this;
        }

        public QueryBuilder fuzzyUser_rank (List<String> fuzzyUser_rank){
            this.fuzzyUser_rank = fuzzyUser_rank;
            return this;
        }

        public QueryBuilder fuzzyUser_rank (String ... fuzzyUser_rank){
            this.fuzzyUser_rank = solveNullList(fuzzyUser_rank);
            return this;
        }

        public QueryBuilder rightFuzzyUser_rank (List<String> rightFuzzyUser_rank){
            this.rightFuzzyUser_rank = rightFuzzyUser_rank;
            return this;
        }

        public QueryBuilder rightFuzzyUser_rank (String ... rightFuzzyUser_rank){
            this.rightFuzzyUser_rank = solveNullList(rightFuzzyUser_rank);
            return this;
        }

        public QueryBuilder user_rank(String user_rank){
            setUser_rank(user_rank);
            return this;
        }

        public QueryBuilder user_rankList(String ... user_rank){
            this.user_rankList = solveNullList(user_rank);
            return this;
        }

        public QueryBuilder user_rankList(List<String> user_rank){
            this.user_rankList = user_rank;
            return this;
        }

        public QueryBuilder fetchUser_rank(){
            setFetchFields("fetchFields","user_rank");
            return this;
        }

        public QueryBuilder excludeUser_rank(){
            setFetchFields("excludeFields","user_rank");
            return this;
        }

        public QueryBuilder victoriesBetWeen(Integer victoriesSt,Integer victoriesEd){
            this.victoriesSt = victoriesSt;
            this.victoriesEd = victoriesEd;
            return this;
        }

        public QueryBuilder victoriesGreaterEqThan(Integer victoriesSt){
            this.victoriesSt = victoriesSt;
            return this;
        }
        public QueryBuilder victoriesLessEqThan(Integer victoriesEd){
            this.victoriesEd = victoriesEd;
            return this;
        }


        public QueryBuilder victories(Integer victories){
            setVictories(victories);
            return this;
        }

        public QueryBuilder victoriesList(Integer ... victories){
            this.victoriesList = solveNullList(victories);
            return this;
        }

        public QueryBuilder victoriesList(List<Integer> victories){
            this.victoriesList = victories;
            return this;
        }

        public QueryBuilder fetchVictories(){
            setFetchFields("fetchFields","victories");
            return this;
        }

        public QueryBuilder excludeVictories(){
            setFetchFields("excludeFields","victories");
            return this;
        }

        public QueryBuilder defeatsBetWeen(Integer defeatsSt,Integer defeatsEd){
            this.defeatsSt = defeatsSt;
            this.defeatsEd = defeatsEd;
            return this;
        }

        public QueryBuilder defeatsGreaterEqThan(Integer defeatsSt){
            this.defeatsSt = defeatsSt;
            return this;
        }
        public QueryBuilder defeatsLessEqThan(Integer defeatsEd){
            this.defeatsEd = defeatsEd;
            return this;
        }


        public QueryBuilder defeats(Integer defeats){
            setDefeats(defeats);
            return this;
        }

        public QueryBuilder defeatsList(Integer ... defeats){
            this.defeatsList = solveNullList(defeats);
            return this;
        }

        public QueryBuilder defeatsList(List<Integer> defeats){
            this.defeatsList = defeats;
            return this;
        }

        public QueryBuilder fetchDefeats(){
            setFetchFields("fetchFields","defeats");
            return this;
        }

        public QueryBuilder excludeDefeats(){
            setFetchFields("excludeFields","defeats");
            return this;
        }

        public QueryBuilder win_rateBetWeen(java.math.BigDecimal win_rateSt,java.math.BigDecimal win_rateEd){
            this.win_rateSt = win_rateSt;
            this.win_rateEd = win_rateEd;
            return this;
        }

        public QueryBuilder win_rateGreaterEqThan(java.math.BigDecimal win_rateSt){
            this.win_rateSt = win_rateSt;
            return this;
        }
        public QueryBuilder win_rateLessEqThan(java.math.BigDecimal win_rateEd){
            this.win_rateEd = win_rateEd;
            return this;
        }


        public QueryBuilder win_rate(java.math.BigDecimal win_rate){
            setWin_rate(win_rate);
            return this;
        }

        public QueryBuilder win_rateList(java.math.BigDecimal ... win_rate){
            this.win_rateList = solveNullList(win_rate);
            return this;
        }

        public QueryBuilder win_rateList(List<java.math.BigDecimal> win_rate){
            this.win_rateList = win_rate;
            return this;
        }

        public QueryBuilder fetchWin_rate(){
            setFetchFields("fetchFields","win_rate");
            return this;
        }

        public QueryBuilder excludeWin_rate(){
            setFetchFields("excludeFields","win_rate");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Userstats build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<Integer> scoreList;

        public List<Integer> getScoreList(){return this.scoreList;}

        private Integer scoreSt;

        private Integer scoreEd;

        public Integer getScoreSt(){return this.scoreSt;}

        public Integer getScoreEd(){return this.scoreEd;}

        private List<String> user_rankList;

        public List<String> getUser_rankList(){return this.user_rankList;}


        private List<String> fuzzyUser_rank;

        public List<String> getFuzzyUser_rank(){return this.fuzzyUser_rank;}

        private List<String> rightFuzzyUser_rank;

        public List<String> getRightFuzzyUser_rank(){return this.rightFuzzyUser_rank;}
        private List<Integer> victoriesList;

        public List<Integer> getVictoriesList(){return this.victoriesList;}

        private Integer victoriesSt;

        private Integer victoriesEd;

        public Integer getVictoriesSt(){return this.victoriesSt;}

        public Integer getVictoriesEd(){return this.victoriesEd;}

        private List<Integer> defeatsList;

        public List<Integer> getDefeatsList(){return this.defeatsList;}

        private Integer defeatsSt;

        private Integer defeatsEd;

        public Integer getDefeatsSt(){return this.defeatsSt;}

        public Integer getDefeatsEd(){return this.defeatsEd;}

        private List<java.math.BigDecimal> win_rateList;

        public List<java.math.BigDecimal> getWin_rateList(){return this.win_rateList;}

        private java.math.BigDecimal win_rateSt;

        private java.math.BigDecimal win_rateEd;

        public java.math.BigDecimal getWin_rateSt(){return this.win_rateSt;}

        public java.math.BigDecimal getWin_rateEd(){return this.win_rateEd;}


        public ConditionBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public ConditionBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public ConditionBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public ConditionBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public ConditionBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder scoreBetWeen(Integer scoreSt,Integer scoreEd){
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public ConditionBuilder scoreGreaterEqThan(Integer scoreSt){
            this.scoreSt = scoreSt;
            return this;
        }
        public ConditionBuilder scoreLessEqThan(Integer scoreEd){
            this.scoreEd = scoreEd;
            return this;
        }


        public ConditionBuilder scoreList(Integer ... score){
            this.scoreList = solveNullList(score);
            return this;
        }

        public ConditionBuilder scoreList(List<Integer> score){
            this.scoreList = score;
            return this;
        }

        public ConditionBuilder fuzzyUser_rank (List<String> fuzzyUser_rank){
            this.fuzzyUser_rank = fuzzyUser_rank;
            return this;
        }

        public ConditionBuilder fuzzyUser_rank (String ... fuzzyUser_rank){
            this.fuzzyUser_rank = solveNullList(fuzzyUser_rank);
            return this;
        }

        public ConditionBuilder rightFuzzyUser_rank (List<String> rightFuzzyUser_rank){
            this.rightFuzzyUser_rank = rightFuzzyUser_rank;
            return this;
        }

        public ConditionBuilder rightFuzzyUser_rank (String ... rightFuzzyUser_rank){
            this.rightFuzzyUser_rank = solveNullList(rightFuzzyUser_rank);
            return this;
        }

        public ConditionBuilder user_rankList(String ... user_rank){
            this.user_rankList = solveNullList(user_rank);
            return this;
        }

        public ConditionBuilder user_rankList(List<String> user_rank){
            this.user_rankList = user_rank;
            return this;
        }

        public ConditionBuilder victoriesBetWeen(Integer victoriesSt,Integer victoriesEd){
            this.victoriesSt = victoriesSt;
            this.victoriesEd = victoriesEd;
            return this;
        }

        public ConditionBuilder victoriesGreaterEqThan(Integer victoriesSt){
            this.victoriesSt = victoriesSt;
            return this;
        }
        public ConditionBuilder victoriesLessEqThan(Integer victoriesEd){
            this.victoriesEd = victoriesEd;
            return this;
        }


        public ConditionBuilder victoriesList(Integer ... victories){
            this.victoriesList = solveNullList(victories);
            return this;
        }

        public ConditionBuilder victoriesList(List<Integer> victories){
            this.victoriesList = victories;
            return this;
        }

        public ConditionBuilder defeatsBetWeen(Integer defeatsSt,Integer defeatsEd){
            this.defeatsSt = defeatsSt;
            this.defeatsEd = defeatsEd;
            return this;
        }

        public ConditionBuilder defeatsGreaterEqThan(Integer defeatsSt){
            this.defeatsSt = defeatsSt;
            return this;
        }
        public ConditionBuilder defeatsLessEqThan(Integer defeatsEd){
            this.defeatsEd = defeatsEd;
            return this;
        }


        public ConditionBuilder defeatsList(Integer ... defeats){
            this.defeatsList = solveNullList(defeats);
            return this;
        }

        public ConditionBuilder defeatsList(List<Integer> defeats){
            this.defeatsList = defeats;
            return this;
        }

        public ConditionBuilder win_rateBetWeen(java.math.BigDecimal win_rateSt,java.math.BigDecimal win_rateEd){
            this.win_rateSt = win_rateSt;
            this.win_rateEd = win_rateEd;
            return this;
        }

        public ConditionBuilder win_rateGreaterEqThan(java.math.BigDecimal win_rateSt){
            this.win_rateSt = win_rateSt;
            return this;
        }
        public ConditionBuilder win_rateLessEqThan(java.math.BigDecimal win_rateEd){
            this.win_rateEd = win_rateEd;
            return this;
        }


        public ConditionBuilder win_rateList(java.math.BigDecimal ... win_rate){
            this.win_rateList = solveNullList(win_rate);
            return this;
        }

        public ConditionBuilder win_rateList(List<java.math.BigDecimal> win_rate){
            this.win_rateList = win_rate;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Userstats obj;

        public Builder(){
            this.obj = new Userstats();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder score(Integer score){
            this.obj.setScore(score);
            return this;
        }
        public Builder user_rank(String user_rank){
            this.obj.setUser_rank(user_rank);
            return this;
        }
        public Builder victories(Integer victories){
            this.obj.setVictories(victories);
            return this;
        }
        public Builder defeats(Integer defeats){
            this.obj.setDefeats(defeats);
            return this;
        }
        public Builder win_rate(java.math.BigDecimal win_rate){
            this.obj.setWin_rate(win_rate);
            return this;
        }
        public Userstats build(){return obj;}
    }

}
