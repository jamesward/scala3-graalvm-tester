enablePlugins(NativeImagePlugin)

scalaVersion := "3.1.0"

Compile / mainClass := Some("run")

nativeImageOptions := Seq(
  "--verbose",
  "--no-fallback",
)

nativeImageVersion := "21.3.0"