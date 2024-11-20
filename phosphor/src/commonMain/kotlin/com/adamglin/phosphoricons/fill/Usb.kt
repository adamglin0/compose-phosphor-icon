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

public val FillGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, 3.33f)
                lineToRelative(-48.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 160.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 56.0f)
                horizontalLineToRelative(37.17f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, 16.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(196.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.22f, -3.33f)
                lineToRelative(48.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
