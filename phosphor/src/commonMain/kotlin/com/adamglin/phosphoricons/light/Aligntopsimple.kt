package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) {
            return _alignTopSimple!!
        }
        _alignTopSimple = Builder(name = "AlignTopSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(200.0f, 26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 32.0f)
                close()
                moveTo(174.0f, 72.0f)
                lineTo(174.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(96.0f, 238.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(82.0f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 96.0f, 58.0f)
                horizontalLineToRelative(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 174.0f, 72.0f)
                close()
                moveTo(162.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(96.0f, 70.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(94.0f, 224.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
