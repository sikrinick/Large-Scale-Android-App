package pl.softwarealchemy.lsaa.feature.settings.licenses

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.softwarealchemy.lsaa.feature.settings.R

@Composable
fun LicensesUi() {
    MaterialTheme {
        Scaffold(
            topBar = { Toolbar() },
            content = {
                // noop
            }
        )
    }
}

@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.licenses_title)) },
        elevation = 2.dp
    )
}

@Preview(
    showBackground = true
)
@Composable
private fun Preview_Normal() {
    LicensesUi()
}
