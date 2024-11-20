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

public val LightGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.23f, 69.57f)
                lineTo(144.16f, 80.0f)
                lineToRelative(26.07f, 10.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.46f, 11.14f)
                lineTo(128.0f, 86.46f)
                lineTo(90.23f, 101.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.8f, -3.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.34f, -7.79f)
                lineTo(111.84f, 80.0f)
                lineTo(85.77f, 69.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.46f, -11.14f)
                lineTo(128.0f, 73.53f)
                lineToRelative(37.77f, -15.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.46f, 11.14f)
                close()
                moveTo(222.0f, 79.75f)
                curveToRelative(0.0f, 42.45f, -7.91f, 74.9f, -14.59f, 94.64f)
                curveToRelative(-8.59f, 25.41f, -20.22f, 44.74f, -31.91f, 53.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -13.94f, 1.23f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.0f, -11.69f)
                curveToRelative(-1.13f, -15.33f, -5.87f, -51.0f, -25.52f, -51.0f)
                reflectiveCurveToRelative(-24.39f, 35.64f, -25.52f, 51.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -14.0f, 13.0f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, true, -8.0f, -2.58f)
                curveToRelative(-11.69f, -8.29f, -23.32f, -27.62f, -31.91f, -53.0f)
                curveTo(41.91f, 154.65f, 34.0f, 122.2f, 34.0f, 79.75f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 88.0f, 26.0f)
                horizontalLineToRelative(80.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 222.0f, 79.75f)
                close()
                moveTo(210.0f, 79.75f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 168.0f, 38.0f)
                lineTo(88.0f, 38.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 46.0f, 79.76f)
                curveToRelative(-0.07f, 73.93f, 24.69f, 126.0f, 41.44f, 137.88f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, 1.88f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.19f, -1.71f)
                curveTo(93.46f, 176.0f, 106.77f, 154.0f, 128.0f, 154.0f)
                reflectiveCurveToRelative(34.54f, 22.0f, 37.49f, 62.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.19f, 1.71f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, 1.88f, -0.15f)
                curveTo(185.31f, 205.74f, 210.07f, 153.69f, 210.0f, 79.76f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
