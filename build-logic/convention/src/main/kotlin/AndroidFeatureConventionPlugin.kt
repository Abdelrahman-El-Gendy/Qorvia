import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("qorvia.android.library")
                apply("qorvia.android.compose")
                apply("qorvia.hilt")
            }
        }
    }
}
