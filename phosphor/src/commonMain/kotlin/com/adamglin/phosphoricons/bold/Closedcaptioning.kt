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

public val BoldGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                close()
                moveTo(52.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 66.0f, -38.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 20.78f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 34.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 20.77f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 52.0f, 128.0f)
                close()
                moveTo(132.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 66.0f, -38.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 20.78f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 34.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 20.77f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 132.0f, 128.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
