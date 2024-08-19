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

public val BoldGroup.`Medal-bold`: ImageVector
    get() {
        if (`_medal-bold` != null) {
            return `_medal-bold`!!
        }
        `_medal-bold` = Builder(name = "Medal-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 96.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 68.0f, 165.69f)
                lineTo(68.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.37f, 10.73f)
                lineTo(128.0f, 229.42f)
                lineToRelative(42.64f, 21.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 240.0f)
                lineTo(188.0f, 165.69f)
                arcTo(91.86f, 91.86f, 0.0f, false, false, 220.0f, 96.0f)
                close()
                moveTo(60.0f, 96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 60.0f, 96.0f)
                close()
                moveTo(164.0f, 220.59f)
                lineToRelative(-30.64f, -15.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineTo(92.0f, 220.58f)
                lineTo(92.0f, 180.66f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 72.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 96.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 68.0f)
                close()
            }
        }
        .build()
        return `_medal-bold`!!
    }

private var `_medal-bold`: ImageVector? = null
