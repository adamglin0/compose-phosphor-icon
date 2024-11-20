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

public val LightGroup.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) {
            return _grainsSlash!!
        }
        _grainsSlash = Builder(name = "GrainsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineToRelative(13.1f, 14.41f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 48.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, 86.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(85.8f, 85.8f, 0.0f, false, false, 61.28f, -25.67f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(70.27f, 73.42f)
                lineToRelative(68.6f, 75.45f)
                arcTo(85.9f, 85.9f, 0.0f, false, false, 128.0f, 168.5f)
                arcToRelative(86.18f, 86.18f, 0.0f, false, false, -74.0f, -54.27f)
                verticalLineToRelative(-44.0f)
                arcTo(73.11f, 73.11f, 0.0f, false, true, 70.27f, 73.42f)
                close()
                moveTo(122.0f, 217.76f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 144.0f)
                lineTo(54.0f, 126.24f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 122.0f, 200.0f)
                close()
                moveTo(134.0f, 217.76f)
                lineTo(134.0f, 200.0f)
                arcTo(74.05f, 74.05f, 0.0f, false, true, 147.12f, 158.0f)
                lineToRelative(34.06f, 37.47f)
                arcTo(73.81f, 73.81f, 0.0f, false, true, 134.0f, 217.76f)
                close()
                moveTo(214.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -3.08f, 22.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.78f, 4.41f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, true, -1.59f, -0.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -7.38f)
                arcTo(74.07f, 74.07f, 0.0f, false, false, 202.0f, 144.0f)
                lineTo(202.0f, 126.24f)
                arcTo(72.92f, 72.92f, 0.0f, false, false, 174.54f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.44f, -10.7f)
                arcToRelative(84.85f, 84.85f, 0.0f, false, true, 32.9f, -9.07f)
                verticalLineToRelative(-44.0f)
                arcToRelative(74.29f, 74.29f, 0.0f, false, false, -54.0f, 30.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.72f, -7.0f)
                arcToRelative(86.23f, 86.23f, 0.0f, false, true, 26.1f, -23.7f)
                curveToRelative(-9.65f, -21.59f, -29.26f, -34.77f, -36.41f, -39.0f)
                arcToRelative(101.52f, 101.52f, 0.0f, false, false, -24.92f, 21.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.16f, -7.75f)
                arcToRelative(110.31f, 110.31f, 0.0f, false, true, 31.4f, -25.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 0.0f)
                curveToRelative(1.33f, 0.67f, 30.79f, 15.69f, 44.49f, 45.93f)
                arcTo(85.68f, 85.68f, 0.0f, false, true, 208.0f, 58.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 64.0f)
                close()
            }
        }
        .build()
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
