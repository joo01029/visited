
val commonVersion: String by project

dependencies {
    implementation(project(":core"))
    implementation(project(":domain:user"))
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
