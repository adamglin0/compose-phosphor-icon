package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Pottedplant: ImageVector
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
                lineToRelative(22.41f, -22.41f)
                arcToRelative(59.55f, 59.55f, 0.0f, false, false, 26.1f, 6.36f)
                arcToRelative(49.56f, 49.56f, 0.0f, false, false, 25.89f, -7.22f)
                curveToRelative(23.72f, -14.36f, 36.43f, -47.6f, 34.0f, -88.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveToRelative(-41.32f, -2.43f, -74.56f, 10.28f, -88.93f, 34.0f)
                curveToRelative(-9.35f, 15.45f, -9.59f, 34.11f, -0.86f, 52.0f)
                lineTo(120.0f, 124.68f)
                lineToRelative(-12.21f, -12.21f)
                curveToRelative(6.0f, -13.25f, 5.57f, -27.0f, -1.39f, -38.48f)
                curveTo(95.53f, 56.0f, 70.61f, 46.41f, 39.73f, 48.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.51f, 7.51f)
                curveTo(30.4f, 86.6f, 40.0f, 111.52f, 58.0f, 122.4f)
                arcTo(38.22f, 38.22f, 0.0f, false, false, 78.0f, 128.0f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, 18.52f, -4.19f)
                lineTo(108.69f, 136.0f)
                lineToRelative(-8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(9.59f)
                lineTo(78.8f, 219.47f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 94.42f, 232.0f)
                horizontalLineToRelative(67.17f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 15.62f, -12.53f)
                lineTo(190.42f, 160.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _pottedplant!!
    }

private var _pottedplant: ImageVector? = null
