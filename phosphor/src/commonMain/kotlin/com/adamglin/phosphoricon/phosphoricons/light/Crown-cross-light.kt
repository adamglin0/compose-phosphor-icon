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

public val LightGroup.`Crown-cross-light`: ImageVector
    get() {
        if (`_crown-cross-light` != null) {
            return `_crown-cross-light`!!
        }
        `_crown-cross-light` = Builder(name = "Crown-cross-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 58.0f)
                curveToRelative(-19.15f, 0.0f, -35.57f, 7.79f, -46.0f, 20.32f)
                lineTo(134.0f, 38.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 26.0f)
                lineTo(134.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 26.0f)
                lineTo(104.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 78.32f)
                curveTo(111.57f, 65.79f, 95.15f, 58.0f, 76.0f, 58.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                curveToRelative(0.0f, 29.11f, 14.17f, 47.62f, 26.05f, 58.0f)
                arcToRelative(87.74f, 87.74f, 0.0f, false, false, 22.0f, 14.0f)
                lineTo(66.05f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.05f, 188.05f)
                arcTo(87.74f, 87.74f, 0.0f, false, false, 212.0f, 174.0f)
                curveToRelative(11.88f, -10.39f, 26.05f, -28.9f, 26.05f, -58.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 180.0f, 58.0f)
                close()
                moveTo(182.1f, 178.31f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 178.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(80.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(78.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.1f, -5.69f)
                curveTo(73.46f, 178.16f, 30.0f, 163.13f, 30.0f, 116.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, true, 76.0f, 70.0f)
                curveToRelative(26.65f, 0.0f, 46.0f, 17.66f, 46.0f, 42.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 112.0f)
                curveToRelative(0.0f, -24.34f, 19.35f, -42.0f, 46.0f, -42.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f)
                curveTo(226.0f, 162.9f, 183.88f, 177.71f, 182.1f, 178.31f)
                close()
            }
        }
        .build()
        return `_crown-cross-light`!!
    }

private var `_crown-cross-light`: ImageVector? = null
