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

public val ThinGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(195.79f, 190.13f)
                lineTo(161.79f, 156.13f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, false, 0.0f, -56.28f)
                lineToRelative(34.0f, -34.0f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, 0.0f, 124.26f)
                close()
                moveTo(92.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 128.0f)
                close()
                moveTo(190.13f, 60.21f)
                lineTo(156.13f, 94.21f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, false, -56.28f, 0.0f)
                lineToRelative(-34.0f, -34.0f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, 124.26f, 0.0f)
                close()
                moveTo(60.21f, 65.87f)
                lineToRelative(34.0f, 34.0f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, false, 0.0f, 56.28f)
                lineToRelative(-34.0f, 34.0f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, 0.0f, -124.26f)
                close()
                moveTo(65.87f, 195.79f)
                lineTo(99.87f, 161.79f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, false, 56.28f, 0.0f)
                lineToRelative(34.0f, 34.0f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, -124.26f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
