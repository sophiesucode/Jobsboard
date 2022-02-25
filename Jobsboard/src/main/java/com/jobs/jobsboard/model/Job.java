package com.jobs.jobsboard.model;

public class Job {
    private Long id;

    private String experience_level;

    private String job_title;

    private String job_description;

    private String location;

    private int date_posted;

  public Job(){

  }

    public Job(Long id, String job_title, String experience_level, String job_description, String location, int date_posted) {
        this.id = id;
        this.job_title = job_title;
        this.experience_level = experience_level;
        this.job_description = job_description;
        this.location = location;
        this.date_posted = date_posted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExperience_level() {
        return experience_level;
    }

    public void setExperience_level(String experience_level) {
        this.experience_level = experience_level;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(int date_posted) {
        this.date_posted = date_posted;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", experience_level='" + experience_level + '\'' +
                ", job_title='" + job_title + '\'' +
                ", job_description='" + job_description + '\'' +
                ", location='" + location + '\'' +
                ", date_posted=" + date_posted +
                '}';
    }
}
