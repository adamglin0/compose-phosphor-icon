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

public val RegularGroup.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, false, -6.6f, 0.55f)
                lineToRelative(-5.82f, -15.14f)
                arcTo(55.64f, 55.64f, 0.0f, false, true, 216.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(196.88f, 88.0f)
                lineTo(183.47f, 53.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 48.0f)
                lineTo(144.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.51f)
                lineToRelative(9.23f, 24.0f)
                lineTo(152.0f, 88.0f)
                curveToRelative(-18.5f, 0.0f, -33.5f, 4.31f, -43.37f, 12.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.76f, 2.07f)
                curveTo(81.29f, 97.72f, 31.13f, 77.33f, 26.71f, 75.6f)
                lineTo(21.0f, 73.36f)
                arcTo(17.74f, 17.74f, 0.0f, false, false, 16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.87f, 15.46f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.18f, 47.19f, 18.3f, 72.13f, 29.63f)
                arcToRelative(32.15f, 32.15f, 0.0f, false, false, 33.56f, -4.29f)
                curveToRelative(4.86f, -4.0f, 14.57f, -8.8f, 33.19f, -8.8f)
                horizontalLineToRelative(18.82f)
                arcToRelative(71.74f, 71.74f, 0.0f, false, false, -24.17f, 36.59f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 131.32f, 152.0f)
                lineTo(79.2f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(52.12f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, false, 30.74f, -23.1f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 26.59f, -33.72f)
                lineToRelative(5.82f, 15.13f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 216.0f, 120.0f)
                close()
                moveTo(40.0f, 168.0f)
                lineTo(62.62f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -16.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -15.58f, -42.23f)
                lineToRelative(8.11f, 21.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.94f, -5.74f)
                lineTo(215.35f, 136.0f)
                lineToRelative(0.65f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
