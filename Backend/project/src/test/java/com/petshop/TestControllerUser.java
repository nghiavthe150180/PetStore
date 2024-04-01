//package com.petshop;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)//đang để nó chạy test thì clean trước khi test
//@ExtendWith(SpringExtension.class)// intergrate
//@AutoConfigureMockMvc // cái quan trọng nhất trong test MockMvc
//public class TestControllerUser {
//    private MockMvc mockMvc;
//    private ObjectMapper objectMapper;
//    @Autowired
//    public TestControllerUser(MockMvc mockMvc) {
//        this.mockMvc = mockMvc;
//        this.objectMapper = new ObjectMapper();
//    }
//    @Test
//    public void TestCreateUserWithHttpCreated() throws Exception {
//        User testuser = User.builder()
//                .userId(null)
//                .userName("testuser")
//                .email("testemail@gamil.com")
//                .role("customer")
//                .firstname("Testfirstname")
//                .lastname("TestlastName")
//                .password("123456")
//                .phoneNumber("1234568")
//                .status(1).build();
//        String userJSON = objectMapper.writeValueAsString(testuser);
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/api/users/create")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(userJSON)
//        ).andExpect(
//                MockMvcResultMatchers.status().isCreated()
//        );
//    }
//    @Test
//    public void TestCreateUserWithReturnUser() throws Exception {
//        User testuser = User.builder()
//                .userId(null)
//                .userName("testuser1")
//                .email("testemail1@gamil.com")
//                .role("customer")
//                .firstname("Testfirstname1")
//                .lastname("TestlastName1")
//                .password("123456222")
//                .phoneNumber("123456822")
//                .status(1).build();
//        String userJSON = objectMapper.writeValueAsString(testuser);
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/api/users/create")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(userJSON)
//        ).andExpect(
//                MockMvcResultMatchers.status().isCreated()
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.userId").isNumber()
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.userName").value("testuser1")
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.firstname").value("Testfirstname1")
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.lastname").value("TestlastName1")
//        )
//        ;
//    }
//}
