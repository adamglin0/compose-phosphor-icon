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

public val LightGroup.`Binoculars-light`: ImageVector
    get() {
        if (`_binoculars-light` != null) {
            return `_binoculars-light`!!
        }
        `_binoculars-light` = Builder(name = "Binoculars-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 147.24f)
                lineTo(191.43f, 52.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.25f, -1.83f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 55.0f)
                lineTo(146.0f, 82.0f)
                lineTo(110.0f, 82.0f)
                lineTo(110.0f, 55.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.25f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.25f, 1.83f)
                lineTo(23.0f, 147.24f)
                arcTo(46.0f, 46.0f, 0.0f, true, false, 110.0f, 168.0f)
                lineTo(110.0f, 94.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(74.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 87.0f, -20.76f)
                close()
                moveTo(64.0f, 202.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 64.0f, 202.0f)
                close()
                moveTo(64.0f, 122.0f)
                arcToRelative(45.77f, 45.77f, 0.0f, false, false, -18.55f, 3.92f)
                lineTo(75.06f, 58.54f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 57.71f)
                lineTo(98.0f, 137.0f)
                arcTo(45.89f, 45.89f, 0.0f, false, false, 64.0f, 122.0f)
                close()
                moveTo(158.0f, 57.72f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 22.94f, 0.83f)
                lineToRelative(29.61f, 67.37f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 158.0f, 137.0f)
                close()
                moveTo(192.0f, 202.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 192.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_binoculars-light`!!
    }

private var `_binoculars-light`: ImageVector? = null
