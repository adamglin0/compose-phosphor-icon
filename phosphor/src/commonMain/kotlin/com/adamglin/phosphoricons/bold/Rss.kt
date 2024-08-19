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

public val BoldGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.74f, 146.26f)
                arcTo(75.53f, 75.53f, 0.0f, false, true, 132.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, -52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcTo(75.51f, 75.51f, 0.0f, false, true, 109.74f, 146.26f)
                close()
                moveTo(56.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 156.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 56.0f, 76.0f)
                close()
                moveTo(177.62f, 78.38f)
                arcTo(170.85f, 170.85f, 0.0f, false, false, 56.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcTo(147.0f, 147.0f, 0.0f, false, true, 160.65f, 95.35f)
                arcTo(147.0f, 147.0f, 0.0f, false, true, 204.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcTo(170.85f, 170.85f, 0.0f, false, false, 177.62f, 78.38f)
                close()
                moveTo(60.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 60.0f, 180.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
