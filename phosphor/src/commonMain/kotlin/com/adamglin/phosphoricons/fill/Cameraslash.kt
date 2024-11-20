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

public val FillGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.52f, 24.52f, 0.0f, false, true, -0.45f, 4.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.9f, 2.0f)
                lineTo(86.0f, 46.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.37f, -4.91f)
                lineToRelative(3.74f, -5.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f)
                lineTo(180.28f, 56.0f)
                horizontalLineTo(208.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(197.19f, 216.0f)
                horizontalLineTo(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 56.0f)
                horizontalLineToRelative(3.73f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(148.0f, 161.92f)
                lineToRelative(-47.88f, -52.68f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 148.0f, 161.92f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
