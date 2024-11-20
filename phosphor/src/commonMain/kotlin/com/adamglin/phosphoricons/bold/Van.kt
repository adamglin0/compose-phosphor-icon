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

public val BoldGroup.Van: ImageVector
    get() {
        if (_van != null) {
            return _van!!
        }
        _van = Builder(name = "Van", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.11f, 104.18f)
                lineTo(207.54f, 51.09f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 192.26f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(46.06f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                horizontalLineToRelative(40.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                lineTo(236.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(256.0f, 112.0f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 253.11f, 104.18f)
                close()
                moveTo(217.89f, 100.0f)
                lineTo(176.0f, 100.0f)
                lineTo(176.0f, 68.0f)
                horizontalLineToRelative(14.42f)
                close()
                moveTo(104.0f, 100.0f)
                lineTo(104.0f, 68.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(80.0f, 68.0f)
                verticalLineToRelative(32.0f)
                lineTo(36.0f, 100.0f)
                lineTo(36.0f, 68.0f)
                close()
                moveTo(80.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 196.0f)
                close()
                moveTo(188.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 196.0f)
                close()
                moveTo(221.94f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(113.94f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(36.0f, 172.0f)
                lineTo(36.0f, 124.0f)
                lineTo(232.0f, 124.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _van!!
    }

private var _van: ImageVector? = null
