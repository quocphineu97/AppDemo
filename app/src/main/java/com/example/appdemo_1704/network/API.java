package com.example.appdemo_1704.network;

 public class API {

      public   static final  String API_ROOT ="https://bkhub.herokuapp.com";
      static final  String LOGIN ="/api/user/login";
      static final  String HEADER ="Content-Type:application/json; charset=UTF-8";
      static final  String REGISTER ="/api/user/register";
      static final  String CREATE_POST ="/api/post";
      static final  String LIKE_POST ="/api/post/like";
      static final  String GET_ALL_FRIEND ="/api/user/get-all";
      static final  String GET_ALL_POST ="/api/post/get-all?";
      static final  String UPDATE_STATUS ="/api/post/{postID}";
      static final  String DELET_STATUS ="/api/post/{postID}";
      static final  String GET_PROFILE ="/api/user/get-detail";
      static final  String UPDATE_AVATAR ="/api/user/update-avatar";
      static final  String CREATE_COMMENT = "/api/post/comment";
      static final  String GET_ALL_COMMENT ="/api/post/get-comment";
      static final String GET_GROUP = "/api/chat/all-group";
      static final String GET_ALL_MESSAGE = "/api/chat/all-message";





 }
