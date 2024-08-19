package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Pottedplant: ImageVector
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
                horizontalLineToRelative(-76.7f)
                lineToRelative(2.35f, -2.35f)
                horizontalLineToRelative(0.0f)
                lineToRelative(20.06f, -20.06f)
                arcToRelative(59.55f, 59.55f, 0.0f, false, false, 26.1f, 6.36f)
                arcToRelative(49.56f, 49.56f, 0.0f, false, false, 25.89f, -7.22f)
                curveToRelative(23.72f, -14.36f, 36.43f, -47.6f, 34.0f, -88.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveToRelative(-41.32f, -2.42f, -74.56f, 10.28f, -88.92f, 34.0f)
                curveToRelative(-9.36f, 15.45f, -9.6f, 34.11f, -0.87f, 52.0f)
                lineTo(120.0f, 124.68f)
                lineToRelative(-12.21f, -12.21f)
                curveToRelative(6.0f, -13.25f, 5.57f, -27.0f, -1.39f, -38.48f)
                curveTo(95.53f, 56.0f, 70.61f, 46.41f, 39.73f, 48.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.51f, 7.51f)
                curveTo(30.4f, 86.6f, 40.0f, 111.52f, 58.0f, 122.4f)
                arcTo(38.22f, 38.22f, 0.0f, false, false, 78.0f, 128.0f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, 18.52f, -4.19f)
                lineTo(108.68f, 136.0f)
                lineToRelative(-8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(9.59f)
                lineToRelative(13.21f, 59.47f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 94.42f, 232.0f)
                horizontalLineToRelative(67.17f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 15.62f, -12.53f)
                lineTo(190.42f, 160.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(149.0f, 66.58f)
                curveToRelative(10.46f, -17.26f, 35.24f, -27.0f, 67.0f, -26.57f)
                curveToRelative(0.41f, 31.81f, -9.31f, 56.58f, -26.57f, 67.0f)
                curveToRelative(-11.51f, 7.0f, -25.4f, 6.54f, -39.28f, -1.18f)
                curveTo(142.42f, 92.0f, 142.0f, 78.09f, 149.0f, 66.58f)
                close()
                moveTo(92.11f, 108.11f)
                curveToRelative(-9.2f, 4.93f, -18.31f, 5.16f, -25.83f, 0.6f)
                curveTo(54.78f, 101.74f, 48.15f, 85.31f, 48.0f, 64.0f)
                curveToRelative(21.31f, 0.15f, 37.75f, 6.78f, 44.71f, 18.28f)
                curveTo(97.27f, 89.8f, 97.0f, 98.91f, 92.11f, 108.11f)
                close()
                moveTo(161.59f, 216.0f)
                horizontalLineTo(94.42f)
                lineTo(82.0f, 160.0f)
                horizontalLineTo(174.0f)
                close()
            }
        }
        .build()
        return _pottedplant!!
    }

private var _pottedplant: ImageVector? = null
