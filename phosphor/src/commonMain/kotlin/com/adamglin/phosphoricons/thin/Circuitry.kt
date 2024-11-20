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

public val ThinGroup.Circuitry: ImageVector
    get() {
        if (_circuitry != null) {
            return _circuitry!!
        }
        _circuitry = Builder(name = "Circuitry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(88.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 156.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(84.0f, 44.0f)
                lineTo(84.0f, 148.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(92.0f, 105.66f)
                lineToRelative(56.0f, 56.0f)
                lineTo(148.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(156.0f, 212.0f)
                lineTo(156.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineTo(92.0f, 94.34f)
                lineTo(92.0f, 44.0f)
                horizontalLineToRelative(40.0f)
                lineTo(132.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f)
                lineTo(151.33f, 93.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 157.0f, 87.33f)
                lineToRelative(-17.0f, -17.0f)
                lineTo(140.0f, 44.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(168.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 92.0f)
                close()
            }
        }
        .build()
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
