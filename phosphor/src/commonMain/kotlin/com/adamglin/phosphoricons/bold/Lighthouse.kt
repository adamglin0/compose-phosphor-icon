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

public val BoldGroup.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(192.87f)
                lineToRelative(-4.93f, -49.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 47.0f)
                lineTo(141.1f, 8.89f)
                lineToRelative(-0.3f, -0.25f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -25.6f, 0.0f)
                lineToRelative(-0.3f, 0.25f)
                lineTo(72.0f, 47.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 7.76f)
                lineTo(63.13f, 104.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(60.72f)
                lineToRelative(-8.63f, 86.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 236.0f)
                horizontalLineTo(184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.9f, -21.95f)
                lineTo(195.28f, 128.0f)
                horizontalLineTo(220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 84.0f)
                close()
                moveTo(128.0f, 29.36f)
                lineTo(144.46f, 44.0f)
                horizontalLineTo(111.54f)
                close()
                moveTo(90.86f, 68.0f)
                horizontalLineToRelative(74.28f)
                lineToRelative(3.61f, 36.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(87.25f)
                close()
                moveTo(76.42f, 212.0f)
                lineToRelative(3.21f, -32.0f)
                horizontalLineToRelative(96.74f)
                lineToRelative(3.21f, 32.0f)
                close()
                moveTo(174.0f, 156.0f)
                horizontalLineTo(82.0f)
                lineToRelative(2.8f, -28.0f)
                horizontalLineToRelative(86.32f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
