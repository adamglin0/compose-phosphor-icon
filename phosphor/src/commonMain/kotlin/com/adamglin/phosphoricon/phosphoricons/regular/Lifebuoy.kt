package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(167.1f, 155.79f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, false, 0.0f, -55.58f)
                lineToRelative(28.5f, -28.49f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, 0.0f, 112.56f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 128.0f)
                close()
                moveTo(184.28f, 60.4f)
                lineTo(155.79f, 88.9f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, false, -55.58f, 0.0f)
                lineTo(71.72f, 60.4f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, 112.56f, 0.0f)
                close()
                moveTo(60.4f, 71.72f)
                lineToRelative(28.5f, 28.49f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, false, 0.0f, 55.58f)
                lineTo(60.4f, 184.28f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, 0.0f, -112.56f)
                close()
                moveTo(71.72f, 195.6f)
                lineToRelative(28.49f, -28.5f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, false, 55.58f, 0.0f)
                lineToRelative(28.49f, 28.5f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, -112.56f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
