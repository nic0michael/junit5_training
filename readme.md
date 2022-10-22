# Junit 5 Training 

## Add the folowing Junit Maven dependencies to your POM File
```

    <dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.5.0-M1</version>
		</dependency>

		<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-runner</artifactId>
			<version>1.3.0</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.3.2</version>
			<scope>test</scope>
		</dependency>
                
    </dependencies>
```

## Add the maven-surefire-plugin to the bottom of your POM file
```               
    
    <build>
        <plugins>

            <!-- Need at least 2.22.0 to support JUnit 5 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M3</version>
            </plugin>

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>

        </plugins>
    </build>  
</project>

```

## The Project Code is fould here:


## The Unit Tests are found here:

