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

public val LightGroup.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) {
            return _heartHalf!!
        }
        _heartHalf = Builder(name = "HeartHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.1f, 54.82f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 166.9f, 43.0f)
                curveTo(150.3f, 46.13f, 136.65f, 54.82f, 128.0f, 67.4f)
                curveTo(117.3f, 51.5f, 99.0f, 42.0f, 78.0f, 42.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                curveToRelative(0.0f, 29.2f, 18.2f, 59.59f, 54.1f, 90.31f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, 37.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 5.68f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(329.42f, 329.42f, 0.0f, false, false, 40.82f, -27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.32f, -9.51f)
                arcTo(341.88f, 341.88f, 0.0f, false, true, 134.0f, 213.56f)
                lineTo(134.0f, 81.28f)
                curveTo(140.0f, 67.5f, 152.76f, 57.88f, 169.1f, 54.82f)
                close()
                moveTo(122.0f, 213.54f)
                curveTo(97.4f, 198.51f, 30.0f, 152.7f, 30.0f, 102.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 78.0f, 54.0f)
                curveToRelative(19.87f, 0.0f, 36.62f, 10.4f, 44.0f, 27.22f)
                close()
                moveTo(232.33f, 102.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.67f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.95f, -5.34f)
                arcToRelative(47.89f, 47.89f, 0.0f, false, false, -21.05f, -34.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.68f, -10.0f)
                arcToRelative(59.85f, 59.85f, 0.0f, false, true, 26.29f, 43.23f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 232.33f, 102.0f)
                close()
                moveTo(228.67f, 138.72f)
                curveToRelative(-5.58f, 11.2f, -13.75f, 22.65f, -24.26f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.82f, -8.15f)
                curveToRelative(9.75f, -10.54f, 17.27f, -21.05f, 22.35f, -31.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.73f, 5.36f)
                close()
            }
        }
        .build()
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
