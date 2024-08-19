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

public val RegularGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.91f, 149.09f)
                arcTo(71.53f, 71.53f, 0.0f, false, true, 128.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcTo(71.53f, 71.53f, 0.0f, false, true, 106.91f, 149.09f)
                close()
                moveTo(56.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 160.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(120.0f, 120.0f, 0.0f, false, false, 56.0f, 80.0f)
                close()
                moveTo(174.79f, 81.21f)
                arcTo(166.9f, 166.9f, 0.0f, false, false, 56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcTo(151.0f, 151.0f, 0.0f, false, true, 163.48f, 92.52f)
                arcTo(151.0f, 151.0f, 0.0f, false, true, 208.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(166.9f, 166.9f, 0.0f, false, false, 174.79f, 81.21f)
                close()
                moveTo(60.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 184.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
