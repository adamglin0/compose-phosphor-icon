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

public val BoldGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineToRelative(4.0f, 4.37f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(195.42f, 220.0f)
                lineToRelative(3.7f, 4.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(106.23f, 121.93f)
                lineTo(136.0f, 154.64f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -29.77f, -32.75f)
                close()
                moveTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(64.51f, 76.0f)
                lineToRelative(24.92f, 27.41f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 63.34f, 69.67f)
                lineTo(173.6f, 196.0f)
                close()
                moveTo(236.0f, 80.0f)
                verticalLineToRelative(94.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(176.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, -5.34f)
                lineTo(153.57f, 52.0f)
                lineTo(102.06f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(160.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 5.34f)
                lineTo(182.42f, 52.0f)
                lineTo(208.0f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
