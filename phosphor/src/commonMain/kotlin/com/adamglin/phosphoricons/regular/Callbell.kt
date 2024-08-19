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

public val RegularGroup.Callbell: ImageVector
    get() {
        if (_callbell != null) {
            return _callbell!!
        }
        _callbell = Builder(name = "Callbell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 184.0f)
                lineTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(224.0f, 152.0f)
                arcToRelative(96.12f, 96.12f, 0.0f, false, false, -88.0f, -95.66f)
                lineTo(136.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(104.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(120.0f, 56.34f)
                arcTo(96.12f, 96.12f, 0.0f, false, false, 32.0f, 152.0f)
                verticalLineToRelative(16.0f)
                lineTo(24.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(48.0f, 152.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 168.0f)
                close()
                moveTo(240.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(232.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 208.0f)
                close()
            }
        }
        .build()
        return _callbell!!
    }

private var _callbell: ImageVector? = null
