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

public val ThinGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.83f, 58.81f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.65f)
                close()
                moveTo(53.37f, 98.62f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 76.0f, 108.0f)
                arcTo(31.82f, 31.82f, 0.0f, false, true, 53.37f, 98.62f)
                close()
                moveTo(52.0f, 76.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 7.0f, -17.0f)
                arcTo(23.85f, 23.85f, 0.0f, false, false, 52.0f, 76.0f)
                close()
                moveTo(212.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -9.37f, -22.63f)
                arcTo(31.82f, 31.82f, 0.0f, false, true, 212.0f, 180.0f)
                close()
                moveTo(204.0f, 180.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -7.0f, 17.0f)
                arcTo(23.89f, 23.89f, 0.0f, false, false, 204.0f, 180.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
