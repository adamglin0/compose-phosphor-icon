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

public val ThinGroup.Magnifyingglass: ImageVector
    get() {
        if (_magnifyingglass != null) {
            return _magnifyingglass!!
        }
        _magnifyingglass = Builder(name = "Magnifyingglass", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 221.17f)
                lineToRelative(-52.7f, -52.7f)
                arcToRelative(84.1f, 84.1f, 0.0f, true, false, -5.66f, 5.66f)
                lineToRelative(52.7f, 52.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                close()
                moveTo(36.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, 76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 36.0f, 112.0f)
                close()
            }
        }
        .build()
        return _magnifyingglass!!
    }

private var _magnifyingglass: ImageVector? = null
