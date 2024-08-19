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

public val BoldGroup.Markdownlogo: ImageVector
    get() {
        if (_markdownlogo != null) {
            return _markdownlogo!!
        }
        _markdownlogo = Builder(name = "Markdownlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 44.0f)
                lineTo(24.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 64.0f)
                lineTo(4.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(232.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 44.0f)
                close()
                moveTo(228.0f, 188.0f)
                lineTo(28.0f, 188.0f)
                lineTo(28.0f, 68.0f)
                lineTo(228.0f, 68.0f)
                close()
                moveTo(48.0f, 148.0f)
                lineTo(48.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.49f, -8.49f)
                lineTo(88.0f, 119.0f)
                lineToRelative(19.51f, -19.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(104.0f, 137.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(72.0f, 137.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(146.63f, 124.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.87f, -1.87f)
                lineToRelative(0.5f, 0.4f)
                lineTo(164.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(15.0f)
                lineToRelative(0.5f, -0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.0f, 18.74f)
                lineToRelative(-20.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineToRelative(-20.0f, -16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 146.63f, 124.5f)
                close()
            }
        }
        .build()
        return _markdownlogo!!
    }

private var _markdownlogo: ImageVector? = null
