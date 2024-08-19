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

public val BoldGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 68.0f)
                lineTo(36.0f, 68.0f)
                lineTo(36.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(12.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(36.0f, 180.0f)
                lineTo(232.0f, 180.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(256.0f, 112.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 212.0f, 68.0f)
                close()
                moveTo(100.0f, 156.0f)
                lineTo(36.0f, 156.0f)
                lineTo(36.0f, 92.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(232.0f, 156.0f)
                lineTo(124.0f, 156.0f)
                lineTo(124.0f, 92.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
