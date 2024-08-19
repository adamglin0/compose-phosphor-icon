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

public val BoldGroup.Pottedplant: ImageVector
    get() {
        if (_pottedplant != null) {
            return _pottedplant!!
        }
        _pottedplant = Builder(name = "Pottedplant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 144.0f)
                horizontalLineTo(129.0f)
                lineToRelative(21.24f, -21.25f)
                arcToRelative(60.11f, 60.11f, 0.0f, false, false, 24.0f, 5.22f)
                arcToRelative(51.69f, 51.69f, 0.0f, false, false, 27.0f, -7.54f)
                curveToRelative(24.0f, -14.57f, 37.0f, -47.79f, 34.54f, -88.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.27f, -11.27f)
                curveToRelative(-41.09f, -2.41f, -74.31f, 10.49f, -88.87f, 34.54f)
                curveToRelative(-9.24f, 15.24f, -10.0f, 33.4f, -2.33f, 51.0f)
                lineTo(120.0f, 119.0f)
                lineToRelative(-11.14f, -11.13f)
                curveToRelative(4.94f, -12.89f, 4.0f, -26.12f, -2.76f, -37.36f)
                curveTo(95.0f, 52.25f, 70.12f, 42.4f, 39.49f, 44.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.21f, 55.48f)
                curveToRelative(-1.8f, 30.64f, 8.0f, 55.54f, 26.32f, 66.61f)
                arcToRelative(40.27f, 40.27f, 0.0f, false, false, 21.0f, 5.9f)
                arcToRelative(45.58f, 45.58f, 0.0f, false, false, 16.31f, -3.13f)
                lineTo(103.0f, 136.0f)
                lineToRelative(-8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.27f)
                lineToRelative(11.63f, 52.34f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 94.42f, 236.0f)
                horizontalLineToRelative(67.17f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, false, 19.52f, -15.66f)
                lineTo(192.74f, 168.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(156.1f, 67.26f)
                curveTo(164.8f, 52.89f, 185.29f, 44.5f, 212.0f, 44.0f)
                curveToRelative(-0.48f, 26.69f, -8.87f, 47.18f, -23.25f, 55.89f)
                curveToRelative(-9.43f, 5.71f, -20.45f, 5.48f, -32.0f, -0.62f)
                curveTo(150.61f, 87.71f, 150.39f, 76.69f, 156.1f, 67.26f)
                close()
                moveTo(85.51f, 101.5f)
                curveToRelative(-5.23f, 2.53f, -12.0f, 4.0f, -18.54f, 0.07f)
                curveToRelative(-8.47f, -5.13f, -13.81f, -17.48f, -14.8f, -33.4f)
                curveToRelative(15.93f, 1.0f, 28.27f, 6.32f, 33.4f, 14.79f)
                curveTo(89.51f, 89.48f, 88.0f, 96.27f, 85.51f, 101.5f)
                close()
                moveTo(158.38f, 212.0f)
                horizontalLineTo(97.62f)
                lineToRelative(-9.77f, -44.0f)
                horizontalLineToRelative(80.31f)
                close()
            }
        }
        .build()
        return _pottedplant!!
    }

private var _pottedplant: ImageVector? = null
