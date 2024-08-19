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

public val BoldGroup.`Piggy-bank-bold`: ImageVector
    get() {
        if (`_piggy-bank-bold` != null) {
            return `_piggy-bank-bold`!!
        }
        `_piggy-bank-bold` = Builder(name = "Piggy-bank-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 120.0f)
                close()
                moveTo(156.0f, 64.0f)
                lineTo(116.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(256.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.54f, 28.0f)
                lineTo(213.2f, 214.73f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 194.36f, 228.0f)
                lineTo(181.64f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.84f, -13.27f)
                lineToRelative(-1.0f, -2.73f)
                lineTo(110.17f, 212.0f)
                lineToRelative(-1.0f, 2.73f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 90.36f, 228.0f)
                lineTo(77.64f, 228.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 58.8f, 214.73f)
                lineTo(46.5f, 180.28f)
                arcTo(91.63f, 91.63f, 0.0f, false, true, 25.75f, 137.8f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 24.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, true, 24.56f, -34.13f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 116.0f, 28.0f)
                lineTo(220.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(210.0f, 52.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 22.48f, 31.45f)
                lineToRelative(0.42f, 1.0f)
                arcTo(28.05f, 28.05f, 0.0f, false, true, 256.0f, 112.0f)
                close()
                moveTo(232.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-3.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.45f, -8.41f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 148.0f, 52.0f)
                lineTo(116.0f, 52.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 65.86f, 165.94f)
                arcTo(11.85f, 11.85f, 0.0f, false, true, 68.31f, 170.0f)
                lineToRelative(12.15f, 34.0f)
                horizontalLineToRelative(7.08f)
                lineToRelative(2.87f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, -8.0f)
                horizontalLineToRelative(68.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, 8.0f)
                lineToRelative(2.87f, 8.0f)
                horizontalLineToRelative(7.08f)
                lineToRelative(17.16f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return `_piggy-bank-bold`!!
    }

private var `_piggy-bank-bold`: ImageVector? = null
