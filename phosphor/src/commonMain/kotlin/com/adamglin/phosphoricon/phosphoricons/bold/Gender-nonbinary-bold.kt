package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Gender-nonbinary-bold`: ImageVector
    get() {
        if (`_gender-nonbinary-bold` != null) {
            return `_gender-nonbinary-bold`!!
        }
        `_gender-nonbinary-bold` = Builder(name = "Gender-nonbinary-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 93.0f)
                verticalLineTo(69.2f)
                lineToRelative(21.83f, 13.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.34f, -20.58f)
                lineTo(151.32f, 48.0f)
                lineToRelative(22.85f, -13.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, -20.58f)
                lineTo(128.0f, 34.0f)
                lineTo(94.17f, 13.71f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 81.83f, 34.29f)
                lineTo(104.68f, 48.0f)
                lineTo(81.83f, 61.71f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 94.17f, 82.29f)
                lineTo(116.0f, 69.2f)
                verticalLineTo(93.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_gender-nonbinary-bold`!!
    }

private var `_gender-nonbinary-bold`: ImageVector? = null
