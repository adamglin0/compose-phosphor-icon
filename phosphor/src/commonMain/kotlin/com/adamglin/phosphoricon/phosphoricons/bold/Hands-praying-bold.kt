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

public val BoldGroup.`Hands-praying-bold`: ImageVector
    get() {
        if (`_hands-praying-bold` != null) {
            return `_hands-praying-bold`!!
        }
        `_hands-praying-bold` = Builder(name = "Hands-praying-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.15f, 177.18f)
                lineToRelative(-35.53f, -35.53f)
                lineTo(166.45f, 22.3f)
                arcTo(25.75f, 25.75f, 0.0f, false, false, 128.0f, 8.0f)
                arcTo(25.75f, 25.75f, 0.0f, false, false, 89.55f, 22.3f)
                lineTo(53.38f, 141.65f)
                lineTo(17.85f, 177.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(32.69f, 32.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(48.29f, -48.28f)
                curveToRelative(0.31f, -0.31f, 0.6f, -0.62f, 0.89f, -0.94f)
                curveToRelative(0.29f, 0.32f, 0.58f, 0.63f, 0.89f, 0.94f)
                lineToRelative(48.29f, 48.28f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(32.69f, -32.69f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 177.18f)
                close()
                moveTo(64.68f, 218.35f)
                lineToRelative(-27.0f, -27.0f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(27.0f, 27.0f)
                close()
                moveTo(116.0f, 158.75f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, true, -5.86f, 14.14f)
                lineTo(92.68f, 190.35f)
                lineToRelative(-27.0f, -27.0f)
                lineToRelative(6.83f, -6.83f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, -5.0f)
                lineToRelative(37.0f, -122.23f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 3.48f, 0.52f)
                close()
                moveTo(163.5f, 190.53f)
                lineTo(145.86f, 172.89f)
                arcTo(19.85f, 19.85f, 0.0f, false, true, 140.0f, 158.75f)
                verticalLineToRelative(-129.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 3.48f, -0.52f)
                lineToRelative(37.0f, 122.23f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, 5.0f)
                lineToRelative(7.6f, 7.6f)
                close()
                moveTo(191.32f, 218.35f)
                lineTo(180.47f, 207.51f)
                lineTo(208.1f, 181.07f)
                lineTo(218.35f, 191.32f)
                close()
            }
        }
        .build()
        return `_hands-praying-bold`!!
    }

private var `_hands-praying-bold`: ImageVector? = null
