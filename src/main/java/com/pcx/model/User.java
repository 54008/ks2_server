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
public class User implements Serializable {

    private static final long serialVersionUID = 1704800069625L;


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
    private String password_hash;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setPassword_hash(String password_hash){this.password_hash = password_hash;}

    public String getPassword_hash(){return this.password_hash;}
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "password_hash='" + password_hash + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
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
        private List<String> password_hashList;

        public List<String> getPassword_hashList(){return this.password_hashList;}


        private List<String> fuzzyPassword_hash;

        public List<String> getFuzzyPassword_hash(){return this.fuzzyPassword_hash;}

        private List<String> rightFuzzyPassword_hash;

        public List<String> getRightFuzzyPassword_hash(){return this.rightFuzzyPassword_hash;}
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

        public QueryBuilder fuzzyPassword_hash (List<String> fuzzyPassword_hash){
            this.fuzzyPassword_hash = fuzzyPassword_hash;
            return this;
        }

        public QueryBuilder fuzzyPassword_hash (String ... fuzzyPassword_hash){
            this.fuzzyPassword_hash = solveNullList(fuzzyPassword_hash);
            return this;
        }

        public QueryBuilder rightFuzzyPassword_hash (List<String> rightFuzzyPassword_hash){
            this.rightFuzzyPassword_hash = rightFuzzyPassword_hash;
            return this;
        }

        public QueryBuilder rightFuzzyPassword_hash (String ... rightFuzzyPassword_hash){
            this.rightFuzzyPassword_hash = solveNullList(rightFuzzyPassword_hash);
            return this;
        }

        public QueryBuilder password_hash(String password_hash){
            setPassword_hash(password_hash);
            return this;
        }

        public QueryBuilder password_hashList(String ... password_hash){
            this.password_hashList = solveNullList(password_hash);
            return this;
        }

        public QueryBuilder password_hashList(List<String> password_hash){
            this.password_hashList = password_hash;
            return this;
        }

        public QueryBuilder fetchPassword_hash(){
            setFetchFields("fetchFields","password_hash");
            return this;
        }

        public QueryBuilder excludePassword_hash(){
            setFetchFields("excludeFields","password_hash");
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

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> password_hashList;

        public List<String> getPassword_hashList(){return this.password_hashList;}


        private List<String> fuzzyPassword_hash;

        public List<String> getFuzzyPassword_hash(){return this.fuzzyPassword_hash;}

        private List<String> rightFuzzyPassword_hash;

        public List<String> getRightFuzzyPassword_hash(){return this.rightFuzzyPassword_hash;}

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

        public ConditionBuilder fuzzyPassword_hash (List<String> fuzzyPassword_hash){
            this.fuzzyPassword_hash = fuzzyPassword_hash;
            return this;
        }

        public ConditionBuilder fuzzyPassword_hash (String ... fuzzyPassword_hash){
            this.fuzzyPassword_hash = solveNullList(fuzzyPassword_hash);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword_hash (List<String> rightFuzzyPassword_hash){
            this.rightFuzzyPassword_hash = rightFuzzyPassword_hash;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword_hash (String ... rightFuzzyPassword_hash){
            this.rightFuzzyPassword_hash = solveNullList(rightFuzzyPassword_hash);
            return this;
        }

        public ConditionBuilder password_hashList(String ... password_hash){
            this.password_hashList = solveNullList(password_hash);
            return this;
        }

        public ConditionBuilder password_hashList(List<String> password_hash){
            this.password_hashList = password_hash;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder password_hash(String password_hash){
            this.obj.setPassword_hash(password_hash);
            return this;
        }
        public User build(){return obj;}
    }

}
