package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) {
            return _grainsSlash!!
        }
        _grainsSlash = Builder(name = "GrainsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(61.81f, 61.13f)
                arcTo(84.83f, 84.83f, 0.0f, false, false, 48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(83.82f, 83.82f, 0.0f, false, false, 61.33f, -26.6f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(71.39f, 71.68f)
                lineToRelative(70.06f, 77.06f)
                arcTo(84.23f, 84.23f, 0.0f, false, false, 128.0f, 174.41f)
                arcTo(84.17f, 84.17f, 0.0f, false, false, 52.0f, 116.1f)
                verticalLineToRelative(-48.0f)
                arcTo(75.86f, 75.86f, 0.0f, false, true, 71.39f, 71.68f)
                close()
                moveTo(124.0f, 219.9f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 52.0f, 144.0f)
                lineTo(52.0f, 124.1f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 200.0f)
                close()
                moveTo(132.0f, 219.9f)
                lineTo(132.0f, 200.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 14.94f, -45.22f)
                lineToRelative(37.0f, 40.68f)
                arcTo(75.86f, 75.86f, 0.0f, false, true, 132.0f, 219.9f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(84.32f, 84.32f, 0.0f, false, true, -3.0f, 22.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 2.94f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -1.06f, -0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.8f, -4.92f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 204.0f, 144.0f)
                lineTo(204.0f, 124.1f)
                arcToRelative(74.9f, 74.9f, 0.0f, false, false, -30.37f, 8.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.62f, -7.14f)
                arcToRelative(82.94f, 82.94f, 0.0f, false, true, 34.0f, -9.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(76.32f, 76.32f, 0.0f, false, false, -57.59f, 31.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.48f, -4.69f)
                arcToRelative(84.14f, 84.14f, 0.0f, false, true, 27.0f, -24.0f)
                curveTo(156.88f, 46.53f, 134.48f, 32.28f, 128.0f, 28.56f)
                arcToRelative(103.64f, 103.64f, 0.0f, false, false, -26.45f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.11f, -5.17f)
                arcToRelative(108.09f, 108.09f, 0.0f, false, true, 30.77f, -25.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 0.0f)
                curveToRelative(1.32f, 0.66f, 31.31f, 16.0f, 44.33f, 46.75f)
                arcTo(83.91f, 83.91f, 0.0f, false, true, 208.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
