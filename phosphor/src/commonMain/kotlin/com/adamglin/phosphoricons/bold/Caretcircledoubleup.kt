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

public val BoldGroup.Caretcircledoubleup: ImageVector
    get() {
        if (_caretcircledoubleup != null) {
            return _caretcircledoubleup!!
        }
        _caretcircledoubleup = Builder(name = "Caretcircledoubleup", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 0.0f, 152.8f)
                arcTo(108.16f, 108.16f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(187.4f, 187.42f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 0.0f, -118.84f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 187.42f, 187.42f)
                close()
                moveTo(168.5f, 159.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(128.0f, 153.0f)
                lineToRelative(-23.53f, 23.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                close()
                moveTo(168.5f, 103.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                lineTo(128.0f, 97.0f)
                lineToRelative(-23.53f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                close()
            }
        }
        .build()
        return _caretcircledoubleup!!
    }

private var _caretcircledoubleup: ImageVector? = null
