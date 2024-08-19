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

public val DuotoneGroup.`Arrow-up-right-duotone`: ImageVector
    get() {
        if (`_arrow-up-right-duotone` != null) {
            return `_arrow-up-right-duotone`!!
        }
        `_arrow-up-right-duotone` = Builder(name = "Arrow-up-right-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 64.0f)
                verticalLineTo(168.0f)
                lineTo(88.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 56.0f)
                lineTo(88.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(128.69f, 116.0f)
                lineTo(58.34f, 186.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(140.0f, 127.31f)
                lineToRelative(46.34f, 46.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 168.0f)
                lineTo(200.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 56.0f)
                close()
                moveTo(184.0f, 148.69f)
                lineTo(145.66f, 110.35f)
                horizontalLineToRelative(0.0f)
                lineTo(107.31f, 72.0f)
                lineTo(184.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_arrow-up-right-duotone`!!
    }

private var `_arrow-up-right-duotone`: ImageVector? = null
