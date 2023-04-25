enablePlugins(NativeImagePlugin)

scalaVersion := "3.3.0-RC2"

Compile / mainClass := Some("run")

nativeImageOptions := Seq(
  "--verbose",
  "--no-fallback",
)

nativeImageJvm := "graalvm-java17"

nativeImageVersion := "22.3.1"
