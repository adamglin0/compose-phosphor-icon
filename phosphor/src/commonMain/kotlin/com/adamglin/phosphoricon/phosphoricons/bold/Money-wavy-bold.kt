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

public val BoldGroup.`Money-wavy-bold`: ImageVector
    get() {
        if (`_money-wavy-bold` != null) {
            return `_money-wavy-bold`!!
        }
        `_money-wavy-bold` = Builder(name = "Money-wavy-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.36f, 56.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.63f, -0.6f)
                curveToRelative(-41.48f, 20.29f, -71.4f, 10.71f, -103.07f, 0.56f)
                curveTo(98.48f, 45.89f, 60.88f, 33.85f, 10.73f, 58.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 69.16f)
                verticalLineToRelative(120.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.27f, 10.79f)
                curveToRelative(41.48f, -20.29f, 71.4f, -10.71f, 103.07f, -0.56f)
                curveToRelative(18.83f, 6.0f, 39.08f, 12.51f, 62.24f, 12.51f)
                curveToRelative(17.66f, 0.0f, 37.0f, -3.77f, 58.69f, -14.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 252.0f, 186.84f)
                lineTo(252.0f, 66.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 246.36f, 56.55f)
                close()
                moveTo(228.0f, 179.12f)
                curveToRelative(-38.0f, 16.16f, -66.41f, 7.07f, -96.34f, -2.51f)
                curveToRelative(-18.83f, -6.0f, -39.08f, -12.52f, -62.24f, -12.52f)
                arcTo(124.86f, 124.86f, 0.0f, false, false, 28.0f, 171.24f)
                lineTo(28.0f, 76.88f)
                curveToRelative(38.0f, -16.16f, 66.41f, -7.08f, 96.34f, 2.51f)
                curveTo(153.6f, 88.76f, 186.29f, 99.23f, 228.0f, 84.76f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
                moveTo(64.0f, 100.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                lineTo(40.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                close()
                moveTo(192.0f, 156.0f)
                lineTo(192.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_money-wavy-bold`!!
    }

private var `_money-wavy-bold`: ImageVector? = null
