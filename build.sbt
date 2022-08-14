enablePlugins(NativeImagePlugin)

scalaVersion := "3.2.0-RC3"

Compile / mainClass := Some("run")

nativeImageOptions := Seq(
  "--verbose",
  "--no-fallback",
)

nativeImageVersion := "21.3.0"