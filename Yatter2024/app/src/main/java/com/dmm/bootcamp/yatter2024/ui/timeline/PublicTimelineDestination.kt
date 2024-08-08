import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.composable
import com.dmm.bootcamp.yatter2024.common.navigation.Destination
import java.lang.StringBuilder

class PublicTimelineDestination(
    builder: (NavOptionsBuilder.() -> Unit)? = null,
) : Destination(ROUTE,builder) {
    companion object {
        private const val ROUTE = "publicTimeline"

        fun createNode(builder:NavGraphBuilder) {
            builder.composable(ROUTE) {
                PublicTimelinePage()
            }
        }
    }
}