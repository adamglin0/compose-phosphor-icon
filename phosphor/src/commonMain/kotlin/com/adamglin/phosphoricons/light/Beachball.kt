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

public val LightGroup.BeachBall: ImageVector
    get() {
        if (_beachBall != null) {
            return _beachBall!!
        }
        _beachBall = Builder(name = "BeachBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(213.0f, 98.45f)
                arcToRelative(197.9f, 197.9f, 0.0f, false, false, -46.09f, -9.37f)
                arcTo(197.9f, 197.9f, 0.0f, false, false, 157.55f, 43.0f)
                arcTo(90.47f, 90.47f, 0.0f, false, true, 213.0f, 98.45f)
                close()
                moveTo(143.52f, 39.34f)
                arcToRelative(186.57f, 186.57f, 0.0f, false, true, 10.11f, 39.0f)
                arcTo(198.45f, 198.45f, 0.0f, false, false, 95.15f, 44.21f)
                arcToRelative(90.17f, 90.17f, 0.0f, false, true, 48.37f, -4.87f)
                close()
                moveTo(80.15f, 51.81f)
                arcTo(186.09f, 186.09f, 0.0f, false, true, 147.0f, 88.47f)
                arcToRelative(198.32f, 198.32f, 0.0f, false, false, -108.92f, 35.0f)
                arcTo(90.05f, 90.05f, 0.0f, false, true, 80.15f, 51.81f)
                close()
                moveTo(38.55f, 138.0f)
                arcToRelative(186.16f, 186.16f, 0.0f, false, true, 117.0f, -37.46f)
                arcToRelative(186.16f, 186.16f, 0.0f, false, true, -37.46f, 117.0f)
                arcTo(90.18f, 90.18f, 0.0f, false, true, 38.55f, 138.0f)
                close()
                moveTo(132.55f, 217.94f)
                arcToRelative(198.33f, 198.33f, 0.0f, false, false, 35.0f, -108.93f)
                arcToRelative(186.21f, 186.21f, 0.0f, false, true, 36.66f, 66.89f)
                arcTo(90.05f, 90.05f, 0.0f, false, true, 132.55f, 217.89f)
                close()
                moveTo(211.79f, 160.94f)
                arcToRelative(198.45f, 198.45f, 0.0f, false, false, -34.11f, -58.48f)
                arcToRelative(186.57f, 186.57f, 0.0f, false, true, 39.0f, 10.11f)
                arcToRelative(90.17f, 90.17f, 0.0f, false, true, -4.87f, 48.37f)
                close()
            }
        }
        .build()
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
