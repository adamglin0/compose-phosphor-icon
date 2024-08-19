package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Markdownlogo: ImageVector
    get() {
        if (_markdownlogo != null) {
            return _markdownlogo!!
        }
        _markdownlogo = Builder(name = "Markdownlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(236.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(20.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(232.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(124.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(116.0f, 113.66f)
                lineTo(90.83f, 138.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(60.0f, 113.66f)
                lineTo(60.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(52.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.83f, -2.83f)
                lineTo(88.0f, 130.34f)
                lineToRelative(29.17f, -29.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 104.0f)
                close()
                moveTo(202.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineTo(172.0f, 142.34f)
                lineTo(172.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(38.34f)
                lineToRelative(17.17f, -17.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 202.83f, 125.17f)
                close()
            }
        }
        .build()
        return _markdownlogo!!
    }

private var _markdownlogo: ImageVector? = null
