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

public val BoldGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(172.25f, 155.28f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, false, 0.0f, -54.56f)
                lineToRelative(23.0f, -23.0f)
                arcToRelative(83.84f, 83.84f, 0.0f, false, true, 0.0f, 100.56f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 128.0f)
                close()
                moveTo(178.28f, 60.75f)
                lineTo(155.28f, 83.75f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, false, -54.56f, 0.0f)
                lineToRelative(-23.0f, -23.0f)
                arcToRelative(83.84f, 83.84f, 0.0f, false, true, 100.56f, 0.0f)
                close()
                moveTo(60.75f, 77.75f)
                lineTo(83.75f, 100.75f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, false, 0.0f, 54.56f)
                lineToRelative(-23.0f, 23.0f)
                arcToRelative(83.84f, 83.84f, 0.0f, false, true, 0.0f, -100.56f)
                close()
                moveTo(77.75f, 195.28f)
                lineTo(100.75f, 172.28f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, false, 54.56f, 0.0f)
                lineToRelative(23.0f, 23.0f)
                arcToRelative(83.84f, 83.84f, 0.0f, false, true, -100.56f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
