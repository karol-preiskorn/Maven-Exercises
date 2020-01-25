# exercises maven

## auto clean

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

## create executable jar

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