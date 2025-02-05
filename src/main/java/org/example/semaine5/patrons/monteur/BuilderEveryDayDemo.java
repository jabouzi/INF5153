package org.example.semaine5.patrons.monteur;

public class BuilderEveryDayDemo {
    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to a String. ");
        builder.append(42);
        System.out.println(builder.toString());

//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://reqres.in")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build();

    }
}
