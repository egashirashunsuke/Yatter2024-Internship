import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.getViewModel

//pageでは、viewmodelから値を取り、UIで使用する値を渡す
@Composable
fun LoginPage(
    viewModel: LoginViewModel = getViewModel(),
){
    val uiState: LoginUiState by
            viewModel.uiState.collectAsStateWithLifecycle()
    LoginTemplate(
        userName = uiState.loginBindingModel.username,
        onChangeUsername = viewModel::onChangedUsername,
        password = uiState.loginBindingModel.password,
        onChangePassword = viewModel::onChangedPassword,
        isEnableLogin = uiState.isEnableLogin,
        isLoading = uiState.isLoading,
        onClickLogin = viewModel::onClickLogin,
        onClickRegister = viewModel::onClickRegister,
    )

    val destination by viewModel.destination.collectAsStateWithLifecycle()
    val navController = LocalNavController.current
    LaunchedEffect(destination) {
        destination?.let {
            it.navigate(navController)
            viewModel.onCompleteNavigation()
        }
    }
}
