package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 152.0f)
                arcToRelative(103.93f, 103.93f, 0.0f, false, true, -5.9f, 34.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.57f, 5.37f)
                horizontalLineTo(37.46f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, true, -7.57f, -5.41f)
                arcTo(104.06f, 104.06f, 0.0f, false, true, 24.0f, 151.19f)
                curveTo(24.44f, 94.0f, 71.73f, 47.49f, 129.0f, 48.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.34f, 154.34f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, true, 20.44f, 3.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 5.11f, -15.16f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 48.49f, 160.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.43f, 168.0f)
                curveToRelative(0.29f, 0.0f, 0.59f, 0.0f, 0.89f, -0.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.07f, -8.83f)
                arcTo(64.92f, 64.92f, 0.0f, false, true, 64.0f, 152.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 128.0f, 88.0f)
                close()
                moveTo(227.74f, 101.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.24f, 7.3f)
                arcToRelative(96.27f, 96.27f, 0.0f, false, true, 5.0f, 75.71f)
                lineToRelative(-181.1f, -0.07f)
                arcTo(96.24f, 96.24f, 0.0f, false, true, 128.0f, 56.0f)
                horizontalLineToRelative(0.88f)
                arcToRelative(95.0f, 95.0f, 0.0f, false, true, 42.82f, 10.5f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 179.0f, 52.27f)
                arcTo(110.8f, 110.8f, 0.0f, false, false, 129.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(112.05f, 112.05f, 0.0f, false, false, 22.35f, 189.25f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 37.46f, 200.0f)
                lineTo(218.53f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.11f, -10.71f)
                arcToRelative(112.35f, 112.35f, 0.0f, false, false, -5.9f, -88.3f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
