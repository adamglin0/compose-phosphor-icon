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

public val DuotoneGroup.`Arrow-line-down-left-duotone`: ImageVector
    get() {
        if (`_arrow-line-down-left-duotone` != null) {
            return `_arrow-line-down-left-duotone`!!
        }
        `_arrow-line-down-left-duotone` = Builder(name = "Arrow-line-down-left-duotone",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 208.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(189.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineTo(131.31f, 160.0f)
                lineToRelative(42.35f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 216.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(120.0f, 148.69f)
                lineToRelative(58.34f, -58.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 90.34f)
                close()
                moveTo(148.69f, 200.0f)
                lineToRelative(-34.34f, -34.34f)
                horizontalLineToRelative(0.0f)
                lineTo(80.0f, 131.31f)
                verticalLineTo(200.0f)
                close()
            }
        }
        .build()
        return `_arrow-line-down-left-duotone`!!
    }

private var `_arrow-line-down-left-duotone`: ImageVector? = null
