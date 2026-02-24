package com.qorvia.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun QorviaTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkColorScheme(
            primary = QorviaColors.Primary,
            secondary = QorviaColors.Secondary,
            background = QorviaColors.Background,
            surface = QorviaColors.Surface,
            error = QorviaColors.Error,
            onPrimary = Color.White,
            onSecondary = Color.White,
            onBackground = QorviaColors.OnSurface,
            onSurface = QorviaColors.OnSurface
        ) else lightColorScheme(),
        typography = QorviaTypography,
        shapes = QorviaShapes,
        content = content
    )
}
