package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) {
            return _githubLogo!!
        }
        _githubLogo = Builder(name = "GithubLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.13f, 75.92f)
                arcTo(57.79f, 57.79f, 0.0f, false, false, 201.2f, 29.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, -3.0f)
                arcToRelative(57.77f, 57.77f, 0.0f, false, false, -47.0f, 24.0f)
                horizontalLineTo(123.0f)
                arcTo(57.77f, 57.77f, 0.0f, false, false, 76.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, 3.0f)
                arcToRelative(57.79f, 57.79f, 0.0f, false, false, -4.93f, 46.92f)
                arcTo(55.88f, 55.88f, 0.0f, false, false, 58.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 50.45f, 53.87f)
                arcTo(37.85f, 37.85f, 0.0f, false, false, 98.0f, 192.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(72.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 8.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineTo(98.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(37.85f, 37.85f, 0.0f, false, false, -10.45f, -26.13f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 214.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcTo(55.88f, 55.88f, 0.0f, false, false, 206.13f, 75.92f)
                close()
                moveTo(202.0f, 112.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                horizontalLineTo(112.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, true, 7.3f, -23.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.81f, -5.76f)
                arcToRelative(45.85f, 45.85f, 0.0f, false, true, 1.43f, -36.42f)
                arcToRelative(45.85f, 45.85f, 0.0f, false, true, 35.23f, 21.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 119.83f, 62.0f)
                horizontalLineToRelative(32.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -2.76f)
                arcToRelative(45.83f, 45.83f, 0.0f, false, true, 35.23f, -21.11f)
                arcToRelative(45.85f, 45.85f, 0.0f, false, true, 1.43f, 36.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.79f, 5.74f)
                arcTo(43.78f, 43.78f, 0.0f, false, true, 202.0f, 104.0f)
                close()
            }
        }
        .build()
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
