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

public val LightGroup.`Basket-light`: ImageVector
    get() {
        if (`_basket-light` != null) {
            return `_basket-light`!!
        }
        `_basket-light` = Builder(name = "Basket-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(174.83f, 119.4f)
                lineTo(169.23f, 175.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.6f, 182.0f)
                lineToRelative(0.61f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.4f)
                lineToRelative(5.6f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.94f, -1.2f)
                close()
                moveTo(81.17f, 119.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.94f, 1.2f)
                lineToRelative(5.6f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 5.4f)
                lineToRelative(0.61f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.37f, -6.57f)
                close()
                moveTo(238.0f, 88.79f)
                lineTo(222.87f, 201.85f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 209.0f, 214.0f)
                lineTo(47.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.87f, -12.15f)
                lineTo(18.05f, 88.79f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 82.0f)
                lineTo(69.28f, 82.0f)
                lineToRelative(54.2f, -61.95f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.0f, 0.0f)
                lineToRelative(54.2f, 62.0f)
                lineTo(232.0f, 82.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 88.79f)
                close()
                moveTo(85.22f, 82.0f)
                horizontalLineToRelative(85.56f)
                lineTo(128.0f, 33.11f)
                close()
                moveTo(225.15f, 94.0f)
                lineTo(30.85f, 94.0f)
                lineTo(45.0f, 200.26f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 47.0f, 202.0f)
                lineTo(209.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.74f)
                close()
            }
        }
        .build()
        return `_basket-light`!!
    }

private var `_basket-light`: ImageVector? = null
