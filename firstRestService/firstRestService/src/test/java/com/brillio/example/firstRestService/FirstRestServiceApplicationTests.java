package com.brillio.example.firstRestService;

import com.brillio.example.firstRestService.Controllers.MyRestController;
import com.brillio.example.firstRestService.Controllers.PostController;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class FirstRestServiceApplicationTests {

	@Autowired
	MyRestController restController;

	@Autowired
	PostController postController;

	@Test
	public void testDTOAvailableOrNot(){
		try {
			StudentDTO studentDTO = new StudentDTO();
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testDTOAvailableOrNot1(){
		try {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.getAddress();
			studentDTO.getDob();
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testController(){
		try {
			List<StudentDTO> list = restController.getAllStudents();
			if(list == null){
				throw new Exception();
			}
		}catch(Exception e){
			fail();
		}
	}


	@Test
	public void testController2(){
		try {
			List<StudentDTO> list = restController.getAllStudents();
			assertEquals(list.get(0).getSid(), "s101");
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testController3(){
		try {
			Optional<StudentDTO> list = restController.getStudentById("s101");
			assertNotNull(list);
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testController4(){
		try {
			Optional<StudentDTO> list = restController.getStudentById("s113");
			assertEquals(list, Optional.empty());
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testPostControllerInsert(){
		try {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setSid("s111");
			studentDTO.setFname("Alans");
			studentDTO.setLname("Hey");
			studentDTO.setDob("1999-12-12");
			studentDTO.setAddress("Satna");

			String result = postController.insertStudent(studentDTO);
			assertEquals(result, "Data is inserted");
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testPostControllerUpdate(){
		try {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setSid("s109");
			studentDTO.setFname("Alans");
			studentDTO.setLname("Hey");
			studentDTO.setDob("1999-12-12");
			studentDTO.setAddress("Patna");

			String result = postController.updateStudent(studentDTO);
			assertEquals(result, "Data is updated");
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testPostControllerPatch(){
		try {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setSid("s103");
			studentDTO.setFname("Arsha");


			String result = postController.patchStudent(studentDTO);
			assertEquals(result, "Data is patched");
		}catch(Exception e){
			fail();
		}
	}

	@Test
	public void testPostControllerDelete(){
		try {
			String result = postController.deleteStudent("s111");
			assertEquals(result, "Data is deleted");
		}catch(Exception e){
			fail();
		}
	}




}
