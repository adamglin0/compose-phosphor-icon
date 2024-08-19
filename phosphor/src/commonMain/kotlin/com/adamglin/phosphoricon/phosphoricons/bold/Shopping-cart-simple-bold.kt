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

public val BoldGroup.`Shopping-cart-simple-bold`: ImageVector
    get() {
        if (`_shopping-cart-simple-bold` != null) {
            return `_shopping-cart-simple-bold`!!
        }
        `_shopping-cart-simple-bold` = Builder(name = "Shopping-cart-simple-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.55f, 64.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 60.0f)
                lineTo(60.23f, 60.0f)
                lineTo(51.56f, 28.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(30.88f, 44.0f)
                lineToRelative(34.3f, 123.49f)
                arcToRelative(28.09f, 28.09f, 0.0f, false, false, 27.0f, 20.51f)
                lineTo(191.0f, 188.0f)
                arcToRelative(28.09f, 28.09f, 0.0f, false, false, 27.0f, -20.51f)
                lineToRelative(25.63f, -92.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 241.55f, 64.74f)
                close()
                moveTo(194.8f, 161.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 191.0f, 164.0f)
                lineTo(92.16f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.85f, -2.93f)
                lineTo(66.9f, 84.0f)
                lineTo(216.21f, 84.0f)
                close()
                moveTo(108.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 220.0f)
                close()
                moveTo(212.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_shopping-cart-simple-bold`!!
    }

private var `_shopping-cart-simple-bold`: ImageVector? = null
