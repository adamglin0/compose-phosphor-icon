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

public val LightGroup.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) {
            return _flyingSaucer!!
        }
        _flyingSaucer = Builder(name = "FlyingSaucer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.69f, 214.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.38f, 3.8f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.38f, -3.8f)
                close()
                moveTo(128.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 186.0f)
                close()
                moveTo(89.9f, 186.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.59f, 3.79f)
                lineToRelative(-8.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.38f, 3.8f)
                lineToRelative(8.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 89.9f, 186.31f)
                close()
                moveTo(246.0f, 112.0f)
                curveToRelative(0.0f, 15.37f, -12.94f, 29.39f, -36.44f, 39.46f)
                curveTo(187.67f, 160.84f, 158.71f, 166.0f, 128.0f, 166.0f)
                reflectiveCurveToRelative(-59.67f, -5.16f, -81.56f, -14.54f)
                curveTo(22.94f, 141.39f, 10.0f, 127.37f, 10.0f, 112.0f)
                curveToRelative(0.0f, -21.16f, 25.06f, -39.65f, 65.59f, -48.57f)
                arcToRelative(61.85f, 61.85f, 0.0f, false, true, 105.24f, 0.09f)
                curveTo(221.1f, 72.48f, 246.0f, 90.93f, 246.0f, 112.0f)
                close()
                moveTo(78.0f, 96.84f)
                verticalLineToRelative(3.0f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.69f, 9.7f)
                arcTo(190.35f, 190.35f, 0.0f, false, false, 128.0f, 114.0f)
                arcToRelative(190.35f, 190.35f, 0.0f, false, false, 42.3f, -4.42f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.69f, -9.7f)
                lineTo(177.99f, 96.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, -50.0f, -50.0f)
                horizontalLineToRelative(-0.67f)
                curveTo(100.13f, 46.36f, 78.0f, 69.16f, 78.0f, 96.84f)
                close()
                moveTo(234.0f, 112.0f)
                curveToRelative(0.0f, -13.33f, -18.38f, -26.61f, -46.8f, -34.52f)
                arcTo(62.24f, 62.24f, 0.0f, false, true, 190.0f, 96.0f)
                verticalLineToRelative(3.92f)
                arcToRelative(21.86f, 21.86f, 0.0f, false, true, -17.0f, 21.35f)
                arcTo(202.0f, 202.0f, 0.0f, false, true, 128.0f, 126.0f)
                arcToRelative(201.89f, 201.89f, 0.0f, false, true, -45.0f, -4.73f)
                arcTo(21.86f, 21.86f, 0.0f, false, true, 66.0f, 99.92f)
                horizontalLineToRelative(0.0f)
                lineTo(66.0f, 96.85f)
                arcTo(63.0f, 63.0f, 0.0f, false, true, 69.08f, 77.4f)
                curveTo(40.49f, 85.3f, 22.0f, 98.62f, 22.0f, 112.0f)
                curveToRelative(0.0f, 10.12f, 10.63f, 20.48f, 29.17f, 28.43f)
                curveTo(71.59f, 149.18f, 98.88f, 154.0f, 128.0f, 154.0f)
                reflectiveCurveToRelative(56.41f, -4.82f, 76.83f, -13.57f)
                curveTo(223.37f, 132.48f, 234.0f, 122.12f, 234.0f, 112.0f)
                close()
            }
        }
        .build()
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
