using System;
using System.Collections.Generic;


namespace myWebApp.Models
{
	public class StudentRegistration
	{
		List<Student> studentList;
		static StudentRegistration stdregd = null;
		
		private StudentRegistration()
		{
			studentList = new List<Student>();
		}

		public static StudentRegistration getInstance()
		{
			if (stdregd == null)
			{
				stdregd = new StudentRegistration();
				return stdregd;
			}
			else 
			{
				return stdregd;
			}
		}

		public void Add(Student student)
		{
			studentList.Add(student);
		}

		public String Remove(String registrationNumber)
		{
			for (int i = 0; i < studentList.Count; i++)
			{
				Student student = studentList[i];
				if (student.RegistrationNumber.Equals(registrationNumber))
				{
					studentList.RemoveAt(i);
					return "Delete successful";
				}
			}
			return "Delete un-successful";
		}

		public List<Student> getAllStudents()
		{
			return studentList;
		}

		public String UpdateStudent(Student student)
		{
			for (int i = 0; i < studentList.Count; i++)
			{
				Student s = studentList[i];
				if (s.RegistrationNumber.Equals(student.RegistrationNumber))
				{
					studentList[i] = student;
					return "Update successful";
				}
			}
			return "Update un-successful";
		}
	}
}


