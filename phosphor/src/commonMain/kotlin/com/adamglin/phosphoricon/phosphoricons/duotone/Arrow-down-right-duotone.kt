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

public val DuotoneGroup.`Arrow-down-right-duotone`: ImageVector
    get() {
        if (`_arrow-down-right-duotone` != null) {
            return `_arrow-down-right-duotone`!!
        }
        `_arrow-down-right-duotone` = Builder(name = "Arrow-down-right-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 88.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.06f, 80.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(140.0f, 128.69f)
                lineTo(69.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 58.34f, 69.66f)
                lineTo(128.69f, 140.0f)
                lineTo(82.34f, 186.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 200.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 195.06f, 80.61f)
                close()
                moveTo(184.0f, 184.0f)
                horizontalLineTo(107.31f)
                lineToRelative(38.34f, -38.34f)
                horizontalLineToRelative(0.0f)
                lineTo(184.0f, 107.31f)
                close()
            }
        }
        .build()
        return `_arrow-down-right-duotone`!!
    }

private var `_arrow-down-right-duotone`: ImageVector? = null
