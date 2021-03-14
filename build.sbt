resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "scalajs-cli-demo"
scalaVersion := "2.12.11"
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("HelloWorldApp")
moduleName in fullOptJS := "scalajs-cli-demo"
libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"
