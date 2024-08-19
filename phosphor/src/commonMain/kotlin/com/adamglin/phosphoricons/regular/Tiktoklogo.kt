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

public val RegularGroup.Tiktoklogo: ImageVector
    get() {
        if (_tiktoklogo != null) {
            return _tiktoklogo!!
        }
        _tiktoklogo = Builder(name = "Tiktoklogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(128.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.57f, -18.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 130.69f)
                lineTo(96.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.4f, -7.88f)
                curveTo(50.91f, 86.48f, 24.0f, 119.1f, 24.0f, 156.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f)
                lineTo(176.0f, 116.29f)
                arcTo(103.25f, 103.25f, 0.0f, false, false, 224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 72.0f)
                close()
                moveTo(216.0f, 111.64f)
                arcToRelative(87.19f, 87.19f, 0.0f, false, true, -43.33f, -16.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 102.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                curveToRelative(0.0f, -25.9f, 16.64f, -49.13f, 40.0f, -57.6f)
                verticalLineToRelative(27.67f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 136.0f, 156.0f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(24.5f)
                arcTo(64.14f, 64.14f, 0.0f, false, false, 216.0f, 87.5f)
                close()
            }
        }
        .build()
        return _tiktoklogo!!
    }

private var _tiktoklogo: ImageVector? = null
