



	s/w 
	-----------------
	
	  1. application   ==> process	
	  2. data-source    ==> persist
	  
	  	  e.g
	  	  
	  	  	 - flat-files
	  	  	 - databases
	  	  	 - cloud data providers
	  	  	   ........
	  	  	   
	  	  	   
	  	 most used data-sources => relational(sql)-databases
	  	 
	  	 
	 -------------------------------------------------- 	 
	 
	 
	 s/w design models
	 
	 
	 a. application
	 
	 			==> object-model
	 			
	 b. relational-databases
	 
	            => relational model
	            
	 --------------------------------------------------
	 
	 
	 ORM ( Object Relational Mapping  )
	 
	 
	 
	 ---------------------------------------------------
	 
	 How to implement ORM in java-based application :
	 
	 
	   using 'JDBC api' ( java.sql.* )
	   
	----------------------------------------------------
	
	basic step to use JDBC API
	
	1. register 'JDBC-driver' with API
	2. create connection with db-server with URL,userName & password
	
	3. create jdbc-statements with SQL
	4. execute statements & process resultset
	
	5. Handle SQL Exceptipon
	6. optionally , manage Transactions ( commit & rollbacks )
	
	7. close connection ( on any reason )
	
	-----------------------------------------------------------
	
	
	
	shopIT
	------
	
		- Product
		- Reviews
		

     relational-model
     -----------------
     
     table(s)  
     
     ==> PRODUCTS
     
     
     object-model
     --------------
     
     ==> Product
     
    
     ----------------------------------------------------------------------
     
     Layer (s )
     
     	==> logical code organization
     
     
     common-layer (s)
     
     1. dao/data/repository layer  ==> data accessing logic
     2. service layer              ==> data processing logic
     
     
     --------------------------------------------------------- 
     
     
 					
  
      
      
      
         									
	   
	 
	 
	 
	 
	 
	 
	 
	            			
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 