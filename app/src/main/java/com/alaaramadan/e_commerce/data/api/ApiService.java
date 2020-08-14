package com.alaaramadan.e_commerce.data.api;




public interface ApiService {
   /* //AUTH
    @POST("login")
    @FormUrlEncoded
    Call<Login> setDataLogin(@Field("name") String name,
                             @Field("password") String password);

    //REGISTER
    @POST("register")
    @FormUrlEncoded
    Call<Register> setDataRegister(@Field("name") String name,
                                   @Field("email") String email,
                                   @Field("phone") String phone,
                                   @Field("password") String password,
                                   @Field("password_confirmation") String password_confirmation,
                                   @Field("gender") String gender
    );
    @POST("post-toggle-favourite")
    @FormUrlEncoded
    Call<PostFavourite> setCourseInFavourite(@Field("course_id") int course_id,
                                             @Field("api_token") String api_token
    );
    @GET("lessons")
    Call<ShowLessonOfCourses> getLessonOfCourse(@Query("course_id") int course_id,
                                                @Query("api_token") String api_token);


    //GetNameClasses
    @GET("class")
    Call<ListClassName> getClassName(@Query("api_token") String api_token
    );

    @GET("get-subjects")
    Call<ListSubjectName> getSubjectName(@Query("api_token") String Api_tokenSubject
    );

    @GET("my-favourites")
    Call<MyFavouriteCourses> getFavouriteCourses(@Query("api_token") String api_token,
                                                 @Query("page") int page
    );

    @GET("subjects")
    Call<ListSubjectCourses> getSubjectCourse(@Query("subject_id") int Subject_id,
                                              @Query("api_token") String Api_tokenSubjectCourses
    );

    @POST("reset-password")
    @FormUrlEncoded
    Call<ResetPassword> setDataResetPasswod(@Field("phone") String Phone);

    @POST("new-password")
    @FormUrlEncoded
    Call<ResetPassword> setDataNewPasswod(@Field("pin_code") String pin_code,
                                          @Field("password") String new_password,
                                          @Field("password_confirmation") String new_password_confirmation);

    */

//    //AUTH
//    @POST("login")
//    @FormUrlEncoded
//    Single<Auth> onLogin(@Field("phone") String phone,
//                         @Field("local") String local);
//
//    //AUTH
//    @POST("logout")
//    @FormUrlEncoded
//    Single<NullResponse> onLogout(@Header("Authorization") String Authorization,
//                                  @Field("token") String token);
//
//    @POST("confirm-account")
//    @FormUrlEncoded
//    Single<Auth> onActiveSession(@Field("phone") String api_token,
//                                 @Field("pin_code") String pin_code,
//                                 @Field("token") String token,
//                                 @Field("os") String os,
//                                 @Field("local") String local);
//
//
//    @POST("accept-privacy")
//    @FormUrlEncoded
//    Single<Auth> onAcceptCondition(@Header("Authorization") String token,
//                                   @Field("local") String local);
//
//
//    @POST("resend-pin-code")
//    @FormUrlEncoded
//    Single<Auth> onResendCode(@Field("phone") String phone,
//                              @Field("local") String local);
//
//    //end AUTH
//
//    @GET("categories")
//    Single<Category> getCategories(@Query("local") String local);
//
//
//    @GET("stores")
//    Single<Store> getStores(@Query("category_id") int categoryId,
//                            @Query("sub_category_id") int subCategoryId,
//                            @Query("name") String name,
//                            @Query("latitude") String latitude,
//                            @Query("longitude") String longitude,
//                            @Query("page") int page,
//                            @Query("local") String local);
//
//    @GET("show-addresses")
//    Single<Address> getAddress(@Header("Authorization") String token,
//                               @Query("local") String local);
//
//    @POST("add-address")
//    @FormUrlEncoded
//    Single<AddAddress> addAddress(@Header("Authorization") String token,
//                                  @Field("title") String title,
//                                  @Field("latitude") String latitude,
//                                  @Field("longitude") String longitude,
//                                  @Field("local") String local);
//
//    @GET("store-products")
//    Single<Products> getProducts(@Header("Authorization") String token,
//                                 @Query("store_id") int storeId,
//                                 @Query("category_id") int categoryId,
//                                 @Query("name") String name,
//                                 @Query("page") int page,
//                                 @Query("local") String local);
//
//    @POST("add-to-cart")
//    @FormUrlEncoded
//    Single<NullResponse> addToCart(@Header("Authorization") String token,
//                                   @Field("product_id") int productId,
//                                   @Field("store_id") int storeId,
//                                   @Field("quantity") String quantity,
//                                   @Field("addition[]") List<Integer> addition,
//                                   @Field("addition_quantity[]") List<Integer> addition_quantity,
//                                   @Field("local") String local);
//
//    @POST("add-written-product-to-order")
//    @Multipart
//    Single<NullResponse> writeOrderForCart(@Header("Authorization") String token,
//                                           @Part("type") RequestBody type,
//                                           @Part("store_id") RequestBody storeId,
//                                           @Part("text") RequestBody quantity,
//                                           @Part MultipartBody.Part photo,
//                                           @Part("local") String local);
//
//    @POST("edit-addition-quantity")
//    @FormUrlEncoded
//    Single<NullResponse> editCart(@Header("Authorization") String token,
//                                  @Field("product_id") int productId,
//                                  @Field("quantity") String quantity,
//                                  @Field("addition_id") int addition);
//
//    @POST("edit-product-quantity")
//    @FormUrlEncoded
//    Single<NullResponse> editCart(@Header("Authorization") String token,
//                                  @Field("product_id") int productId,
//                                  @Field("quantity") int quantity);
//
//    @POST("remove-from-cart")
//    @FormUrlEncoded
//    Single<NullResponse> deleteForCart(@Header("Authorization") String token,
//                                       @Field("product_id") int productId);
//
//    @GET("offers")
//    Single<Products> getOffers(@Header("Authorization") String token,
//                               @Query("category_id") int categoryId,
//                               @Query("name") String name,
//                               @Query("page") int page,
//                               @Query("local") String local);
//
//    @GET("governorates")
//    Single<GeneralResponse> getGoverns();
//
//
//    @POST("add-delivery")
//    @Multipart
//    Single<NullResponse> joinAsDelivery(@Part("name") RequestBody name,
//                                        @Part("user_name") RequestBody user_name,
//                                        @Part("region_id") RequestBody region_id,
//                                        @Part("gender") RequestBody gender,
//                                        @Part("phone") RequestBody phone,
//                                        @Part("d_o_b") RequestBody d_o_b,
//                                        @Part MultipartBody.Part id_card_photo,
//                                        @Part MultipartBody.Part transport_photo);
//
//    @POST("add-store")
//    @FormUrlEncoded
//    Single<NullResponse> joinAsShop(@Field("phone") String phone,
//                                    @Field("region_id") int region_id,
//                                    @Field("name") String name,
//                                    @Field("user_name") String user_name,
//                                    @Field("category") String category,
//                                    @Field("owner_name") String owner_name);
//
//    @GET("list-cart")
//    Single<Cart> getCart(@Header("Authorization") String token,
//                         @Query("page") int page,
//                         @Query("local") String local);
//
//
////    @POST("edit-addition-quantity")
////    @FormUrlEncoded
////    Call<NullResponse> editAddition(@Field("product_id") int product_id,
////                                    @Field("addition_id") int addition_id,
////                                    @Field("quantity") String quantity);
////
////    @GET("store-categories")
////    Call<RestaurantCategories> getRestaurantCategories(@Query("store_id")int store_id);
//
//
//    @POST("log-mobile-app")
//    @FormUrlEncoded
//    Single<NullResponse> registerException(@Field("line") int line,
//                                           @Field("class_name") String class_name,
//                                           @Field("function_name") String function_name,
//                                           @Field("exception_message") String exception_message,
//                                           @Field("type") String type);
//
//
//    @GET("cities")
//    Call<GeneralResponse> getCity(@Query("governorate_id") int governorate_id);
//
//    @GET("regions")
//    Call<GeneralResponse> getRegions(@Query("city_id") int city_id);
//
//    @POST("update-profile")
//    @FormUrlEncoded
//    Single<Auth> updateProfile(@Field("phone") String phone,
//                               @Field("name") String name,
//                               @Field("gender") String gender,
//                               @Field("d_o_b") String d_o_b);
//
//
//    @POST("add-credit-card")
//    @FormUrlEncoded
//    Single<NullResponse> addCreditCard(@Field("name") String name,
//                                       @Field("number") String number,
//                                       @Field("cvv_code") String cvv_code,
//                                       @Field("expired_year") String expired_year,
//                                       @Field("expired_month") String expired_month,
//                                       @Header("Authorization") String token);
//
//    @POST("recharge-wallet")
//    @FormUrlEncoded
//    Single<NullResponse> rechargeWallet(@Field("type") String type,
//                                        @Field("amount") String amount,
//                                        @Header("Authorization") String token);
//
//
//    @GET("list-credit-card")
//    Call<CreditsList> getCredits(@Header("Authorization") String token);
}
