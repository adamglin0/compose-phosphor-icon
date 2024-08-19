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

public val BoldGroup.Lessthan: ImageVector
    get() {
        if (_lessthan != null) {
            return _lessthan!!
        }
        _lessthan = Builder(name = "Lessthan", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.84f, 205.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.0f, 5.71f)
                lineToRelative(-152.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -21.68f)
                lineToRelative(152.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 10.27f, 21.69f)
                lineTo(76.0f, 128.0f)
                lineToRelative(129.1f, 61.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 210.84f, 205.13f)
                close()
            }
        }
        .build()
        return _lessthan!!
    }

private var _lessthan: ImageVector? = null
