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
public class Provinces implements Serializable {

    private static final long serialVersionUID = 1704800061853L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer province_id;

    /**
    * 
    * isNullAble:0
    */
    private String province_name;


    public void setProvince_id(Integer province_id){this.province_id = province_id;}

    public Integer getProvince_id(){return this.province_id;}

    public void setProvince_name(String province_name){this.province_name = province_name;}

    public String getProvince_name(){return this.province_name;}
    @Override
    public String toString() {
        return "Provinces{" +
                "province_id='" + province_id + '\'' +
                "province_name='" + province_name + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Provinces set;

        private ConditionBuilder where;

        public UpdateBuilder set(Provinces set){
            this.set = set;
            return this;
        }

        public Provinces getSet(){
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

    public static class QueryBuilder extends Provinces{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> province_idList;

        public List<Integer> getProvince_idList(){return this.province_idList;}

        private Integer province_idSt;

        private Integer province_idEd;

        public Integer getProvince_idSt(){return this.province_idSt;}

        public Integer getProvince_idEd(){return this.province_idEd;}

        private List<String> province_nameList;

        public List<String> getProvince_nameList(){return this.province_nameList;}


        private List<String> fuzzyProvince_name;

        public List<String> getFuzzyProvince_name(){return this.fuzzyProvince_name;}

        private List<String> rightFuzzyProvince_name;

        public List<String> getRightFuzzyProvince_name(){return this.rightFuzzyProvince_name;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder province_idBetWeen(Integer province_idSt,Integer province_idEd){
            this.province_idSt = province_idSt;
            this.province_idEd = province_idEd;
            return this;
        }

        public QueryBuilder province_idGreaterEqThan(Integer province_idSt){
            this.province_idSt = province_idSt;
            return this;
        }
        public QueryBuilder province_idLessEqThan(Integer province_idEd){
            this.province_idEd = province_idEd;
            return this;
        }


        public QueryBuilder province_id(Integer province_id){
            setProvince_id(province_id);
            return this;
        }

        public QueryBuilder province_idList(Integer ... province_id){
            this.province_idList = solveNullList(province_id);
            return this;
        }

        public QueryBuilder province_idList(List<Integer> province_id){
            this.province_idList = province_id;
            return this;
        }

        public QueryBuilder fetchProvince_id(){
            setFetchFields("fetchFields","province_id");
            return this;
        }

        public QueryBuilder excludeProvince_id(){
            setFetchFields("excludeFields","province_id");
            return this;
        }

        public QueryBuilder fuzzyProvince_name (List<String> fuzzyProvince_name){
            this.fuzzyProvince_name = fuzzyProvince_name;
            return this;
        }

        public QueryBuilder fuzzyProvince_name (String ... fuzzyProvince_name){
            this.fuzzyProvince_name = solveNullList(fuzzyProvince_name);
            return this;
        }

        public QueryBuilder rightFuzzyProvince_name (List<String> rightFuzzyProvince_name){
            this.rightFuzzyProvince_name = rightFuzzyProvince_name;
            return this;
        }

        public QueryBuilder rightFuzzyProvince_name (String ... rightFuzzyProvince_name){
            this.rightFuzzyProvince_name = solveNullList(rightFuzzyProvince_name);
            return this;
        }

        public QueryBuilder province_name(String province_name){
            setProvince_name(province_name);
            return this;
        }

        public QueryBuilder province_nameList(String ... province_name){
            this.province_nameList = solveNullList(province_name);
            return this;
        }

        public QueryBuilder province_nameList(List<String> province_name){
            this.province_nameList = province_name;
            return this;
        }

        public QueryBuilder fetchProvince_name(){
            setFetchFields("fetchFields","province_name");
            return this;
        }

        public QueryBuilder excludeProvince_name(){
            setFetchFields("excludeFields","province_name");
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

        public Provinces build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> province_idList;

        public List<Integer> getProvince_idList(){return this.province_idList;}

        private Integer province_idSt;

        private Integer province_idEd;

        public Integer getProvince_idSt(){return this.province_idSt;}

        public Integer getProvince_idEd(){return this.province_idEd;}

        private List<String> province_nameList;

        public List<String> getProvince_nameList(){return this.province_nameList;}


        private List<String> fuzzyProvince_name;

        public List<String> getFuzzyProvince_name(){return this.fuzzyProvince_name;}

        private List<String> rightFuzzyProvince_name;

        public List<String> getRightFuzzyProvince_name(){return this.rightFuzzyProvince_name;}

        public ConditionBuilder province_idBetWeen(Integer province_idSt,Integer province_idEd){
            this.province_idSt = province_idSt;
            this.province_idEd = province_idEd;
            return this;
        }

        public ConditionBuilder province_idGreaterEqThan(Integer province_idSt){
            this.province_idSt = province_idSt;
            return this;
        }
        public ConditionBuilder province_idLessEqThan(Integer province_idEd){
            this.province_idEd = province_idEd;
            return this;
        }


        public ConditionBuilder province_idList(Integer ... province_id){
            this.province_idList = solveNullList(province_id);
            return this;
        }

        public ConditionBuilder province_idList(List<Integer> province_id){
            this.province_idList = province_id;
            return this;
        }

        public ConditionBuilder fuzzyProvince_name (List<String> fuzzyProvince_name){
            this.fuzzyProvince_name = fuzzyProvince_name;
            return this;
        }

        public ConditionBuilder fuzzyProvince_name (String ... fuzzyProvince_name){
            this.fuzzyProvince_name = solveNullList(fuzzyProvince_name);
            return this;
        }

        public ConditionBuilder rightFuzzyProvince_name (List<String> rightFuzzyProvince_name){
            this.rightFuzzyProvince_name = rightFuzzyProvince_name;
            return this;
        }

        public ConditionBuilder rightFuzzyProvince_name (String ... rightFuzzyProvince_name){
            this.rightFuzzyProvince_name = solveNullList(rightFuzzyProvince_name);
            return this;
        }

        public ConditionBuilder province_nameList(String ... province_name){
            this.province_nameList = solveNullList(province_name);
            return this;
        }

        public ConditionBuilder province_nameList(List<String> province_name){
            this.province_nameList = province_name;
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

        private Provinces obj;

        public Builder(){
            this.obj = new Provinces();
        }

        public Builder province_id(Integer province_id){
            this.obj.setProvince_id(province_id);
            return this;
        }
        public Builder province_name(String province_name){
            this.obj.setProvince_name(province_name);
            return this;
        }
        public Provinces build(){return obj;}
    }

}
