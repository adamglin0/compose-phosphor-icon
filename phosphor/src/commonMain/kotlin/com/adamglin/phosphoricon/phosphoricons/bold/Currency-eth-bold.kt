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

public val BoldGroup.`Currency-eth-bold`: ImageVector
    get() {
        if (`_currency-eth-bold` != null) {
            return `_currency-eth-bold`!!
        }
        `_currency-eth-bold` = Builder(name = "Currency-eth-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.44f, 120.59f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.88f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 14.82f)
                lineToRelative(0.6f, 0.76f)
                arcToRelative(3.72f, 3.72f, 0.0f, false, false, 0.44f, 0.56f)
                lineToRelative(87.0f, 110.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.88f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 225.44f, 120.59f)
                close()
                moveTo(140.0f, 50.7f)
                lineToRelative(57.12f, 72.7f)
                lineToRelative(-57.12f, 26.0f)
                close()
                moveTo(116.0f, 149.36f)
                lineTo(58.88f, 123.36f)
                lineTo(116.0f, 50.7f)
                close()
                moveTo(116.0f, 175.73f)
                lineTo(116.0f, 205.3f)
                lineToRelative(-36.15f, -46.0f)
                close()
                moveTo(140.0f, 175.73f)
                lineTo(176.15f, 159.3f)
                lineTo(140.0f, 205.3f)
                close()
            }
        }
        .build()
        return `_currency-eth-bold`!!
    }

private var `_currency-eth-bold`: ImageVector? = null
