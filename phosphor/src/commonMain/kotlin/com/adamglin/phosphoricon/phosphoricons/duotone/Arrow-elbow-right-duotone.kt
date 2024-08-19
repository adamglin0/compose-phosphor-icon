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

public val DuotoneGroup.`Arrow-elbow-right-duotone`: ImageVector
    get() {
        if (`_arrow-elbow-right-duotone` != null) {
            return `_arrow-elbow-right-duotone`!!
        }
        `_arrow-elbow-right-duotone` = Builder(name = "Arrow-elbow-right-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineToRelative(72.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 72.0f)
                lineTo(160.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(184.69f, 116.0f)
                lineTo(120.0f, 180.69f)
                lineTo(29.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineTo(196.0f, 127.31f)
                lineToRelative(30.34f, 30.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 152.0f)
                lineTo(240.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 72.0f)
                close()
                moveTo(224.0f, 132.69f)
                lineTo(179.31f, 88.0f)
                lineTo(224.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_arrow-elbow-right-duotone`!!
    }

private var `_arrow-elbow-right-duotone`: ImageVector? = null
