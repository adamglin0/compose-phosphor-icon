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

public val RegularGroup.Magnifyingglass: ImageVector
    get() {
        if (_magnifyingglass != null) {
            return _magnifyingglass!!
        }
        _magnifyingglass = Builder(name = "Magnifyingglass", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 218.34f)
                lineToRelative(-50.07f, -50.06f)
                arcToRelative(88.11f, 88.11f, 0.0f, true, false, -11.31f, 11.31f)
                lineToRelative(50.06f, 50.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(40.0f, 112.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 40.0f, 112.0f)
                close()
            }
        }
        .build()
        return _magnifyingglass!!
    }

private var _magnifyingglass: ImageVector? = null
