allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

dependencies{
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")

//    implementation("com.querydsl:querydsl-jpa")
//    implementation("com.querydsl:querydsl-core")
//    kapt(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
