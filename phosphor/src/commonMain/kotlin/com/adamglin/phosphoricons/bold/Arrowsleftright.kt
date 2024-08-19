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

public val BoldGroup.Arrowsleftright: ImageVector
    get() {
        if (_arrowsleftright != null) {
            return _arrowsleftright!!
        }
        _arrowsleftright = Builder(name = "Arrowsleftright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.49f, 184.49f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(179.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(179.0f, 164.0f)
                lineToRelative(-11.52f, -11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.49f, 184.49f)
                close()
                moveTo(71.49f, 120.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(77.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(77.0f, 68.0f)
                lineTo(88.49f, 56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                close()
            }
        }
        .build()
        return _arrowsleftright!!
    }

private var _arrowsleftright: ImageVector? = null
