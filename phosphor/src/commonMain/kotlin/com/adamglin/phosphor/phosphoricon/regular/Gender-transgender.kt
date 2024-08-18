package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Gender-transgender`: ImageVector
    get() {
        if (`_gender-transgender` != null) {
            return `_gender-transgender`!!
        }
        `_gender-transgender` = Builder(name = "Gender-transgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 32.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(28.69f)
                lineTo(168.0f, 76.69f)
                lineTo(149.66f, 58.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, 11.31f)
                lineTo(156.69f, 88.0f)
                lineToRelative(-15.76f, 15.76f)
                arcToRelative(71.94f, 71.94f, 0.0f, true, false, 11.32f, 11.31f)
                lineTo(168.0f, 99.33f)
                lineToRelative(18.34f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.31f)
                lineTo(179.31f, 88.0f)
                lineTo(208.0f, 59.32f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f)
                close()
                moveTo(135.6f, 199.63f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 152.0f, 160.0f)
                arcTo(56.08f, 56.08f, 0.0f, false, true, 135.6f, 199.63f)
                close()
            }
        }
        .build()
        return `_gender-transgender`!!
    }

private var `_gender-transgender`: ImageVector? = null
