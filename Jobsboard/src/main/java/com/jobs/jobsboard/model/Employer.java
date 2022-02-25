package com.jobs.jobsboard.model;

public class Employer {
}
//public class Category {
//
//    @Id//means primary key
//    @Column
//    @GeneratedValue(strategy= GenerationType.IDENTITY)//equivalent to SERIAL in sql
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String description;
//
//    @OneToMany(mappedBy = "category", orphanRemoval = true)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    private List<Recipe> recipeList;
////    private List<Recipe> recipeList;
//
//    public Category() {
//    }
//
//    public Category(Long id, String name, String description) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
//
//    public List<Recipe> getRecipeList() {
//        return recipeList;
//    }
//
//    public void setRecipeList(List<Recipe> recipeList) {
//        this.recipeList = recipeList;
//    }
//}
