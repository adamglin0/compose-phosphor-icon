package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Ladder-duotone`: ImageVector
    get() {
        if (`_ladder-duotone` != null) {
            return `_ladder-duotone`!!
        }
        `_ladder-duotone` = Builder(name = "Ladder-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(187.64f, 160.0f)
                horizontalLineTo(124.36f)
                lineTo(156.0f, 73.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.52f, 213.26f)
                lineTo(164.51f, 73.0f)
                lineToRelative(9.09f, -25.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(4.58f)
                lineTo(32.48f, 213.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f)
                lineTo(57.24f, 192.0f)
                horizontalLineToRelative(47.0f)
                lineToRelative(-7.74f, 21.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 104.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f)
                lineTo(130.0f, 168.0f)
                lineTo(182.0f, 168.0f)
                lineToRelative(18.45f, 50.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.52f, 213.26f)
                close()
                moveTo(127.52f, 128.0f)
                horizontalLineToRelative(-47.0f)
                lineTo(92.15f, 96.0f)
                horizontalLineToRelative(47.0f)
                close()
                moveTo(156.61f, 48.0f)
                lineTo(144.94f, 80.0f)
                lineTo(98.0f, 80.0f)
                lineTo(109.6f, 48.0f)
                close()
                moveTo(63.06f, 176.0f)
                lineTo(74.7f, 144.0f)
                horizontalLineToRelative(47.0f)
                lineTo(110.0f, 176.0f)
                close()
                moveTo(135.78f, 152.0f)
                lineTo(156.0f, 96.41f)
                lineTo(176.21f, 152.0f)
                close()
            }
        }
        .build()
        return `_ladder-duotone`!!
    }

private var `_ladder-duotone`: ImageVector? = null
