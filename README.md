# Project used as an example for Maven training

- [Karol Preiskorn](https://www.linkedin.com/in/kpreiskorn/)
- http://ultimasolution.pl

## Problem sourceEncoding & outputEncoding

```maven
    <properties>
        <project.build.sourceEncoding>utf-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>utf-8</project.reporting.outputEncoding>
        <javaversion>13</javaversion>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
```

# Ex0

## Main

```java
public class HelloWorld {
    public void main(String[] arg){
        System.out.println("Hello World");
    }
}
```

## MainTest

# Ex1

Useful customization for Maven lifecycle: `clean` all before lifecycle: `package`.

## auto clean
```maven
    <plugin>
        <artifactId>maven-clean-plugin</artifactId>
        <version>3.1.0</version>
        <executions>
            <execution>
                <id>auto-clean</id>
                <phase>initialize</phase>
                <goals><goal>clean</goal></goals>
            </execution>
        </executions>
    </plugin>
```
## create executable jar
```maven
    <plugin>x
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.2.0</version>
        <configuration>
            <archive>
                <manifest>
                    <mainClass>HelloWorld</mainClass>
                </manifest>
            </archive>
        </configuration>
        <executions>
            <execution>
                <goals>
                    <goal>test-jar</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
```
# Ex2


