using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using  myWebApp.Models;


namespace myWebApp.Controllers 
{
    [Route("api/[controller]")]
    [ApiController]
    internal class StudentRegistrationController : Controller 
    {
        // POST: api/<controller>
        [Route("api/studentregistration/registerstudent")]
        [HttpPost]
        public StudentRegistrationReply RegisterStudent(Student student)
        {
            // TODO: pass in a student to the refgistration reply 
            Console.WriteLine("In registerStudent");
            StudentRegistrationReply stdregreply = new StudentRegistrationReply(student);
            StudentRegistration.getInstance().Add(student);
            stdregreply.RegistrationStatus = "Successful";
            return stdregreply;
        }
        
        [Route("api/studentregistration/insertstudent")]
        [HttpPost]
        public IActionResult InsertStudent(Student student)
        {
            Console.WriteLine("In insertStudent");
            StudentRegistrationReply stdregreply = new StudentRegistrationReply(student);
            StudentRegistration.getInstance().Add(student);
            stdregreply.RegistrationStatus = "Successful";
            return Ok(stdregreply);
        }
        [Route("api/studentregistration/addstudent/")]
        [HttpPost]
        public JsonResult AddStudent(Student student)
        {
            Console.WriteLine("In addStudent");
            StudentRegistrationReply stdregreply = new StudentRegistrationReply(student);
            StudentRegistration.getInstance().Add(student);
            stdregreply.RegistrationStatus = "Successful";
            return Json(stdregreply);
        }
    }

}