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

public val DuotoneGroup.`Tag-duotone`: ImageVector
    get() {
        if (`_tag-duotone` != null) {
            return `_tag-duotone`!!
        }
        `_tag-duotone` = Builder(name = "Tag-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(237.66f, 153.0f)
                lineTo(153.0f, 237.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(42.34f, 138.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 132.69f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(92.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineToRelative(99.32f, 99.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 153.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.31f, 136.0f)
                lineTo(144.0f, 36.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 132.69f, 32.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 36.69f, 144.0f)
                lineTo(136.0f, 243.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(84.68f, -84.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(147.31f, 232.0f)
                lineTo(48.0f, 132.69f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(84.69f)
                lineTo(232.0f, 147.31f)
                close()
                moveTo(96.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 84.0f)
                close()
            }
        }
        .build()
        return `_tag-duotone`!!
    }

private var `_tag-duotone`: ImageVector? = null
