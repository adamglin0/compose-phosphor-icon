package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Star-thin`: ImageVector
    get() {
        if (`_star-thin` != null) {
            return `_star-thin`!!
        }
        `_star-thin` = Builder(name = "Star-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.36f, 98.49f)
                arcTo(12.21f, 12.21f, 0.0f, false, false, 224.59f, 90.0f)
                lineToRelative(-61.47f, -5.0f)
                lineTo(139.44f, 27.67f)
                arcToRelative(12.37f, 12.37f, 0.0f, false, false, -22.88f, 0.0f)
                lineTo(92.88f, 85.0f)
                lineTo(31.41f, 90.0f)
                arcToRelative(12.45f, 12.45f, 0.0f, false, false, -7.07f, 21.84f)
                lineToRelative(46.85f, 40.41f)
                lineTo(56.87f, 212.64f)
                arcToRelative(12.35f, 12.35f, 0.0f, false, false, 18.51f, 13.49f)
                lineTo(128.0f, 193.77f)
                lineToRelative(52.62f, 32.36f)
                arcToRelative(12.12f, 12.12f, 0.0f, false, false, 13.69f, -0.51f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, false, 4.82f, -13.0f)
                lineToRelative(-14.32f, -60.42f)
                lineToRelative(46.85f, -40.41f)
                arcTo(12.29f, 12.29f, 0.0f, false, false, 235.36f, 98.49f)
                close()
                moveTo(226.43f, 105.75f)
                lineTo(177.75f, 147.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.28f, 3.95f)
                lineToRelative(14.87f, 62.79f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, true, -1.72f, 4.65f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, -4.81f, 0.18f)
                lineTo(130.1f, 185.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f)
                lineTo(71.19f, 219.32f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, -4.81f, -0.18f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, true, -1.72f, -4.65f)
                lineTo(79.53f, 151.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.28f, -3.95f)
                lineToRelative(-48.68f, -42.0f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 28.25f, 101.0f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, true, 3.81f, -3.0f)
                lineTo(96.0f, 92.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.38f, -2.46f)
                lineTo(124.0f, 30.73f)
                arcToRelative(4.35f, 4.35f, 0.0f, false, true, 8.08f, 0.0f)
                lineToRelative(24.62f, 59.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 92.79f)
                lineToRelative(63.9f, 5.15f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, true, 3.81f, 3.0f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 226.43f, 105.75f)
                close()
            }
        }
        .build()
        return `_star-thin`!!
    }

private var `_star-thin`: ImageVector? = null
