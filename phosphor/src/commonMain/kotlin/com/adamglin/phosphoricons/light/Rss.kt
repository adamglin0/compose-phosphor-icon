package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.5f, 150.5f)
                arcTo(69.54f, 69.54f, 0.0f, false, true, 126.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -58.0f, -58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcTo(69.54f, 69.54f, 0.0f, false, true, 105.5f, 150.5f)
                close()
                moveTo(56.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(106.0f, 106.0f, 0.0f, false, true, 162.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(118.0f, 118.0f, 0.0f, false, false, 56.0f, 82.0f)
                close()
                moveTo(173.38f, 82.62f)
                arcTo(164.92f, 164.92f, 0.0f, false, false, 56.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(153.0f, 153.0f, 0.0f, false, true, 164.89f, 91.11f)
                arcTo(153.0f, 153.0f, 0.0f, false, true, 210.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(164.92f, 164.92f, 0.0f, false, false, 173.38f, 82.62f)
                close()
                moveTo(60.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 60.0f, 186.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
