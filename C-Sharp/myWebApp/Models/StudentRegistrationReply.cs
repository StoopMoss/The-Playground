using System;

namespace myWebApp.Models
{
    public class StudentRegistrationReply : Student 
    {
        public StudentRegistrationReply(Student student)
        {
            // Generate a reply from the student
            base.Age = student.Age;
            base.Name = student.Name;
            base.RegistrationNumber = student.RegistrationNumber;
        }

        String registrationStatus;
        public String RegistrationStatus
        {
            get { return registrationStatus; }
            set { registrationStatus = value; }
        }    
    }
}
