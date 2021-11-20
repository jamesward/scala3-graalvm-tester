enablePlugins(GraalVMNativeImagePlugin)

scalaVersion := "3.1.0"

graalVMNativeImageOptions := Seq(
  "--verbose",
  "--no-fallback",
)

graalVMNativeImageGraalVersion := Some("21.3.0")