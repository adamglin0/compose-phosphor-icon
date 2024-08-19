package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Gender-nonbinary-light`: ImageVector
    get() {
        if (`_gender-nonbinary-light` != null) {
            return `_gender-nonbinary-light`!!
        }
        `_gender-nonbinary-light` = Builder(name = "Gender-nonbinary-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 98.27f)
                verticalLineTo(58.6f)
                lineToRelative(30.91f, 18.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, -10.28f)
                lineTo(139.66f, 48.0f)
                lineToRelative(31.43f, -18.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.18f, -10.29f)
                lineTo(128.0f, 41.0f)
                lineTo(91.09f, 18.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.18f, 10.29f)
                lineTo(116.34f, 48.0f)
                lineTo(84.91f, 66.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, 10.28f)
                lineTo(122.0f, 58.6f)
                verticalLineTo(98.27f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 58.0f, -58.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_gender-nonbinary-light`!!
    }

private var `_gender-nonbinary-light`: ImageVector? = null
