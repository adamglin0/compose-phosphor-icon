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

public val ThinGroup.Dress: ImageVector
    get() {
        if (_dress != null) {
            return _dress!!
        }
        _dress = Builder(name = "Dress", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 211.27f)
                lineToRelative(-0.06f, -0.12f)
                lineToRelative(-46.41f, -98.86f)
                lineToRelative(21.68f, -34.0f)
                lineToRelative(0.0f, -0.1f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 0.0f, -12.34f)
                lineToRelative(-0.15f, -0.24f)
                lineTo(164.0f, 34.0f)
                verticalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(33.82f)
                lineToRelative(-6.13f, 7.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -43.74f, 0.0f)
                lineTo(100.0f, 33.82f)
                verticalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(34.0f)
                lineTo(69.86f, 65.59f)
                lineToRelative(-0.15f, 0.24f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 0.0f, 12.34f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, 0.05f, 0.1f)
                lineToRelative(21.68f, 34.0f)
                lineTo(45.0f, 211.15f)
                lineToRelative(-0.06f, 0.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 228.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.73f)
                close()
                moveTo(76.54f, 74.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f)
                lineTo(96.21f, 41.9f)
                lineToRelative(3.68f, 4.59f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 56.22f, 0.0f)
                lineToRelative(3.68f, -4.59f)
                lineTo(179.49f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.0f)
                lineToRelative(-21.65f, 34.0f)
                horizontalLineTo(98.19f)
                close()
                moveTo(203.33f, 218.2f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 200.0f, 220.0f)
                horizontalLineTo(56.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -3.33f, -1.8f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, -0.36f, -3.72f)
                lineTo(98.54f, 116.0f)
                horizontalLineToRelative(58.92f)
                lineToRelative(46.23f, 98.48f)
                arcTo(3.89f, 3.89f, 0.0f, false, true, 203.33f, 218.2f)
                close()
            }
        }
        .build()
        return _dress!!
    }

private var _dress: ImageVector? = null
