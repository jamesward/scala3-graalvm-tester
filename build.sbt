enablePlugins(GraalVMNativeImagePlugin)

scalaVersion := "3.1.0"

graalVMNativeImageOptions := Seq(
  "--verbose"
)

graalVMNativeImageGraalVersion := Some("21.3.0")

lazy val packageWithFallback = taskKey[File]("packageWithFallback")

packageWithFallback := {
  (GraalVMNativeImage / packageBin).value
}

lazy val packageWithNoFallback = taskKey[File]("packageWithNoFallback")

packageWithNoFallback / graalVMNativeImageOptions += "--no-fallback"

packageWithNoFallback := {
  val newState = state.value.appendWithSession(Seq(graalVMNativeImageOptions += "--no-fallback"))
  Project.extract(newState).runTask(GraalVMNativeImage / packageBin, newState)._2
}
