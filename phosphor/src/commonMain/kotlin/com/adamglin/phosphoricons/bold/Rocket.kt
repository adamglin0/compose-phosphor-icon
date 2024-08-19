package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 228.0f)
                close()
                moveTo(128.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 116.0f)
                close()
                moveTo(227.53f, 156.7f)
                lineTo(215.17f, 212.33f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.88f, 14.53f)
                arcTo(20.16f, 20.16f, 0.0f, false, true, 195.6f, 228.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, true, -12.29f, -4.27f)
                lineTo(157.17f, 204.0f)
                lineTo(98.83f, 204.0f)
                lineTo(72.69f, 223.74f)
                arcTo(19.87f, 19.87f, 0.0f, false, true, 60.4f, 228.0f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, true, -6.69f, -1.15f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.88f, -14.53f)
                lineTo(28.47f, 156.7f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 4.16f, -17.14f)
                lineToRelative(27.83f, -33.4f)
                arcTo(127.0f, 127.0f, 0.0f, false, true, 69.11f, 69.7f)
                curveToRelative(13.27f, -33.25f, 37.0f, -54.1f, 46.64f, -61.52f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 24.5f, 0.0f)
                curveToRelative(9.6f, 7.42f, 33.37f, 28.27f, 46.64f, 61.52f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, true, 8.65f, 36.46f)
                lineToRelative(27.83f, 33.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 227.53f, 156.7f)
                close()
                moveTo(101.79f, 180.0f)
                horizontalLineToRelative(52.42f)
                curveToRelative(19.51f, -35.7f, 23.0f, -69.78f, 10.39f, -101.4f)
                curveTo(154.4f, 53.0f, 136.2f, 35.9f, 128.0f, 29.12f)
                curveTo(119.8f, 35.9f, 101.6f, 53.0f, 91.4f, 78.6f)
                curveTo(78.78f, 110.22f, 82.28f, 144.3f, 101.79f, 180.0f)
                close()
                moveTo(79.24f, 188.72f)
                arcToRelative(168.0f, 168.0f, 0.0f, false, true, -16.92f, -47.3f)
                lineToRelative(-10.0f, 12.0f)
                lineToRelative(10.58f, 47.64f)
                close()
                moveTo(203.67f, 153.41f)
                lineTo(193.67f, 141.41f)
                arcToRelative(168.0f, 168.0f, 0.0f, false, true, -16.92f, 47.3f)
                lineToRelative(16.33f, 12.33f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
