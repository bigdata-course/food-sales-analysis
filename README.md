# food-sales-analysis

# Software Development Environment
--Java JDK1.8.0_101  
--apache-tomcat-8.5.6  
--apache-maven-3.3.9  
--SQL Server 2008 R2  
--IntelliJ IDEA 2016.2.4(64)  
--springMVC  
--hibernate  

# database connection
--please change the databasename,username,password of sql server in mvc-dispather-servlet.xml  
    --make sure the sql server open remote connection service :http://blog.chinaunix.net/uid-20726500-id-3876569.html   
    --install the sqljdbc4.jar, maven don't include this jar :http://www.cnblogs.com/jtlgb/p/5953595.html  


# database  
--the sql script is too large, use cmd inport: sqlcmd -i **.sql -d databasename -s 127.0.0.1  
