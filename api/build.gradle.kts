val commonVersion: String by project

dependencies {
    implementation(project(":domain:board"))
    implementation(project(":domain:user"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}
