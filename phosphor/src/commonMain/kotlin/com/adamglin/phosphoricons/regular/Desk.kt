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

public val RegularGroup.Desk: ImageVector
    get() {
        if (_desk != null) {
            return _desk!!
        }
        _desk = Builder(name = "Desk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 64.0f)
                lineTo(8.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(32.0f, 144.0f)
                lineTo(224.0f, 144.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(240.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(32.0f, 80.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(48.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(224.0f, 128.0f)
                lineTo(136.0f, 128.0f)
                lineTo(136.0f, 80.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(88.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 104.0f)
                close()
                moveTo(160.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(168.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 104.0f)
                close()
            }
        }
        .build()
        return _desk!!
    }

private var _desk: ImageVector? = null
