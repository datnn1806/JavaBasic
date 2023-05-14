package DTO;

public class CourseDTO {
	private Long course_id;
	private Long subject_id;
	private String course_code;
	private String title;
	private String number_of_credits;
	
	@Override
	public String toString() {
		return "CourseDTO [course_id=" + course_id + ", subject_id=" + subject_id + ", course_code=" + course_code
				+ ", title=" + title + ", number_of_credits=" + number_of_credits + "]";
	}

	public CourseDTO(Long course_id, Long subject_id, String course_code, String title, String number_of_credits) {
		this.course_id = course_id;
		this.subject_id = subject_id;
		this.course_code = course_code;
		this.title = title;
		this.number_of_credits = number_of_credits;
	}
	
	public Long getCourse_id() {
		return course_id;
	}
	public Long getSubject_id() {
		return subject_id;
	}
	public String getCourse_code() {
		return course_code;
	}
	public String getTitle() {
		return title;
	}
	public String getNumber_of_credits() {
		return number_of_credits;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}
	public void setSubject_id(Long subject_id) {
		this.subject_id = subject_id;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNumber_of_credits(String number_of_credits) {
		this.number_of_credits = number_of_credits;
	}
	
	
}
