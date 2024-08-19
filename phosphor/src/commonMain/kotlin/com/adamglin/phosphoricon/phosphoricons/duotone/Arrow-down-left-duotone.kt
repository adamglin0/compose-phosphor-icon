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

public val DuotoneGroup.`Arrow-down-left-duotone`: ImageVector
    get() {
        if (`_arrow-down-left-duotone` != null) {
            return `_arrow-down-left-duotone`!!
        }
        `_arrow-down-left-duotone` = Builder(name = "Arrow-down-left-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 192.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.66f, 58.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(116.0f, 128.69f)
                lineTo(69.66f, 82.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 88.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(127.31f, 140.0f)
                lineToRelative(70.35f, -70.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 197.66f, 58.34f)
                close()
                moveTo(72.0f, 184.0f)
                verticalLineTo(107.31f)
                lineToRelative(38.34f, 38.34f)
                horizontalLineToRelative(0.0f)
                lineTo(148.69f, 184.0f)
                close()
            }
        }
        .build()
        return `_arrow-down-left-duotone`!!
    }

private var `_arrow-down-left-duotone`: ImageVector? = null
