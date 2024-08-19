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

public val FillGroup.Camerarotate: ImageVector
    get() {
        if (_camerarotate != null) {
            return _camerarotate!!
        }
        _camerarotate = Builder(name = "Camerarotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 56.0f)
                horizontalLineTo(180.28f)
                lineTo(166.65f, 35.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.65f, 3.56f)
                lineTo(75.71f, 56.0f)
                horizontalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 56.0f)
                close()
                moveTo(156.81f, 166.4f)
                arcTo(48.21f, 48.21f, 0.0f, false, true, 96.0f, 163.77f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-5.15f)
                arcToRelative(32.12f, 32.12f, 0.0f, false, false, 40.34f, 1.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.62f, 12.79f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(5.15f)
                arcToRelative(32.12f, 32.12f, 0.0f, false, false, -40.34f, -1.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 99.19f, 97.6f)
                arcTo(48.21f, 48.21f, 0.0f, false, true, 160.0f, 100.23f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _camerarotate!!
    }

private var _camerarotate: ImageVector? = null
