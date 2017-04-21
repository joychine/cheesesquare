
def a = [1, 2, 3, 33, 22, 11]



a.each { println "遍历："+it}

for(int var:a){
    System.out.println("var:"+var)
}

def targetFile = new File("settings.gradle")

    targetFile.eachLine({
        String str ->
            println (new String(str.getBytes(),"utf-8"));
                println "data:$str";

    })

println new String(targetFile.readBytes(),"utf-8");

 abcd = 1  //def定义 的是局部变量，会存在于 编译后的test.class 类的run()方法中。

def printabcd(){ //方法无法访问上面 def定义的局部变量。
    println abcd
}
printabcd()



def myFunc( str,Closure clourse){
    clourse.call(str);
}

myFunc 1122 {println it}

