package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Box-arrow-down-thin`: ImageVector
    get() {
        if (`_box-arrow-down-thin` != null) {
            return `_box-arrow-down-thin`!!
        }
        `_box-arrow-down-thin` = Builder(name = "Box-arrow-down-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(162.83f, 149.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(124.0f, 174.34f)
                lineTo(124.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(70.34f)
                lineToRelative(25.17f, -25.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 162.83f, 149.17f)
                close()
            }
        }
        .build()
        return `_box-arrow-down-thin`!!
    }

private var `_box-arrow-down-thin`: ImageVector? = null
