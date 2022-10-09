
val commonVersion: String by project

dependencies {
    implementation(project(":core"))
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
