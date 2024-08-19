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

public val LightGroup.Dress: ImageVector
    get() {
        if (_dress != null) {
            return _dress!!
        }
        _dress = Builder(name = "Dress", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.86f, 210.49f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.08f, -0.19f)
                lineToRelative(-45.94f, -97.86f)
                lineToRelative(21.08f, -33.1f)
                lineToRelative(0.09f, -0.14f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -14.4f)
                curveToRelative(-0.07f, -0.12f, -0.15f, -0.24f, -0.23f, -0.36f)
                lineTo(166.0f, 33.33f)
                verticalLineTo(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(33.12f)
                lineToRelative(-5.7f, 7.12f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -40.6f, 0.0f)
                lineTo(102.0f, 33.12f)
                verticalLineTo(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 90.0f, 8.0f)
                verticalLineTo(33.33f)
                lineTo(68.22f, 64.44f)
                curveToRelative(-0.08f, 0.12f, -0.16f, 0.24f, -0.23f, 0.36f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 14.4f)
                lineToRelative(0.09f, 0.14f)
                lineToRelative(21.08f, 33.1f)
                lineTo(43.22f, 210.3f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.08f, 0.19f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 230.0f)
                horizontalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.87f, -19.51f)
                close()
                moveTo(78.26f, 73.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.05f, -1.89f)
                lineTo(96.32f, 45.23f)
                lineToRelative(2.0f, 2.51f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 59.34f, 0.0f)
                lineToRelative(2.0f, -2.51f)
                lineToRelative(18.11f, 25.86f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 1.89f)
                lineToRelative(-21.0f, 33.0f)
                horizontalLineTo(99.29f)
                close()
                moveTo(201.66f, 217.1f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.67f, 0.9f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.87f, -2.72f)
                lineTo(99.81f, 118.0f)
                horizontalLineToRelative(56.38f)
                lineToRelative(45.67f, 97.28f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 201.66f, 217.1f)
                close()
            }
        }
        .build()
        return _dress!!
    }

private var _dress: ImageVector? = null
