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

public val BoldGroup.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) {
            return _magnifyingGlass!!
        }
        _magnifyingGlass = Builder(name = "MagnifyingGlass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 215.51f)
                lineTo(185.0f, 168.0f)
                arcToRelative(92.12f, 92.12f, 0.0f, true, false, -17.0f, 17.0f)
                lineToRelative(47.53f, 47.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
                moveTo(44.0f, 112.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 44.0f, 112.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
