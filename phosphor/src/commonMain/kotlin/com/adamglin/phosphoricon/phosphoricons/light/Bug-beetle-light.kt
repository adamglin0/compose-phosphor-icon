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

public val LightGroup.`Bug-beetle-light`: ImageVector
    get() {
        if (`_bug-beetle-light` != null) {
            return `_bug-beetle-light`!!
        }
        `_bug-beetle-light` = Builder(name = "Bug-beetle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 150.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(206.0f, 138.0f)
                lineTo(206.0f, 118.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(205.75f, 106.0f)
                arcToRelative(77.81f, 77.81f, 0.0f, false, false, -22.38f, -48.88f)
                lineToRelative(20.87f, -20.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, -8.48f)
                lineTo(174.27f, 49.25f)
                arcToRelative(77.8f, 77.8f, 0.0f, false, false, -92.53f, 0.0f)
                lineTo(60.24f, 27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(72.64f, 57.12f)
                arcTo(77.76f, 77.76f, 0.0f, false, false, 50.25f, 106.0f)
                lineTo(32.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 118.0f)
                verticalLineToRelative(20.0f)
                lineTo(32.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 150.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(78.6f, 78.6f, 0.0f, false, false, 0.66f, 10.0f)
                lineTo(32.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(53.18f, 182.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 149.64f, 0.0f)
                lineTo(224.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(205.34f, 170.0f)
                arcToRelative(78.6f, 78.6f, 0.0f, false, false, 0.66f, -10.0f)
                close()
                moveTo(128.0f, 46.0f)
                arcToRelative(66.07f, 66.07f, 0.0f, false, true, 65.71f, 60.0f)
                lineTo(62.29f, 106.0f)
                arcTo(66.07f, 66.07f, 0.0f, false, true, 128.0f, 46.0f)
                close()
                moveTo(134.0f, 225.71f)
                lineTo(134.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(81.71f)
                arcTo(66.07f, 66.07f, 0.0f, false, true, 62.0f, 160.0f)
                lineTo(62.0f, 118.0f)
                lineTo(194.0f, 118.0f)
                verticalLineToRelative(42.0f)
                arcTo(66.07f, 66.07f, 0.0f, false, true, 134.0f, 225.71f)
                close()
            }
        }
        .build()
        return `_bug-beetle-light`!!
    }

private var `_bug-beetle-light`: ImageVector? = null
