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

public val BoldGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.45f, 69.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.51f, 1.0f)
                lineTo(212.0f, 88.43f)
                verticalLineTo(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(123.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(188.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.46f, 9.33f)
                curveToRelative(0.15f, 0.13f, 0.31f, 0.25f, 0.48f, 0.38f)
                lineToRelative(44.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 256.0f, 176.0f)
                verticalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 249.45f, 69.31f)
                close()
                moveTo(232.0f, 152.43f)
                lineToRelative(-20.0f, -14.54f)
                verticalLineTo(118.11f)
                lineToRelative(20.0f, -14.54f)
                close()
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(42.69f, 52.0f)
                horizontalLineTo(32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(180.87f)
                lineToRelative(18.25f, 20.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(36.0f, 180.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(64.51f)
                lineToRelative(94.55f, 104.0f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
