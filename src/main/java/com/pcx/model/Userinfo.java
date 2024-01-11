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
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1704800078890L;


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

    /**
    * 
    * isNullAble:1
    */
    private String nickname;

    /**
    * 
    * isNullAble:1
    */
    private String gender;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate birthdate;

    /**
    * 
    * isNullAble:1
    */
    private Integer province_id;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setPassword_hash(String password_hash){this.password_hash = password_hash;}

    public String getPassword_hash(){return this.password_hash;}

    public void setNickname(String nickname){this.nickname = nickname;}

    public String getNickname(){return this.nickname;}

    public void setGender(String gender){this.gender = gender;}

    public String getGender(){return this.gender;}

    public void setBirthdate(java.time.LocalDate birthdate){this.birthdate = birthdate;}

    public java.time.LocalDate getBirthdate(){return this.birthdate;}

    public void setProvince_id(Integer province_id){this.province_id = province_id;}

    public Integer getProvince_id(){return this.province_id;}
    @Override
    public String toString() {
        return "Userinfo{" +
                "id='" + id + '\'' +
                "password_hash='" + password_hash + '\'' +
                "nickname='" + nickname + '\'' +
                "gender='" + gender + '\'' +
                "birthdate='" + birthdate + '\'' +
                "province_id='" + province_id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Userinfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(Userinfo set){
            this.set = set;
            return this;
        }

        public Userinfo getSet(){
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

    public static class QueryBuilder extends Userinfo{
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
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> genderList;

        public List<String> getGenderList(){return this.genderList;}


        private List<String> fuzzyGender;

        public List<String> getFuzzyGender(){return this.fuzzyGender;}

        private List<String> rightFuzzyGender;

        public List<String> getRightFuzzyGender(){return this.rightFuzzyGender;}
        private List<java.time.LocalDate> birthdateList;

        public List<java.time.LocalDate> getBirthdateList(){return this.birthdateList;}

        private java.time.LocalDate birthdateSt;

        private java.time.LocalDate birthdateEd;

        public java.time.LocalDate getBirthdateSt(){return this.birthdateSt;}

        public java.time.LocalDate getBirthdateEd(){return this.birthdateEd;}

        private List<Integer> province_idList;

        public List<Integer> getProvince_idList(){return this.province_idList;}

        private Integer province_idSt;

        private Integer province_idEd;

        public Integer getProvince_idSt(){return this.province_idSt;}

        public Integer getProvince_idEd(){return this.province_idEd;}

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

        public QueryBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public QueryBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public QueryBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public QueryBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public QueryBuilder nickname(String nickname){
            setNickname(nickname);
            return this;
        }

        public QueryBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public QueryBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public QueryBuilder fetchNickname(){
            setFetchFields("fetchFields","nickname");
            return this;
        }

        public QueryBuilder excludeNickname(){
            setFetchFields("excludeFields","nickname");
            return this;
        }

        public QueryBuilder fuzzyGender (List<String> fuzzyGender){
            this.fuzzyGender = fuzzyGender;
            return this;
        }

        public QueryBuilder fuzzyGender (String ... fuzzyGender){
            this.fuzzyGender = solveNullList(fuzzyGender);
            return this;
        }

        public QueryBuilder rightFuzzyGender (List<String> rightFuzzyGender){
            this.rightFuzzyGender = rightFuzzyGender;
            return this;
        }

        public QueryBuilder rightFuzzyGender (String ... rightFuzzyGender){
            this.rightFuzzyGender = solveNullList(rightFuzzyGender);
            return this;
        }

        public QueryBuilder gender(String gender){
            setGender(gender);
            return this;
        }

        public QueryBuilder genderList(String ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public QueryBuilder genderList(List<String> gender){
            this.genderList = gender;
            return this;
        }

        public QueryBuilder fetchGender(){
            setFetchFields("fetchFields","gender");
            return this;
        }

        public QueryBuilder excludeGender(){
            setFetchFields("excludeFields","gender");
            return this;
        }

        public QueryBuilder birthdateBetWeen(java.time.LocalDate birthdateSt,java.time.LocalDate birthdateEd){
            this.birthdateSt = birthdateSt;
            this.birthdateEd = birthdateEd;
            return this;
        }

        public QueryBuilder birthdateGreaterEqThan(java.time.LocalDate birthdateSt){
            this.birthdateSt = birthdateSt;
            return this;
        }
        public QueryBuilder birthdateLessEqThan(java.time.LocalDate birthdateEd){
            this.birthdateEd = birthdateEd;
            return this;
        }


        public QueryBuilder birthdate(java.time.LocalDate birthdate){
            setBirthdate(birthdate);
            return this;
        }

        public QueryBuilder birthdateList(java.time.LocalDate ... birthdate){
            this.birthdateList = solveNullList(birthdate);
            return this;
        }

        public QueryBuilder birthdateList(List<java.time.LocalDate> birthdate){
            this.birthdateList = birthdate;
            return this;
        }

        public QueryBuilder fetchBirthdate(){
            setFetchFields("fetchFields","birthdate");
            return this;
        }

        public QueryBuilder excludeBirthdate(){
            setFetchFields("excludeFields","birthdate");
            return this;
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

        public Userinfo build(){return this;}
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
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> genderList;

        public List<String> getGenderList(){return this.genderList;}


        private List<String> fuzzyGender;

        public List<String> getFuzzyGender(){return this.fuzzyGender;}

        private List<String> rightFuzzyGender;

        public List<String> getRightFuzzyGender(){return this.rightFuzzyGender;}
        private List<java.time.LocalDate> birthdateList;

        public List<java.time.LocalDate> getBirthdateList(){return this.birthdateList;}

        private java.time.LocalDate birthdateSt;

        private java.time.LocalDate birthdateEd;

        public java.time.LocalDate getBirthdateSt(){return this.birthdateSt;}

        public java.time.LocalDate getBirthdateEd(){return this.birthdateEd;}

        private List<Integer> province_idList;

        public List<Integer> getProvince_idList(){return this.province_idList;}

        private Integer province_idSt;

        private Integer province_idEd;

        public Integer getProvince_idSt(){return this.province_idSt;}

        public Integer getProvince_idEd(){return this.province_idEd;}


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

        public ConditionBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public ConditionBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public ConditionBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public ConditionBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public ConditionBuilder fuzzyGender (List<String> fuzzyGender){
            this.fuzzyGender = fuzzyGender;
            return this;
        }

        public ConditionBuilder fuzzyGender (String ... fuzzyGender){
            this.fuzzyGender = solveNullList(fuzzyGender);
            return this;
        }

        public ConditionBuilder rightFuzzyGender (List<String> rightFuzzyGender){
            this.rightFuzzyGender = rightFuzzyGender;
            return this;
        }

        public ConditionBuilder rightFuzzyGender (String ... rightFuzzyGender){
            this.rightFuzzyGender = solveNullList(rightFuzzyGender);
            return this;
        }

        public ConditionBuilder genderList(String ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public ConditionBuilder genderList(List<String> gender){
            this.genderList = gender;
            return this;
        }

        public ConditionBuilder birthdateBetWeen(java.time.LocalDate birthdateSt,java.time.LocalDate birthdateEd){
            this.birthdateSt = birthdateSt;
            this.birthdateEd = birthdateEd;
            return this;
        }

        public ConditionBuilder birthdateGreaterEqThan(java.time.LocalDate birthdateSt){
            this.birthdateSt = birthdateSt;
            return this;
        }
        public ConditionBuilder birthdateLessEqThan(java.time.LocalDate birthdateEd){
            this.birthdateEd = birthdateEd;
            return this;
        }


        public ConditionBuilder birthdateList(java.time.LocalDate ... birthdate){
            this.birthdateList = solveNullList(birthdate);
            return this;
        }

        public ConditionBuilder birthdateList(List<java.time.LocalDate> birthdate){
            this.birthdateList = birthdate;
            return this;
        }

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

        private Userinfo obj;

        public Builder(){
            this.obj = new Userinfo();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder password_hash(String password_hash){
            this.obj.setPassword_hash(password_hash);
            return this;
        }
        public Builder nickname(String nickname){
            this.obj.setNickname(nickname);
            return this;
        }
        public Builder gender(String gender){
            this.obj.setGender(gender);
            return this;
        }
        public Builder birthdate(java.time.LocalDate birthdate){
            this.obj.setBirthdate(birthdate);
            return this;
        }
        public Builder province_id(Integer province_id){
            this.obj.setProvince_id(province_id);
            return this;
        }
        public Userinfo build(){return obj;}
    }

}
