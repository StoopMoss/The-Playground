using System;
using System.Collections.Generic;
using myWebApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace myWebApp.Controllers
{
    [ApiController]
    internal class StudentRetrieveController : Controller
    {   
        // GET: api/<Retrieve>
        [Route("api/studentretrieve/getallstudents")]
        [HttpGet]
        public List<Student> GetAllStudents()
        {
            return StudentRegistration.getInstance().getAllStudents();
        }
        [Route("api/studentretrieve/getallstudentrecords")]
        [HttpGet]
        public JsonResult GetAllStudentRecords()
        {
            return Json(StudentRegistration.getInstance().getAllStudents());
        }

    }
}