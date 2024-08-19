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

public val BoldGroup.`Flower-tulip-bold`: ImageVector
    get() {
        if (`_flower-tulip-bold` != null) {
            return `_flower-tulip-bold`!!
        }
        `_flower-tulip-bold` = Builder(name = "Flower-tulip-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                arcToRelative(91.55f, 91.55f, 0.0f, false, false, -33.77f, 6.42f)
                curveToRelative(-15.8f, -24.4f, -39.72f, -36.58f, -40.86f, -37.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                curveToRelative(-1.14f, 0.57f, -25.06f, 12.75f, -40.86f, 37.15f)
                arcTo(91.55f, 91.55f, 0.0f, false, false, 48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 96.0f)
                arcToRelative(92.14f, 92.14f, 0.0f, false, false, 80.0f, 91.22f)
                verticalLineToRelative(25.36f)
                lineTo(85.37f, 197.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 21.46f)
                lineToRelative(48.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                lineToRelative(48.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.74f, -21.46f)
                lineTo(140.0f, 212.58f)
                lineTo(140.0f, 187.22f)
                arcTo(92.14f, 92.14f, 0.0f, false, false, 220.0f, 96.0f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(128.0f, 37.94f)
                curveToRelative(6.37f, 4.16f, 17.13f, 12.31f, 25.21f, 24.2f)
                arcTo(92.63f, 92.63f, 0.0f, false, false, 128.0f, 90.61f)
                arcToRelative(92.76f, 92.76f, 0.0f, false, false, -25.21f, -28.47f)
                curveTo(110.87f, 50.25f, 121.63f, 42.1f, 128.0f, 37.94f)
                close()
                moveTo(60.0f, 96.0f)
                lineTo(60.0f, 69.06f)
                arcTo(68.11f, 68.11f, 0.0f, false, true, 116.0f, 136.0f)
                verticalLineToRelative(26.94f)
                arcTo(68.12f, 68.12f, 0.0f, false, true, 60.0f, 96.0f)
                close()
                moveTo(196.0f, 96.0f)
                arcToRelative(68.12f, 68.12f, 0.0f, false, true, -56.0f, 66.94f)
                lineTo(140.0f, 136.0f)
                arcToRelative(68.11f, 68.11f, 0.0f, false, true, 56.0f, -66.94f)
                close()
            }
        }
        .build()
        return `_flower-tulip-bold`!!
    }

private var `_flower-tulip-bold`: ImageVector? = null
