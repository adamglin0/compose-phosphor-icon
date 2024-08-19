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

public val LightGroup.`Lighthouse-light`: ImageVector
    get() {
        if (`_lighthouse-light` != null) {
            return `_lighthouse-light`!!
        }
        `_lighthouse-light` = Builder(name = "Lighthouse-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(187.0f, 106.0f)
                lineTo(182.0f, 55.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -3.88f)
                lineTo(137.11f, 13.37f)
                lineToRelative(-0.15f, -0.12f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -17.92f, 0.0f)
                lineToRelative(-0.15f, 0.12f)
                lineTo(76.0f, 51.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 3.88f)
                lineTo(69.0f, 106.0f)
                lineTo(54.0f, 106.0f)
                lineTo(54.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(67.75f, 118.0f)
                lineToRelative(-9.69f, 96.67f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 230.0f)
                lineTo(184.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.93f, -15.36f)
                lineTo(188.25f, 118.0f)
                lineTo(208.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 82.0f)
                close()
                moveTo(126.77f, 22.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.46f, 0.0f)
                lineToRelative(31.0f, 27.58f)
                lineTo(95.77f, 50.0f)
                close()
                moveTo(85.43f, 62.0f)
                horizontalLineToRelative(85.14f)
                lineTo(175.0f, 106.0f)
                lineTo(134.0f, 106.0f)
                lineTo(134.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                lineTo(81.0f, 106.0f)
                close()
                moveTo(185.43f, 217.35f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 184.0f, 218.0f)
                lineTo(72.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.16f)
                lineTo(74.2f, 174.0f)
                lineTo(181.8f, 174.0f)
                lineTo(186.0f, 215.81f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 185.48f, 217.35f)
                close()
                moveTo(180.6f, 162.0f)
                lineTo(75.4f, 162.0f)
                lineToRelative(4.41f, -44.0f)
                horizontalLineToRelative(96.38f)
                close()
            }
        }
        .build()
        return `_lighthouse-light`!!
    }

private var `_lighthouse-light`: ImageVector? = null
