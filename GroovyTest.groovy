package com.jizhang.test.first

/**
 * Created by seven-ye on 2016/10/30.
 */
class GroovyTest {
    def static str = "hello groovy!";
    public static void main(String[] args) {
        GroovyTest gt = new GroovyTest();
        println(str);
        gt.func1('fd',12);
        println(gt.str1);
    }

    def func1(a,b){
        println("Your name is: "+a+" and your age is: " + b);
    }

    def funcStr(str){
        return "韩红新歌-->:${str}";
    }

    def str1 = funcStr("远方的孩子");

    def funcList(list){
        def myrange = 25 .. 10;
        println(list);

        myrange = 11 .. 19
        println(myrange);

        println("First element of collection is: "+myrange[0]);
        println("Last element of collection is: "+myrange[-1]);
        println("Sub collection: " + myrange[2,5]);
        println("Reverse: " + myrange.reverse());
        println("Remove element: " + (myrange - 18));
        println("Remove sub collection: " + (myrange - [12,13,14,15]));

        def coll = ["C","C++","Java","JavaScript","Python"]
        println("Program anguages you're knowing: "+coll);
        coll.add("Groovy");
        println("Now you're learning: " + coll[-1])

        coll = coll*.toUpperCase()
        println(coll);

        coll = coll[-1].toLowerCase();
        println(coll)
    }

    def funcFor(list,repeat){
        println(list);
        for (int i = 0; i < repeat; i++) {
            print(list[i]+",");
        }
    }

    def funcMap(){
        def mymap = ["name":"Diego",age:30,hobbies:["Football","Reading","Bible"]]
        println("Your name is "+ mymap["name"] +" ,age is "+mymap["age"]+" ,hobbies: " + mymap["hobbies"]);

        //add element
        mymap.location = "Shenzhen"
        println(mymap);

        //loop map by closure.
        mymap.each{key,value->
            println("Key: "+key+",value: "+value);
        }
    }

    //闭包测试
    def funcClosure(){
        def mydata = ["Java","Groovy","JavaScript"]

        for (i in 0..2){
            printUpperCase(mydata[i]);
        }

        println("use closure=====================");
        mydata.each{
            println(it.toUpperCase());
        }

        println("def closure=====================");

        def myclosure = {myvar->
            println(myvar.toUpperCase());
        }

        mydata.each(myclosure);


        println("closure and map=====================");
        def mymap = ["name":"Diego",age:30,hobbies:["Football","Reading","Bible"]]
        mymap.each{key,value->
            println("key is: "+key+" and value is: " + value);
        }
        println("closure and string=====================");
        def mystring= "Diego"
        mystring.each{s->
            print(s+",");
        }
    }

    def printUpperCase(a){
        println(a.toUpperCase());
    }
}
