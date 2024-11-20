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

public val RegularGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.67f, 72.0f)
                lineTo(200.0f, 72.0f)
                lineTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(56.0f, 72.0f)
                lineTo(41.33f, 72.0f)
                curveTo(27.36f, 72.0f, 16.0f, 82.77f, 16.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(56.0f, 184.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(240.0f, 96.0f)
                curveTo(240.0f, 82.77f, 228.64f, 72.0f, 214.67f, 72.0f)
                close()
                moveTo(72.0f, 48.0f)
                lineTo(184.0f, 48.0f)
                lineTo(184.0f, 72.0f)
                lineTo(72.0f, 72.0f)
                close()
                moveTo(184.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                lineTo(72.0f, 160.0f)
                lineTo(184.0f, 160.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(200.0f, 168.0f)
                lineTo(200.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(32.0f, 168.0f)
                lineTo(32.0f, 96.0f)
                curveToRelative(0.0f, -4.41f, 4.19f, -8.0f, 9.33f, -8.0f)
                lineTo(214.67f, 88.0f)
                curveToRelative(5.14f, 0.0f, 9.33f, 3.59f, 9.33f, 8.0f)
                close()
                moveTo(200.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 116.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
