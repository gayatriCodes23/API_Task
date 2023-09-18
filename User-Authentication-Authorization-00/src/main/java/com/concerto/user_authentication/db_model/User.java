//package com.concerto.user_authentication.db_model;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "USER_DETAILS")
//public class User {
//
//	@Column(name = "USER_ID")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String id;
//
//	@Column(name = "USERNAME")
//	private String username;
//
//	@Column(name = "FIRST_NAME")
//	private String firstName;
//
//	@Column(name = "MIDDLE_NAME")
//	private String middleName;
//
//	@Column(name = "LAST_NAME")
//	private String lastName;
//
//	@Column(name = "DATE_OF_BIRTH")
//	private Date dateOfBirth;
//
//	@Column(name = "GENDER")
//	private String gender;
//
//	@Column(name = "CITY/REGION")
//	private String cityRegion;
//
//	@Column(name = "PINCODE")
//	private String pincode;
//
//	@Column(name = "NATIONALITY")
//	private String nationality;
//
//	@Column(name = "EMAIL_ID")
//	private String emailId;
//
//	@Column(name = "COUNTRY_CODE")
//	private String countryCode;
//
//	@Column(name = "MOBILE_NUMBER")
//	private String mobileNumber;
//
//	@Column(name = "PASSWORD")
//	private String password;
//
//	@Column(name = "CONFIRM_PASSWORD")
//	private String confirmPassword;
//
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
//	private Set<Role> role = new HashSet<>();
//
//	public User() {
//	}
//
//	public User(String id, String username, String firstName, String middleName, String lastName, String dateOfBirthStr,
//			String gender, String cityRegion, String pincode, String nationality, String emailId, String countryCode,
//			String mobileNumber, String password, String confirmPassword, Set<Role> role) {
//		this.id = id;
//		this.username = username;
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		try {
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//			this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
//		} catch (ParseException e) {
//			throw new IllegalArgumentException("Invalid date format for dateOfBirth");
//		}
//		this.gender = gender;
//		this.cityRegion = cityRegion;
//		this.pincode = pincode;
//		this.nationality = nationality;
//		this.emailId = emailId;
//		this.countryCode = countryCode;
//		this.mobileNumber = mobileNumber;
//		this.password = password;
//		this.confirmPassword = confirmPassword;
//		this.role = role;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getMiddleName() {
//		return middleName;
//	}
//
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getCityRegion() {
//		return cityRegion;
//	}
//
//	public void setCityRegion(String cityRegion) {
//		this.cityRegion = cityRegion;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
//
//	public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//
//	public String getCountryCode() {
//		return countryCode;
//	}
//
//	public void setCountryCode(String countryCode) {
//		this.countryCode = countryCode;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//
//	public Set<Role> getRole() {
//		return role;
//	}
//
//	public void setRole(Set<Role> role) {
//		this.role = role;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", username=" + username + ", firstName=" + firstName + ", middleName=" + middleName
//				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", cityRegion="
//				+ cityRegion + ", pincode=" + pincode + ", nationality=" + nationality + ", emailId=" + emailId
//				+ ", countryCode=" + countryCode + ", mobileNumber=" + mobileNumber + ", password=" + password
//				+ ", confirmPassword=" + confirmPassword + ", role=" + role + "]";
//	}
//
//}
