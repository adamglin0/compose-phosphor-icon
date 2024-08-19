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

public val BoldGroup.`Beer-bottle-bold`: ImageVector
    get() {
        if (`_beer-bottle-bold` != null) {
            return `_beer-bottle-bold`!!
        }
        `_beer-bottle-bold` = Builder(name = "Beer-bottle-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.49f, 39.51f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.55f, 15.0f)
                lineTo(147.0f, 60.77f)
                lineToRelative(-37.33f, 7.46f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -6.14f, 3.28f)
                lineTo(20.2f, 154.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineTo(61.57f, 235.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineToRelative(83.32f, -83.31f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, 3.28f, -6.14f)
                lineTo(195.23f, 109.0f)
                lineToRelative(38.23f, -51.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.0f, -18.55f)
                close()
                moveTo(112.0f, 191.0f)
                lineTo(65.0f, 144.0f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(47.0f, 47.0f)
                close()
                moveTo(81.37f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -1.17f)
                lineTo(37.17f, 177.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(48.0f, 161.0f)
                lineToRelative(47.0f, 47.0f)
                lineTo(84.2f, 218.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 81.37f, 220.0f)
                close()
                moveTo(174.37f, 96.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.17f, 4.85f)
                lineTo(165.0f, 138.08f)
                lineTo(160.0f, 143.0f)
                lineTo(113.0f, 96.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(36.43f, -7.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.85f, -2.17f)
                lineToRelative(55.67f, -41.76f)
                lineToRelative(1.29f, 1.29f)
                close()
            }
        }
        .build()
        return `_beer-bottle-bold`!!
    }

private var `_beer-bottle-bold`: ImageVector? = null
