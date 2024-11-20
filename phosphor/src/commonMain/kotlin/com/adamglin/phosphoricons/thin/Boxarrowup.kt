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

public val ThinGroup.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) {
            return _boxArrowUp!!
        }
        _boxArrowUp = Builder(name = "BoxArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.58f, 70.21f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 219.58f, 70.21f)
                close()
                moveTo(58.47f, 44.0f)
                lineTo(197.53f, 44.0f)
                lineToRelative(12.0f, 24.0f)
                lineTo(46.47f, 68.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 76.0f)
                lineTo(212.0f, 76.0f)
                lineTo(212.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(162.83f, 133.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(132.0f, 113.66f)
                lineTo(132.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 113.66f)
                lineTo(98.83f, 138.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
